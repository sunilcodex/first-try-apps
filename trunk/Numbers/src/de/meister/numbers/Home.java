package de.meister.numbers;





import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class Home extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
    
    public boolean onKeyDown(int keyCode,KeyEvent event ){
    	boolean mainisopen = false;
		if(keyCode == KeyEvent.KEYCODE_BACK && mainisopen == false){
    	mainisopen =true;
    	setContentView(R.layout.activity_home);
    	return true;
    		
    	}
    	return super.onKeyDown(keyCode, event);
    }
    
    public void cd(View view){
    	
    	setContentView(R.layout.activity_cd);
    	
    }
    
    public void uc(View view){
    	
    	setContentView(R.layout.activity_uc);
    	
    }
    
    public void bc(View view){
    	
    	setContentView(R.layout.activity_bc);
    	
    	   	
    }
    
    public void ec(View view){
    	
    	setContentView(R.layout.activity_ec);
    	
    }
    

    
}
