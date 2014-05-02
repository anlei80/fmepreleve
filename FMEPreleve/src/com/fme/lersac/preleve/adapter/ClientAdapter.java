package com.fme.lersac.preleve.adapter;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fmepreleve.R;
import com.fme.lersac.preleve.model.ClientView;
import com.fme.lersac.preleve.model.PersonnelView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ClientAdapter extends ArrayAdapter<ClientView> {

	private static final String url = "http://www.fme-lersac.com/fmeIntranet/seam/resource/rest/preleve/client/";
	
	private Context context;
	
	private Gson gson;
	
	private List<ClientView> cList;
	
	public ClientAdapter(Context context, int resource, 
			List<ClientView> objects) {
		super(context, resource, objects);
		this.context = context;
		gson = new Gson();
	}


	@Override
	public Filter getFilter() {
		return clientFilter;
	}
	

	
	Filter clientFilter = new Filter() {

		@Override
		protected FilterResults performFiltering(CharSequence constraint) {
			if (constraint != null) {
				String requestUrl = url + constraint;
				
				RequestQueue queue = Volley.newRequestQueue(context);
				
				StringRequest request = new StringRequest(Request.Method.GET, requestUrl,
						new Response.Listener<String>() {

							@Override
							public void onResponse(String response) {
								// TODO Auto-generated method stub
								Log.i("Reponse ", response.toString());
								Type collectionType = new TypeToken<Collection<ClientView>>(){}.getType();
								cList = gson.fromJson(response.toString(), collectionType);
								
								for (ClientView c : cList) {
									Log.i("Nom ", c.getRaisonSocial());
									//list.add(p.getNom() + " " + p.getPrenom());
								}
								

								
							}},
							new Response.ErrorListener() {

								@Override
								public void onErrorResponse(VolleyError error) {
									// TODO Auto-generated method stub
									
								}
								
							}) {
					
				};
				
				queue.add(request);
				
				FilterResults fr = new FilterResults();
				fr.values = cList;
				fr.count = cList.size();
				
				return fr;
				
			} else {
				return new FilterResults();
			}
		}

		@Override
		protected void publishResults(CharSequence constraint, FilterResults results) {
			// TODO Auto-generated method stub
			
		}
		
	};
	

}
