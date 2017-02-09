package com.nineinfosys.android.marathikavita.Aai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Aai extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"****आई****",
            "आई म्हणजे .........",
            "आई म्हणजे आई असते ",
            "ती फ़क्त आईच..!",
            "घरापासून दूर... ","पहिला शब्द जो मी उच्चारला..","आई आणखी बाबा..","'आई'नावाचं पान !!"
            , "आई आहे सर्व काही", "तेव्हा आईच्याही डोळा आले पाणी ... ","आई तुझ्या कुशीत,पून्हा यावेसे वाटते","कुणीच नाही माझे ..आई"
    ,"एका आईची अंतयात्रा","माझं दैवत घरात","माझा पाऊस","फिरी येता परतुनी","रुपयांची किंमत","आई म्हणजेच कळस","आई बाप्पाची माया..","आई म्हणजे...."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aai);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectaai);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_aai, R.id.textViewaai, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Aai.this, AaiDetails.class);
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


