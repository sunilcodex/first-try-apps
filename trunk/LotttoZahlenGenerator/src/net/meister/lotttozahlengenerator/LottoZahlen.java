package net.meister.lotttozahlengenerator;



import java.util.ArrayList;
import java.util.List;



import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;








public class LottoZahlen extends Activity {

    //private static final int YOUR_PI_REQ_CODE = 0;


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
    
    List<String> Rechnungenlist1 = new ArrayList<String>();
		public void Generate(View view){
		
		
		EditText Feld1 = (EditText)findViewById(R.id.editText1);
		EditText Feld2 = (EditText)findViewById(R.id.editText2);
	    
		
	      int zahl1 = (int) (Math.floor(Math.random()*(49+1)));
	      int zahl2 = (int) (Math.floor(Math.random()*(49+1)));
	      int zahl3 = (int) (Math.floor(Math.random()*(49+1)));
	      int zahl4 = (int) (Math.floor(Math.random()*(49+1)));
	      int zahl5 = (int) (Math.floor(Math.random()*(49+1)));
	      int zahl6 = (int) (Math.floor(Math.random()*(49+1)));
	      
	      int zahls = (int) (Math.floor(Math.random()*(10+1)));
	      int zahlz = (int) (Math.floor(Math.random()*(49+1)));
	      
	      
	      
	      
	      
	      Feld1.setText(String.valueOf(zahl1 + "  " + zahl2 + "  " + zahl3 + "  " + zahl4 + "  " + zahl5 + "  " + zahl6));
	      Feld2.setText(String.valueOf(zahls + "                            " + zahlz)); 
	     
	    
	  	Rechnungenlist1.add(Feld1.getText().toString() );
	    //ArrayAdapter<String> adapter = new ArrayAdapter<String>(LottoZahlen.this, android.R.layout.simple_list_item_1, Rechnungenlist1);
    	//ListView lNoten = (ListView)findViewById(R.id.listView1);
    	//lNoten.setAdapter(adapter);
	  	
	  	Toast.makeText(getApplicationContext(), "Gespeichert", Toast.LENGTH_LONG).show();
		}


	      public boolean onCreateOptionsMenu1(Menu menu) {
	          getMenuInflater().inflate(R.menu.activity_lotto_zahlen, menu);
	          return true;
	      }
	      
	      public void Verlauf(View view){
	      	@SuppressWarnings("unused")
	  		boolean mainisopen = false;
	      	setContentView(R.layout.verlauf);}
	      	
	      //ArrayAdapter<String> adapter = new ArrayAdapter<String>(LottoZahlen.this, android.R.layout.simple_list_item_1, Rechnungenlist1);
	    	//ListView lNoten = (ListView)findViewById(R.id.listView1);
	    	//lNoten.setAdapter(adapter);
	    	
	    
	      
	    	public boolean onKeyDown(int keyCode,KeyEvent event ){
	        	boolean mainisopen = false;
	    		if(keyCode == KeyEvent.KEYCODE_BACK && mainisopen == false){
	        	mainisopen =true;
	        	setContentView(R.layout.activity_lotto_zahlen);
	        	return true;
	        		
	        	}
	        	return super.onKeyDown(keyCode, event);
	        }
	        
	    	
	      	
	      	


	       	
			/*Notification noti =  new NotificationCompat.Builder(null)
		         .setContentTitle("Zufallszahl")
		         .setContentText(String.valueOf(zahl1 + "  " + zahl2 + "  " + zahl3 + "  " + zahl4 + "  " + zahl5 + "  " + zahl6))
		         .setSmallIcon(R.drawable.ic_launcher)
		         //large
		         .getNotification();*/
	      
	     /*Context ctx = null;
		Intent notificationIntent = new Intent(ctx, LottoZahlen.class);
	      PendingIntent contentIntent = PendingIntent.getActivity(ctx,
	              YOUR_PI_REQ_CODE, notificationIntent,
	              PendingIntent.FLAG_CANCEL_CURRENT);

	      @SuppressWarnings("null")
		NotificationManager nm = (NotificationManager) ctx
	              .getSystemService(Context.NOTIFICATION_SERVICE);

	      Resources res = ctx.getResources();
	      Notification.Builder builder = new Notification.Builder(ctx);

	      builder.setContentIntent(contentIntent)
	                  //.setSmallIcon(R.drawable.a)
	                  //.setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.a_b))
	                  //.setTicker(res.getString(R.string.Zufallszahl))
	                  .setWhen(System.currentTimeMillis())
	                  .setAutoCancel(true)
	                  .setContentTitle(res.getString(R.string.Zufallszahl))
	                  .setContentText(res.getString(R.string.Z));
	      Notification n = builder.getNotification();

	      int YOUR_NOTIF_ID = 1;
		nm.notify(YOUR_NOTIF_ID, n);*/

	     
	      
	      
		
		
			
		
		
		
		
}


