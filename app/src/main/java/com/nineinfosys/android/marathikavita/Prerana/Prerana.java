package com.nineinfosys.android.marathikavita.Prerana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Prerana extends AppCompatActivity {
    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"महाराष्ट्र माझा ",
            "विझली मशाल पेटव ",
            "वादळवारा ...............",
            "मुक्तहास्य ",
            "गांधीबाबा ",
            "मानुस","ते आणि आम्ही","यशकळस ","शिवछत्रपती माझा "
            , "मराठा ","घुसमट",
            "आयुष्याशी लड़ताना....","स्त्रि शक्ती ","अबला न तू ....",
            "जगण्याचा फंडा","मनात धरावे एक ध्येय ","पेटून उठतोय मराठा..! ","प्रणाम ",
            "मान ","एकटा"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prerana);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectip);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_prerana, R.id.textViewtutp, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Prerana.this, PreranaDetails.class);
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


