package com.nineinfosys.android.marathikavita.Vidamban;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.marathikavita.R;

public class Vidamban extends AppCompatActivity {

    ListView TutorialListt;
    ArrayAdapter<String> adapter;

    String[] TutoriallListt = new String[]{"पोवाडा",
            "शातिर औलाद",
            "बुडाखालचा अंधार......!",
            "शब्दांचीच माळ......",
            "मराठी .....",
            "बाप हा ताप नसतो, पोरा ","टेक्नो दसरा ","जातीधर्म ","स्वार्थी"
            ,
            "मनसाच मन","याला हवा पाहिजे हवा",
            "हवे कशास सरकार !","सुटता हाव सुटेना ","मरण पाहिजे ",
            "या समाजात वावरताना  ","जात ","मला ही आता फक्त आमदार व्हायचं..","बस झाल्या शुभेच्छा आता बस झाली फुले",
            "विस्तराचं बिस्तरं  ","पैसा"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidamban);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TutorialListt = (ListView) findViewById(R.id.objectv);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_vidamban, R.id.textViewtutv, TutoriallListt);
        TutorialListt.setAdapter(adapter);
        TutorialListt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(Vidamban.this, VidambanDetails.class);
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
