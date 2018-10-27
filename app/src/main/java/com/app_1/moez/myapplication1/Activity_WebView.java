package com.app_1.moez.myapplication1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Activity_WebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__web_view_layout);

        getSupportActionBar().setTitle("th web view");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //declaration de boutton
        Button btn_go = (Button) findViewById(R.id.btnnn_webv);
        final WebView WbViewww = (WebView) findViewById(R.id.my_webView);
        final EditText Ed_URL = (EditText) findViewById(R.id.EditTextURL);
        WbViewww.setWebViewClient(new WebViewClient());
        Ed_URL.setText("http://www.google.com");

      btn_go.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            WbViewww.loadUrl(Ed_URL.getText().toString());
          }
      });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
