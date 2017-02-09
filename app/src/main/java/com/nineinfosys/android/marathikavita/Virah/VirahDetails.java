package com.nineinfosys.android.marathikavita.Virah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.nineinfosys.android.marathikavita.R;

/**
 * Created by Dev on 20-12-2016.
 */

public class VirahDetails extends AppCompatActivity {
    WebView tutorialsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virah_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWebViwIdd);
        tutorialsWebView.setBackgroundColor(0x00000000);
        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new VirahDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_asset/vo.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_asset/vtwo.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_asset/vth.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_asset/vfr.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_asset/vfive.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_asset/vsix.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_asset/vsev.html");
        }

        else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_asset/veigh.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_asset/vnine.html");
        }
        else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_asset/vten.html");
        } else if (position == 10) {
            tutorialsWebView.loadUrl("file:///android_asset/vele.html");
        } else if (position == 11) {
            tutorialsWebView.loadUrl("file:///android_asset/vte.html");
        } else if (position == 12) {
            tutorialsWebView.loadUrl("file:///android_asset/vtt.html");
        } else if (position == 13) {
            tutorialsWebView.loadUrl("file:///android_asset/vtty.html");
        } else if (position == 14) {
            tutorialsWebView.loadUrl("file:///android_asset/vtiy.html");
        } else if (position == 15) {
            tutorialsWebView.loadUrl("file:///android_asset/vtnine.html");
        } else if (position == 16) {
            tutorialsWebView.loadUrl("file:///android_asset/vtten.html");
        } else if (position == 17) {
            tutorialsWebView.loadUrl("file:///android_asset/vttenn.html");
        } else if (position == 18) {
            tutorialsWebView.loadUrl("file:///android_asset/vnintn.html");
        } else if (position == 19) {
            tutorialsWebView.loadUrl("file:///android_asset/vtwent.html");
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





