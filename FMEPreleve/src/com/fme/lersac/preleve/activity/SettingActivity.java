package com.fme.lersac.preleve.activity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fmepreleve.R;
import com.fme.lersac.preleve.adapter.PersonnelAdapter;
import com.fme.lersac.preleve.model.PersonnelView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class SettingActivity extends Activity {
	
	private List<String> list = new ArrayList<String>();
	
	private List<PersonnelView> plist;
	
	private SettingActivity getThis() {
		return this;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		
		String url = "http://www.fme-lersac.com/fmeIntranet/seam/resource/rest/preleve/preleveurs";
		
		RequestQueue queue = Volley.newRequestQueue(this);
		
		//List<PersonnelView> list = null;
		
		StringRequest request = new StringRequest(Request.Method.GET, url,
				new Response.Listener<String>() {

					@Override
					public void onResponse(String response) {
						// TODO Auto-generated method stub
						//Log.i("Reponse ", response.toString());
						Gson gson = new Gson();
						Type collectionType = new TypeToken<Collection<PersonnelView>>(){}.getType();
						plist = gson.fromJson(response.toString(), collectionType);
						
						for (PersonnelView p : plist) {
							//Log.i("Nom ", p.getNom());
							list.add(p.getNom() + " " + p.getPrenom());
						}
						
						PersonnelAdapter adapter = new PersonnelAdapter(getThis(),
								R.layout.personnel_auto, plist);
						//ArrayAdapter<String> adapter = new ArrayAdapter<String>(getThis(), android.R.layout.simple_dropdown_item_1line, list);
						
						final AutoCompleteTextView autoComplete = (AutoCompleteTextView)findViewById(R.id.preleveur);
						
						autoComplete.setAdapter(adapter);
					}},
					new Response.ErrorListener() {

						@Override
						public void onErrorResponse(VolleyError error) {
							// TODO Auto-generated method stub
							
						}
						
					}) {
			
			
		};
		
		queue.add(request);
		
		/*
		PersonnelAdapter adapter = new PersonnelAdapter(this,
				android.R.layout.simple_dropdown_item_1line, plist);*/
		
		/*
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, list);
		
		final AutoCompleteTextView autoComplete = (AutoCompleteTextView)findViewById(R.id.preleveur);
		
		autoComplete.setAdapter(adapter);*/
		
		/*
		autoComplete.setOnItemClickListener(new OnItemClickListener() {

	        @Override
	        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
	                long arg3) {
	        	PersonnelView selected = (PersonnelView) arg0.getAdapter().getItem(arg2);
	            Toast.makeText(SettingActivity.this,
	                    "Clicked " + arg2 + " name: " + selected.getNom(),
	                    Toast.LENGTH_SHORT).show();
	        }
	    });*/
		
		
	}
}
