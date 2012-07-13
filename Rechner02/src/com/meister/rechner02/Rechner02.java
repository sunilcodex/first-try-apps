package com.meister.rechner02;

import java.util.ArrayList;
import java.util.List;



import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Rechner02 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechner02);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_rechner02, menu);
        return true;
    }
    List<String> Rechnungenlist = new ArrayList<String>();
    public void Plus(View view){
    double number1 , number2 , solution;
    EditText Feld1 = (EditText)findViewById(R.id.editText1);
    EditText Feld2 = (EditText)findViewById(R.id.editText2);
    EditText Feld3 = (EditText)findViewById(R.id.editText3);
    if(Feld1.getText().toString().length() == 0){
    	return;
    }
    if(Feld2.getText().toString().length() == 0){
    	return;
     	
    	
      }
    
    
  
    number1 = Double.parseDouble(Feld1.getText().toString());
    number2 = Double.parseDouble(Feld2.getText().toString());
   solution = number1 + number2;
   
   Feld3.setText(String.valueOf(number1 + "+" + number2 + "=" + solution));
   
	Rechnungenlist.add(Feld3.getText().toString());
	
	Toast.makeText(getApplicationContext(), "Gespeichert", Toast.LENGTH_LONG).show();
	//Feld3.setText("");
    
    }
    
    
    
    public void Minus(View view){
        double number1 , number2 , solution;
        EditText Feld1 = (EditText)findViewById(R.id.editText1);
        EditText Feld2 = (EditText)findViewById(R.id.editText2);
        EditText Feld3 = (EditText)findViewById(R.id.editText3);
        if(Feld1.getText().toString().length() == 0){
        	return;
        }
        if(Feld2.getText().toString().length() == 0){
        	return;
        }
        
        
      
        number1 = Double.parseDouble(Feld1.getText().toString());
        number2 = Double.parseDouble(Feld2.getText().toString());
       solution = number1 - number2;
       
       Feld3.setText(String.valueOf(number1 + "+" + number2 + "=" + solution));
       
       Rechnungenlist.add(Feld3.getText().toString());
   	
   	Toast.makeText(getApplicationContext(), "Gespeichert", Toast.LENGTH_LONG).show();
        
        }
    
    
    public void Mal(View view){
        double number1 , number2 , solution;
        EditText Feld1 = (EditText)findViewById(R.id.editText1);
        EditText Feld2 = (EditText)findViewById(R.id.editText2);
        EditText Feld3 = (EditText)findViewById(R.id.editText3);
        if(Feld1.getText().toString().length() == 0){
        	return;
        }
        if(Feld2.getText().toString().length() == 0){
        	return;
        }
        
        
      
        number1 = Double.parseDouble(Feld1.getText().toString());
        number2 = Double.parseDouble(Feld2.getText().toString());
       solution = number1 * number2;
       
       Feld3.setText(String.valueOf(number1 + "+" + number2 + "=" + solution));
       
       Rechnungenlist.add(Feld3.getText().toString());
   	
   	Toast.makeText(getApplicationContext(), "Gespeichert", Toast.LENGTH_LONG).show();
        
        }
    
    
    public void Geteilt(View view){
        double number1 , number2 , solution;
        EditText Feld1 = (EditText)findViewById(R.id.editText1);
        EditText Feld2 = (EditText)findViewById(R.id.editText2);
        EditText Feld3 = (EditText)findViewById(R.id.editText3);
        if(Feld1.getText().toString().length() == 0){
        	return;
        }
        if(Feld2.getText().toString().length() == 0){
        	return;
        }
        
        
      
        number1 = Double.parseDouble(Feld1.getText().toString());
        number2 = Double.parseDouble(Feld2.getText().toString());
       solution = number1 / number2;
       
       Feld3.setText(String.valueOf(number1 + "+" + number2 + "=" + solution));
       
       Rechnungenlist.add(Feld3.getText().toString());
   	
   	Toast.makeText(getApplicationContext(), "Gespeichert", Toast.LENGTH_LONG).show();
        
        }
    
   
    
    public void Loeschen(View view){
    	EditText Feld1 = (EditText)findViewById(R.id.editText1);
        EditText Feld2 = (EditText)findViewById(R.id.editText2);
        EditText Feld3 = (EditText)findViewById(R.id.editText3);
        
        Feld1.setText("");
        Feld2.setText("");
        Feld3.setText("");
        
    }
    
    
    public void Verlauf(View view){
    	@SuppressWarnings("unused")
		boolean mainisopen = false;
    	setContentView(R.layout.verlauf);
    	
    	




    	
    	ArrayAdapter<String> adapterNote = new ArrayAdapter<String>(Rechner02.this, android.R.layout.simple_list_item_1, Rechnungenlist);
    	ListView lNoten = (ListView)findViewById(R.id.listView1);
    	lNoten.setAdapter(adapterNote);
    	
    	
    }
    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event ){
    	boolean mainisopen = false;
		if(keyCode == KeyEvent.KEYCODE_BACK && mainisopen == false){
    	mainisopen =true;
    	setContentView(R.layout.activity_rechner02);
    	return true;
    		
    	}
    	return super.onKeyDown(keyCode, event);
    }
    
    
    
    

	
	

    
}
