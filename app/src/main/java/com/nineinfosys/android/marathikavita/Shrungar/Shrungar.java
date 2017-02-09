package com.nineinfosys.android.marathikavita.Shrungar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Shrungar extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"भरलात मनी ",
            "कामदेव होवुन जा .... ",
            "माझी कविता ",
            "श्रीरंग ....  ",
            "पाऊसकवी  ",
            "प्रेम गीत ","जळणं आणि वाहणं","नशा धुंदीची  ","थांब थोड्या वेळ ...!!! "
            , "पौर्णिमेच्या रात्री  ","तुझ्या हृदयावर",
            "तुझे भिजणे...","प्रेमझुला......","चिंतन.....",
            "पाऊस","खेळ मनाचे","तु......... ","भाव चांदण्यांचा  ",
            "बरसणाऱ्या पावसात","क्षण मिठीतले "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrungar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objecti);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_shrungar, R.id.textViewtut, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Shrungar.this, ShrungarDetails.class);
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


