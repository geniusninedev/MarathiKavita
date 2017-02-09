package com.nineinfosys.android.marathikavita.Gambhir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Gambhir extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"का प्रेम करतो?",

            "अखेरच्या वळणावर....",
            "संसार.....",
            "विदाई लेकीची.....",
            "सिमोल्लंघन ","गांव ....","सल.......","वळण वाट "
            , "प्रश्न नेहमीचेच...","शुन्य ... ",
            "तु काय दिलं?","अरे जीवना जीवना ","देवा, तुला नक्की काय करायचं होतं ?",
            "विरह गीत","स्वप्न घराचे .......... ","काळ कुणासाठी न थांबला ....... ","चितेवरतीही जिवंत होतो",
            "दोन किनारे !!!","मुखवटे........!" , "जेष्ठ नागरिक "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambhir);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectii);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_gambhir, R.id.textViewtuti, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Gambhir.this, GambhirDetails.class);
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


