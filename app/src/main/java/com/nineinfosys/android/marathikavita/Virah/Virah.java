package com.nineinfosys.android.marathikavita.Virah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Virah extends AppCompatActivity {
    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"स्वप्न",
            "माझं प्रेम होत फक्त तुझ्या साठी",
            "स्वप्नसुंदरी  ",
            "सागर ",
            "कळेना ......",
            "तुला काय माहित ","द़फन...","अर्थ...","कधी काळी ..." ,
            "प्रेमाला नजर लागून गेली....","हृदया वर माझ्या",
            "प्रीत ......","जेव्हा तुझं माझं नातं खूप रंगल होत","कविता लिहावी वाटते तुझ्या साठी",
            "तु.......","तुझ्या साठी","तु शोधलीस !!!","क्षणाची भेट"," प्रेम.....","काय चुकलं माझं तू मला असं वाऱ्या वर सोडलं*"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virah);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectt);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_virah, R.id.textViewtutt, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Virah.this, VirahDetails.class);
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
