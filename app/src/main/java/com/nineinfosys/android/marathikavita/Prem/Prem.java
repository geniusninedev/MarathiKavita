package com.nineinfosys.android.marathikavita.Prem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Prem extends AppCompatActivity {
    ListView TutorialList;
    ArrayAdapter<String> adapter;

    String[] TutoriallList = new String[]{"जेव्हा निघते ती....घराबाहेर",
            "सांगत --- मी पण नाही ",
            "तू........ ♥ ",
            "एक क्षण बघ",
            "तु ...... ",
            "प्रेम तुझ माझ","** धुंद **","कोणीतरी असं असावं ","थोडी भिती वाटते " ,
            "तीचं - माझं.. ","वेडा जीव तळमळतो ",
            "मी सावली .. ","स्वप्नात येणारी तू।","प्रेम कसे केले? ",
            "झाली झांजरं झांजरं झांजरं ","असावा असा एक रस्ता...","जातांना तिच्या गल्लीतून","कशी असावी ती ","आज तु पुन्हा प्रेमाची जाणिव करुन दिलीस","अजूनही पहिल्यासारखाच..."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prem);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialList = (ListView) findViewById(R.id.object);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_prem, R.id.textViewtut, TutoriallList);
        TutorialList.setAdapter(adapter);
        TutorialList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Prem.this, PremDetails.class);
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
