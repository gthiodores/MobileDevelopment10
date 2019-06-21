package com.example.android.mobiledevelopment10;

import android.webkit.WebView;
import android.webkit.WebViewClient;

//Handles redirect event from webview
public class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
