package net.meisterlabs.mcsever_dynmap;





import android.app.Activity;
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


public class MainActivity extends Activity {

	private static final String LOG_TAG = "WebViewDemo";

    private WebView mWebView;

    private Handler mHandler = new Handler();

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);

        mWebView.setWebChromeClient(new MyWebChromeClient());

        mWebView.addJavascriptInterface(new DemoJavaScriptInterface(), "demo");

        mWebView.loadUrl("http://merz-server.dyndns.biz:6067/#");
        
        
        /**info
        WebView mWebView1 = (WebView) findViewById(R.id.w1);

        
        mWebView1.setWebChromeClient(new MyWebChromeClient());

       

        mWebView1.loadUrl("https://googledrive.com/host/0B4aMlHpq7Z9ed05mdmxtc1ZYZ00/serverinfo.html");*/
        
        
        
        
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
  
 public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.activity_main, menu);
    return true;
}

public void info(View view){
	
	setContentView(R.layout.activity_info2);
	
	
	
}




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