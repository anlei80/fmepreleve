package com.fme.lersac.preleve.activity;

import java.util.ArrayList;
import java.util.List;

import com.example.fmepreleve.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView liste = null;
	
	private Menu m = null;
	
	private Button create = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    liste = (ListView) findViewById(R.id.listDossier);
	    List<String> exemple = new ArrayList<String>();
	    exemple.add("Item 1");
	    exemple.add("Item 2");
	    exemple.add("Item 3");
	        
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, exemple);
	    liste.setAdapter(adapter);
	    
	    create = (Button) findViewById(R.id.create);
	    
	    create.setOnClickListener(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	          // Le premier paramètre est le nom de l'activité actuelle
	          // Le second est le nom de l'activité de destination
	          Intent secondeActivite = new Intent(MainActivity.this, EditActivity.class);
	          
	          // On rajoute un extra
	          //secondeActivite.putExtra(AGE, 31);
	          // Puis on lance l'intent !
	          startActivity(secondeActivite);
	        }
	      });
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		m = menu;
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item)
	{
	  switch(item.getItemId())
	  {
	    case R.id.setting:
	    	Intent setting = new Intent(MainActivity.this, SettingActivity.class);
	    	
	    	startActivity(setting);
	    	break;
	  }
	  return super.onOptionsItemSelected(item);
	}

}
