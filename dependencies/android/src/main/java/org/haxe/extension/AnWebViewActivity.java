package org.haxe.extension;

import java.util.regex.PatternSyntaxException;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import java.lang.String;
import android.util.Log;

import org.haxe.lime.HaxeObject;


public class AnWebViewActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		WebView webview = new WebView(this);
		WebSettings webSettings = webview.getSettings();
		webSettings.setJavaScriptEnabled(true);
		this.setContentView(webview);
		String urlString = getIntent().getStringExtra("urlString");
		webview.loadUrl(urlString);
	}
}