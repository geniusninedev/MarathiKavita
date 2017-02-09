package com.nineinfosys.android.marathikavita.Metri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Metri extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"*आमची दोस्ती *",

            "मित्र हवाय मला",
            "एक yadu...!! ",
            "मैत्रीण एक अशी व्हावी..!! ",
            "ते दिस.....","मैत्री....","कहाणी...","पुन्हा उठून प्रयत्न कर  "
            , "मैत्रीचे नाते.... ","दुरावलेली मैत्री....  ","मैत्रिणी","कॉलेज ","एक फेसबुक फ्रेंड ","साथी ","एक कटींग चहा!","मैत्रीची परी"
    ,"खुणा आठवणींच्या","माझी प्रदन्या...","बंध मैत्रीचे...","एक होती शाळा. .."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metri);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectu);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_metri, R.id.textViewtutu, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Metri.this, MetriDetails.class);
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


