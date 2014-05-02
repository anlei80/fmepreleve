package com.fme.lersac.preleve.activity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.fmepreleve.R;
import com.fme.lersac.preleve.model.Dossier;
import com.fme.lersac.preleve.model.VELP;
import com.google.gson.Gson;

public class CreationActivity extends Activity {

	private Button valideClick = null;
	
	private TextView txtDisplay = null;
	
	private Button annulerClick = null;
	
	private Button saveClick = null;
	
	String url = "http://www.fme-lersac.com/fmeIntranet/seam/resource/rest/preleve/savedossier";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_creation);
		
		valideClick = (Button)findViewById(R.id.valider);
		saveClick = (Button)findViewById(R.id.savegarder);
		annulerClick = (Button)findViewById(R.id.annuler);
		txtDisplay = (TextView) findViewById(R.id.textView2);
		
		Log.i("Info", "Message");
		
		//List<Dossier> lst = new ArrayList<Dossier>();
		
		
		saveClick.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				
				try {
					List<Dossier> lst = new ArrayList<Dossier>();
					Dossier dossier = new Dossier();
					//dossier.setRefFme("aaa");
					lst.add(dossier);
					
					Dossier dossier2 = new Dossier();
					//dossier2.setNumeroAffaire("bbb");
					lst.add(dossier2);
					
					FileOutputStream fichier = openFileOutput("list", MODE_PRIVATE);
					ObjectOutputStream file = new ObjectOutputStream(fichier);
					file.writeObject(lst);
					file.flush();
					file.close();
					Context context = getApplicationContext();
					CharSequence text = "Save ok";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		});
	    
		annulerClick.setOnClickListener(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	          // Le premier paramètre est le nom de l'activité actuelle
	          // Le second est le nom de l'activité de destination
	          Intent secondeActivite = new Intent(CreationActivity.this, MainActivity.class);
	          
	          // On rajoute un extra
	          //secondeActivite.putExtra(AGE, 31);
	          // Puis on lance l'intent !
	          startActivity(secondeActivite);
	        }
	      });
		
		/*
		VELP vlep = new VELP();
		vlep.setClient("TEST CLIENT");
		Gson gson = new Gson();
		String text = gson.toJson(vlep);
		Log.i("Info", text);
		JSONObject param = new JSONObject();
		
		try {
			param.put("dossier", text);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ 
		
		RequestQueue queue = Volley.newRequestQueue(this);
		
		
		StringRequest jsObjRequest = new StringRequest(Request.Method.POST, url, //param, 
					new Response.Listener<String>() {
			            @Override
			            public void onResponse(String response) {
				                // TODO Auto-generated method stub
			            	Log.i("Reponse ", response.toString());
			                txtDisplay.setText("Response => "+response.toString());
			                //findViewById(R.id.progressBar1).setVisibility(View.GONE);
			            }
			        }, 
			        
			        new Response.ErrorListener() {
			            @Override
			            public void onErrorResponse(VolleyError error) {
		                // TODO Auto-generated method stub
			 
			            }
			        }) {
			
			
			   protected Map<String, String> getParams() throws com.android.volley.AuthFailureError {
			        Map<String, String> params = new HashMap<String, String>();
					VELP vlep = new VELP();
					vlep.setClient("TEST CLIENT");
					Gson gson = new Gson();
					String text = gson.toJson(vlep);
			        params.put("dossier", text);
			        return params;
			    };
		};
				 
			        queue.add(jsObjRequest);
		 
		valideClick.setOnClickListener(new OnClickListener() {
		      @Override
		      public void onClick(View v) {

		    	  /*
					try {
						FileInputStream fichier = openFileInput("list");
						ObjectInputStream ois = new ObjectInputStream(fichier);
						List<Dossier> dossiers = (List<Dossier>) ois.readObject();
						ois.close();
						Context context = getApplicationContext();
						String s = "";
						for (Dossier d : dossiers) {
							//s += d.getNumeroAffaire();
						}
						CharSequence text = s;
						int duration = Toast.LENGTH_LONG;

						Toast toast = Toast.makeText(context, text, duration);
						toast.show();
						}
						catch (java.io.IOException e) {
						e.printStackTrace();
						}
						catch (ClassNotFoundException e) {
						e.printStackTrace();
						}*/

		    	 
		      }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.creation, menu);
		return true;
	}

}
