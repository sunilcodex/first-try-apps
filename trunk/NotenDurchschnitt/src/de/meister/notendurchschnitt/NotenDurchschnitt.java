package de.meister.notendurchschnitt;



import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import de.meister.notendurchschnitt.MySQLiteHelper;
import de.meister.notendurchschnitt.Entry;

@SuppressWarnings("unused")
@SuppressLint({ "ParserError", "ParserError" })
public class NotenDurchschnitt extends Activity {
	boolean mainisopen = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noten_durchschnitt);
        datasource = new NotenDataSource(this);
    }
    private NotenDataSource datasource;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_noten_durchschnitt, menu);
        return true;
    }

   
    
    
    
    
   
    
    
    List<Entry> Notenlist = new ArrayList<Entry>();
    
    
    public void Speichern(View view){
    	
    	
    	EditText N = (EditText)findViewById(R.id.editText1);
    	
    	
    	//Notenlist.add(N.getText().toString());
    	
    	
    	
    	int note = Integer.parseInt(N.getText().toString());
    	
    	
    	try {
        	datasource.open();
        	datasource.createEntry(note);
        	datasource.close();
        	}
        	catch (Exception ex) {
        		Toast.makeText(this,ex.toString(), Toast.LENGTH_LONG).show();
        		}
    	N.setText("");
    	Toast.makeText(getApplicationContext(), "Gespeichert", Toast.LENGTH_LONG).show();
    			
    }
    
    
	

	public void Noten(View view){
    	boolean mainisopen = false;
    	setContentView(R.layout.noten);
    	
    	Notenlist.clear();
    	try {
    		datasource.open();
    		 Notenlist= datasource.getAllEntries(); 
    		datasource.close();
    	}
    	catch (Exception ex) {
    		Toast.makeText(this, ex.toString(), Toast.LENGTH_SHORT).show();
    	}




    	try{
    	ArrayAdapter<Entry> adapterNote = new ArrayAdapter<Entry>(NotenDurchschnitt.this, android.R.layout.simple_list_item_1, Notenlist);
    	ListView lNoten = (ListView)findViewById(R.id.listView1);
    	lNoten.setAdapter(adapterNote);}
    	catch (Exception ex) {
    		Toast.makeText(this, ex.toString(), Toast.LENGTH_SHORT).show();
    	}	
    	
    	
    	
    }
    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event ){
    	if(keyCode == KeyEvent.KEYCODE_BACK && mainisopen == false){
    	mainisopen =true;
    	setContentView(R.layout.activity_noten_durchschnitt);
    	return true;
    		
    	}
    	return super.onKeyDown(keyCode, event);
    }
    
    public void delKlick (View view) {

    	this.deleteDatabase("Zensuren.db");

    	}

    List<Entry> Rechenlist = new ArrayList<Entry>();
    int id = entry.id;
    
    public void Rechnen (View view){
    	
    	datasource.open();
    	Rechenlist = datasource.getAllEntries();
    	datasource.close();
    	Rechenlist + 
    	
    }
    
	
    
    
    
    
    	
    		
    	
    
    
    	
    
    }
    

