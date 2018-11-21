package com.example.edu.webviewwithexplicit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button searchButton =findViewById(R.id.searchButton);
        searchButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editText =findViewById(R.id.editText);
        WebView webView=findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                return super.shouldOverrideUrlLoading(view,url);
            }
        });
        webView.loadUrl(editText.getText().toString());
        webView.requestFocus();
    }
}
