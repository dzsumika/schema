package com.example.zsomborsimonguth.schema;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class Schema_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schema_);
        ImageButton back = (ImageButton) findViewById(R.id.back_to_menu); //#0e0e0e

        Intent intent = getIntent();

        String url = intent.getStringExtra("ID");

        WebView webview = new WebView(this);
        setContentView(webview);

        webview.loadUrl(url);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
