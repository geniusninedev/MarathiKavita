package com.nineinfosys.android.marathikavita.Bhakti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Bhaktii extends AppCompatActivity {
    ListView TutorialList;
    ArrayAdapter<String> adapter;

    String[] TutoriallList = new String[]{"||दिगंबरा||",
            "गुरुमूर्ती आली... ",
            "अभंगवाणी ",
            "नमो आदिदेवता ",
            "गणराया ",
            "वारकरी  ","विठ्ठला ! ","खेळ आता आटोप रे ","डम डम डम डम डमरू वाजे" ,"कान्हुली जगदंबे","लिहवितो गाणी दत्त"
            ,"स्वामी पावसचा ","जन्म बाटलेला","जाणिवेची जाण.. ","माझे दोन्ही गुरू नगरनिवासी... ","देवाच्या गावाला ","नर्मदेचा काठ","मन झाले बावरे"
            ,"मरणी बांधले मीपण","ज्ञानदेवी माय "
       };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhaktii);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialList = (ListView) findViewById(R.id.objecttt);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_bhaktii, R.id.textViewtuttt, TutoriallList);
        TutorialList.setAdapter(adapter);
        TutorialList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Bhaktii.this, BhaktiiDetails.class);
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
