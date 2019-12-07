package com.example.qvntruyen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Item_click extends AppCompatActivity {
    String urlGetData="http://192.168.1.111:8080/android/getdata.php";
    ActionBar actionBar;
    private DrawerLayout drawer;
    ArrayList<DS_Truyen> img_detail;
    GridView gView;
    Ad_Truyen listtruyen;
    Context context;
    ImageView img;
    TextView tentruyen;
    TextView theloai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_click);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        img = (ImageView) findViewById(R.id.single_lap_img);
        tentruyen = (TextView) findViewById(R.id.chitiet_tentruyen);
        theloai=(TextView)findViewById(R.id.chitiet_theoai);
        String data = getIntent().getExtras().getString("img");
        String data2 = getIntent().getExtras().getString("tentruyen");
        String tl= getIntent().getExtras().getString("theloai");
        Picasso.with(context).load(Uri.parse(data)).into(img);
        tentruyen.setText(data2);
        theloai.setText(tl);
        //Picasso.with(context).load("http://st.nettruyen.com/data/comics/13/100-dieu-muon-lam-truoc-khi-chet.jpg").into(img);




    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId())
            {
                case android.R.id.home:
                    onBackPressed();
                    return true;

                default:break;
            }

            return super.onOptionsItemSelected(item);
    }
}

