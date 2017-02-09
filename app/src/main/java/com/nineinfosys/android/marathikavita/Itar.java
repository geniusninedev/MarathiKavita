package com.nineinfosys.android.marathikavita;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class Itar  extends AppCompatActivity {
    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"आगमन बाळाचे ",
            "कँलेंडर...   ",
            "लोकल",
            "आई ... ",
            "धन्यवाद आणि आभार...",
            "जातिवादी कीड़े  ","।। कन्यारत्न ।। ","आम्ही यातले नव्हतोच...  ","रुतू मागुनी ऱ्रुतू. "
            , "मुलांचे जग ","आपलेच दात आपलेच ओठ",
            "नाते ","चिमणपाखरू ","ती सध्या काय करते ","राजाची दिवाळी","प्रपोज डे","घरटं ","किंमत","पुन्हा ..","म्हातारी माय ..."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balgeete);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectib);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_balgeete, R.id.textViewtutb, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Itar.this, ItarDetails.class);
                EnglishBegRef.putExtra("key", position);
                startActivity(EnglishBegRef);

            }
        });
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

