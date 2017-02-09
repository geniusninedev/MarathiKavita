package com.nineinfosys.android.marathikavita.Vinodi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Vinodi extends AppCompatActivity {
    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"देवाचे Customer care",
            "बॉक चीक बाऊ बाऊ",
            "खुणा..........",
            "जिभेवरती \" ळ \" अवतरला ",
            "चलनकल्लोल.....",
            "तुझ्या मागून चातकांचे थवे उडाले","थंडी....","दहावीतलं प्रेम","सर ऐका ना" ,
            "तुझ्या पायी येळ किती घातला मी वाया","शेजारणीच्या पोरीपायी पोरगं झालं जान दादा",
            "एका मेक़्यनिकचा प्रेमयोग","वऱ्हाड घेऊन दारात आलोय ","शहराकडून \"बा\" चा फून आला",
            "च्या मारी लय भारी आपली लव्हस्टोरी एकदम न्यारी","करायला गेलो आत्महत्या ","होतं का हो आयुष्यात तुमचं कधी असं?","रजा घेऊन घरी बसायचं म्हंजे",
            "शोधा म्हणजे सापडेल ","इंजिनेरींग कैद"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinodi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectr);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_vinodi, R.id.textViewtutr, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Vinodi.this, VinodiDetails.class);
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
