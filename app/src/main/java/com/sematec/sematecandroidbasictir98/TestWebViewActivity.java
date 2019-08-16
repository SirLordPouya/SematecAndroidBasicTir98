package com.sematec.sematecandroidbasictir98;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_web_view);
        WebView web = findViewById(R.id.web);

        web.setWebViewClient(new CustomWebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://heydarii.ir");
    }
}


class CustomWebViewClient extends WebViewClient {

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        Toast.makeText(view.getContext(), "started Loading", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Toast.makeText(view.getContext(), "finished Loading", Toast.LENGTH_SHORT).show();

    }
}
