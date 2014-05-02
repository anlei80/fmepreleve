package com.fme.lersac.preleve.activity;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fmepreleve.R;
import com.fme.lersac.preleve.model.ClientView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class EditGeneraleFragment extends Fragment {

	private static final String url = "http://www.fme-lersac.com/fmeIntranet/seam/resource/rest/preleve/client/";
	
	private EditText client;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.edit_generale, container, false);

		//ClientAdapter clientAdapter = new ClientAdapter(this.getActivity(), R.layout.client_auto, null);
		
		client = (EditText)rootView.findViewById(R.id.clientRecherche);
		
		Button recherche = (Button)rootView.findViewById(R.id.btnRecherche);
        
		//Log.i("AUTO", (autoComplete == null ? "NULL" : "NOT NULL"));
		//autoComplete.setAdapter(clientAdapter);
		
		recherche.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Log.i("TEXT", client.getText().toString());
				String requestUrl = url + client.getText().toString();
				
				RequestQueue queue = Volley.newRequestQueue(arg0.getContext());
				
				StringRequest request = new StringRequest(Request.Method.GET, requestUrl,
						new Response.Listener<String>() {

							@Override
							public void onResponse(String response) {
								// TODO Auto-generated method stub
								Log.i("Reponse ", response.toString());
								Type collectionType = new TypeToken<Collection<ClientView>>(){}.getType();
								Gson gson = new Gson();
								List<ClientView> cList = gson.fromJson(response.toString(), collectionType);
								
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
			
				ListDiaglogFragment dialog = new ListDiaglogFragment();
				dialog.show(getFragmentManager(), null);
			}
			
		});
		
        return rootView;
	}
	
	@SuppressLint("ValidFragment")
	class ListDiaglogFragment extends DialogFragment {
		@Override
	    public Dialog onCreateDialog(Bundle savedInstanceState) {
			// Use the Builder class for convenient dialog construction
	        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	        builder.setMessage("couocu")
	               .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                       // FIRE ZE MISSILES!
	                   }
	               })
	               .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	                   public void onClick(DialogInterface dialog, int id) {
	                       // User cancelled the dialog
	                   }
	               });
	        // Create the AlertDialog object and return it
	        return builder.create();

		}
	}
}
