package net.meister.lotttozahlengenerator;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;



public class LottoZahlen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotto_zahlen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_lotto_zahlen, menu);
        return true;
    }
    
    public void Generate(View view){
    	
    	    
    		EditText Feld1 = (EditText)findViewById(R.id.editText1);
    	    
    	      int zahl1 = (int) (Math.floor(Math.random()*(49+1)));
    	      int zahl2 = (int) (Math.floor(Math.random()*(49+1)));
    	      int zahl3 = (int) (Math.floor(Math.random()*(49+1)));
    	      int zahl4 = (int) (Math.floor(Math.random()*(49+1)));
    	      int zahl5 = (int) (Math.floor(Math.random()*(49+1)));
    	      int zahl6 = (int) (Math.floor(Math.random()*(49+1)));
    	      
    	      
    	      
    	      
    	      
    	      Feld1.setText(String.valueOf(zahl1 + "  " + zahl2 + "  " + zahl3 + "  " + zahl4 + "  " + zahl5 + "  " + zahl6));
    	      
    	          	      
    	    
    }

    
}
