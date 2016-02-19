package com.qianfeng.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView= (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://blog.csdn.net/wangyuchun_799/article/details/7489955");
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
