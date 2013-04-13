package net.meisterlabs.mcsever_dynmap;








import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class MainActivity extends Activity {

	private static final String LOG_TAG = "WebViewDemo";

    private WebView mWebView;

    private Handler mHandler = new Handler();

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);

        mWebView.setWebChromeClient(new MyWebChromeClient());

        mWebView.addJavascriptInterface(new DemoJavaScriptInterface(), "demo");

        mWebView.loadUrl("http://merz-server.dyndns.biz:6067/#");
        
        EasyTracker.getInstance().setContext(getApplicationContext());
        
        
    }
    
    
    /**
  	 * An example Activity in your app with Analytics
  	 * implemented.
  	 */
  	

  	  @Override
  	  public void onStart() {
  	    super.onStart();
  	    
  	    EasyTracker.getInstance().activityStart(this); // Add this method.
  	  }

  	  @Override
  	  public void onStop() {
  	    super.onStop();
  	    
  	    EasyTracker.getInstance().activityStop(this); // Add this method.
  	  }
  	
  	
  	private Tracker mGaTracker;
    private GoogleAnalytics mGaInstance;

    public void onCreate1(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);


		
		 
      // Get the GoogleAnalytics singleton. Note that the SDK uses
      // the application context to avoid leaking the current context.
      mGaInstance = GoogleAnalytics.getInstance(this);

      // Use the GoogleAnalytics singleton to get a Tracker.
      mGaTracker = mGaInstance.getTracker("UA-38978202-5"); // Placeholder tracking ID.
      
   // Get singleton using application context.
      GoogleAnalytics myInstance = GoogleAnalytics.getInstance(this);

      // Enable debug mode.
      myInstance.setDebug(true);
     
    }

    public void onStart1() {
      super.onStart();

      // Send a screen view when the Activity is displayed to the user.
      mGaTracker.sendView("/HomeScreen");
    }
    
    
  	
  	

    final class DemoJavaScriptInterface {

        DemoJavaScriptInterface() {
        }

        
        public void clickOnAndroid() {
            mHandler.post(new Runnable() {
                public void run() {
                    mWebView.loadUrl("javascript:wave()");
                }
            });

        }
    }

    //chrome
    final class MyWebChromeClient extends WebChromeClient {
        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            Log.d(LOG_TAG, message);
            result.confirm();
            return true;
        }
    }
  
    

    
    

    
    //------------------------------------------------------------------------------------------------------------------------

    //______________________________________________________________________________________________________________________________
    
    
    
    /**@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }
    
    //var. 1
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent intent = new Intent(this, infofile.class);
        switch (item.getItemId()) {
            case R.id.menu:
            	startActivity(intent);

            	//startActivity(new Intent(this, infofile.class));	        	
              return true;
           
            default:
                return super.onOptionsItemSelected(item); 
        }
    }
  */
    
    
    
 //_---------------------------------------------------------------------------------------------------------------------
    
   
  public boolean onKeyDown(int keyCode,KeyEvent event ){
	boolean mainisopen = false;
	if(keyCode == KeyEvent.KEYCODE_BACK && mainisopen == false){
	mainisopen =true;
	setContentView(R.layout.activity_main);
	return true;
		
	}
  
	return super.onKeyDown(keyCode, event);
} 
}