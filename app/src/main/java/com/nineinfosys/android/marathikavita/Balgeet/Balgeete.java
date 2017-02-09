package com.nineinfosys.android.marathikavita.Balgeet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Balgeete extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"बडबड गीत ",
            "बेडूकराव  ",
            "आई मला एक बाहुली आणशील का",
            "वेडा मुग्गा, शाना मुग्गा...",
            "पाऊस आला पाऊस आला",
            "डॉली ","येरे येरे पावसा ","बोबडकांदा ","ऊठा ऊठा चिऊ ताई .... "
            , "माकडगाणे ........ ","शाळा ",
            "ये आई ","घरटं नि पिल्लू ...","टोपी उंदीरमामांची .......","चांदोबा ","*** नको वाटतया शाळेत ***","आई मला सांग ","बाळाची गादी ",
    "तोच तो, तोच तो ...","पावसासंगे नाचू गाऊ "};
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

                Intent EnglishBegRef = new Intent(Balgeete.this, BalgeetDetails.class);
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
