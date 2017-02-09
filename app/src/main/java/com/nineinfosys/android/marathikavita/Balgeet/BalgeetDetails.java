package com.nineinfosys.android.marathikavita.Balgeet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.nineinfosys.android.marathikavita.R;

public class BalgeetDetails extends AppCompatActivity {
    WebView tutorialsWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balgeet_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWebbal);
        tutorialsWebView.setBackgroundColor(0x00000000);
        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new BalgeetDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_asset/blone.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_asset/bltwo.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_asset/blthr.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_asset/blfr.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_asset/blfive.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_asset/blsix.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_asset/blsev.html");
        }

        else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_asset/bleight.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_asset/blnine.html");
        }
        else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_asset/blten.html");
        } else if (position == 10) {
            tutorialsWebView.loadUrl("file:///android_asset/blele.html");
        } else if (position == 11) {
            tutorialsWebView.loadUrl("file:///android_asset/bltwelve.html");
        } else if (position == 12) {
            tutorialsWebView.loadUrl("file:///android_asset/blthrn.html");
        } else if (position == 13) {
            tutorialsWebView.loadUrl("file:///android_asset/blfrrn.html");
        } else if (position == 14) {
            tutorialsWebView.loadUrl("file:///android_asset/blfifteen.html");
        }
        else if (position == 15) {
            tutorialsWebView.loadUrl("file:///android_asset/blsixteen.html");
        }
        else if (position == 16) {
            tutorialsWebView.loadUrl("file:///android_asset/blsevteen.html");
        }
        else if (position == 17) {
            tutorialsWebView.loadUrl("file:///android_asset/bleighteen.html");
        }
        else if (position == 18) {
            tutorialsWebView.loadUrl("file:///android_asset/blninteen.html");
        }
        else if (position == 19) {
            tutorialsWebView.loadUrl("file:///android_asset/bltenn.html");
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





