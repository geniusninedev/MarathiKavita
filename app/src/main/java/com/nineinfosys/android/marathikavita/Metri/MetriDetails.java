package com.nineinfosys.android.marathikavita.Metri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.nineinfosys.android.marathikavita.R;

public class MetriDetails extends AppCompatActivity {

    WebView tutorialsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metri_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWeb);
        tutorialsWebView.setBackgroundColor(0x00000000);
        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new MetriDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_asset/mone.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_asset/mtwo.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_asset/mthr.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_asset/mfour.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_asset/mfive.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_asset/msix.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_asset/msev.html");
        }

        else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_asset/meight.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_asset/mnine.html");
        }
        else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_asset/mten.html");
        }
        else  if(position ==10){
            tutorialsWebView.loadUrl("file:///android_asset/mele.html");
        }
        else  if(position ==11){
            tutorialsWebView.loadUrl("file:///android_asset/mtwelve.html");
        }
        else  if(position ==12){
            tutorialsWebView.loadUrl("file:///android_asset/mthrt.html");
        }
        else  if(position ==13){
            tutorialsWebView.loadUrl("file:///android_asset/mfrtn.html");
        }
        else  if(position ==14){
            tutorialsWebView.loadUrl("file:///android_asset/mfiftn.html");
        }
        else  if(position ==15){
            tutorialsWebView.loadUrl("file:///android_asset/msixt.html");
        }
        else  if(position ==16){
            tutorialsWebView.loadUrl("file:///android_asset/msevt.html");
        }
        else  if(position ==17){
            tutorialsWebView.loadUrl("file:///android_asset/meightn.html");
        }
        else  if(position ==18){
            tutorialsWebView.loadUrl("file:///android_asset/mnint.html");
        }
        else  if(position ==19){
            tutorialsWebView.loadUrl("file:///android_asset/mtenn.html");
        }
    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }

}




