package com.nineinfosys.android.marathikavita.Home;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.nineinfosys.android.marathikavita.Aai.Aai;
import com.nineinfosys.android.marathikavita.Balgeet.Balgeete;
import com.nineinfosys.android.marathikavita.Bhakti.Bhaktii;
import com.nineinfosys.android.marathikavita.Gambhir.Gambhir;
import com.nineinfosys.android.marathikavita.Itar;
import com.nineinfosys.android.marathikavita.Metri.Metri;
import com.nineinfosys.android.marathikavita.Prem.Prem;
import com.nineinfosys.android.marathikavita.Prerana.Prerana;
import com.nineinfosys.android.marathikavita.R;
import com.nineinfosys.android.marathikavita.Shrungar.Shrungar;
import com.nineinfosys.android.marathikavita.Vidamban.Vidamban;
import com.nineinfosys.android.marathikavita.Vinodi.Vinodi;
import com.nineinfosys.android.marathikavita.Virah.Virah;

import java.util.ArrayList;
import java.util.Arrays;

public class Home extends ListActivity{
    private String[] listview_names = {"प्रेम  कविता", "विरह कविता", "विनोदी कविता ", "विडंबन कविता", "प्रेरणादायी कविता", "शृंगारिक कविता"
            , "गंभीर कविता", "मैत्री कविता", "भक्ती कविता", "बालगीत", "इतर कविता", "आई कविता"};
    static Context mcontext;

    private static int[] listview_images =
            {
                    R.drawable.prem, R.drawable.virah, R.drawable.vinodi,
                    R.drawable.nature, R.drawable.insp, R.drawable.sh, R.drawable.gambhir, R.drawable.friendship, R.drawable.bhakti, R.drawable.b, R.drawable.marathi, R.drawable.aai};

    private ListView lv;
    private static ArrayList<String> array_sort;
    private static ArrayList<Integer> image_sort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        lv = (ListView) findViewById(android.R.id.list);
        array_sort = new ArrayList<String>(Arrays.asList(listview_names));
        image_sort = new ArrayList<Integer>();
        for (int index = 0; index < listview_images.length; index++) {
            image_sort.add(listview_images[index]);
        }
        setListAdapter(new bsAdapter(this));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int Itemposition = position;

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Prem.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Virah.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Vinodi.class);
                    startActivityForResult(myIntent, 2);

                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Vidamban.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Prerana.class);
                    startActivityForResult(myIntent, 4);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), Shrungar.class);
                    startActivityForResult(myIntent, 5);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), Gambhir.class);
                    startActivityForResult(myIntent, 6);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Metri.class);
                    startActivityForResult(myIntent, 7);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), Bhaktii.class);
                    startActivityForResult(myIntent, 8);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), Balgeete.class);
                    startActivityForResult(myIntent, 9);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), Itar.class);
                    startActivityForResult(myIntent, 10);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), Aai.class);
                    startActivityForResult(myIntent, 11);
                }
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }*/
    }



    public static class bsAdapter extends BaseAdapter {
        Activity cntx;

        public bsAdapter(Activity context) {
            // TODO Auto-generated constructor stub
            this.cntx = context;
        }

        public int getCount() {
            // TODO Auto-generated method stub
            return array_sort.size();
        }

        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return array_sort.get(position);
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return array_sort.size();
        }

        public View getView(final int position, View convertView, ViewGroup parent) {
            View row = null;
            LayoutInflater inflater = cntx.getLayoutInflater();
            row = inflater.inflate(R.layout.list_item, null);
            TextView tv = (TextView) row.findViewById(R.id.title);
            ImageView im = (ImageView) row.findViewById(R.id.imageview);
            tv.setText(array_sort.get(position));

            im.setImageBitmap(getRoundedShape(decodeFile(cntx, listview_images[position]), 200));

            return row;
        }

        public static Bitmap decodeFile(Context context, int resId) {
            try {
// decode image size
                mcontext = context;
                BitmapFactory.Options o = new BitmapFactory.Options();
                o.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(mcontext.getResources(), resId, o);
// Find the correct scale value. It should be the power of 2.
                final int REQUIRED_SIZE = 200;
                int width_tmp = o.outWidth, height_tmp = o.outHeight;
                int scale = 1;
                while (true) {
                    if (width_tmp / 2 < REQUIRED_SIZE
                            || height_tmp / 2 < REQUIRED_SIZE)
                        break;
                    width_tmp /= 2;
                    height_tmp /= 2;
                    scale++;
                }
// decode with inSampleSize
                BitmapFactory.Options o2 = new BitmapFactory.Options();
                o2.inSampleSize = scale;
                return BitmapFactory.decodeResource(mcontext.getResources(), resId, o2);
            } catch (Exception e) {
            }
            return null;
        }
    }

    public static Bitmap getRoundedShape(Bitmap scaleBitmapImage, int width) {
        // TODO Auto-generated method stub
        int targetWidth = width;
        int targetHeight = width;
        Bitmap targetBitmap = Bitmap.createBitmap(targetWidth,
                targetHeight, Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(targetBitmap);
        Path path = new Path();
        path.addCircle(((float) targetWidth - 1) / 2,
                ((float) targetHeight - 1) / 2,
                (Math.min(((float) targetWidth),
                        ((float) targetHeight)) / 2),
                Path.Direction.CCW);
        canvas.clipPath(path);
        Bitmap sourceBitmap = scaleBitmapImage;
        canvas.drawBitmap(sourceBitmap,
                new Rect(0, 0, sourceBitmap.getWidth(),
                        sourceBitmap.getHeight()),
                new Rect(0, 0, targetWidth,
                        targetHeight), null);
        return targetBitmap;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                /*Intent i=new Intent(this,Splash_Screen.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity;*/
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_send) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
    @SuppressWarnings("StatementWithEmptyBody")
  *//*  @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        }*//*

     *//* DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);*//*
        return true;
    }*/
}
