package com.example.ejemplowebview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		
		WebView myWebView = (WebView) this.findViewById(R.id.webView);
		WebSettings webSettings = myWebView.getSettings();
	    webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://testingsoft.com/demots/distribuidores.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
