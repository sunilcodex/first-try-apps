package com.meister.rechner02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

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
   
   Feld3.setText(String.valueOf(solution));
    
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
       
       Feld3.setText(String.valueOf(solution));
        
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
       
       Feld3.setText(String.valueOf(solution));
        
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
       
       Feld3.setText(String.valueOf(solution));
        
        }
    
    public void Wechsel(View view){
    	setContentView(R.layout.verlauf);
    }
    
    public void Loeschen(View view){
    	EditText Feld1 = (EditText)findViewById(R.id.editText1);
        EditText Feld2 = (EditText)findViewById(R.id.editText2);
        EditText Feld3 = (EditText)findViewById(R.id.editText3);
        
        Feld1.setText("");
        Feld2.setText("");
        Feld3.setText("");
    	
    }
    
    
    
    

	
	

    
}
