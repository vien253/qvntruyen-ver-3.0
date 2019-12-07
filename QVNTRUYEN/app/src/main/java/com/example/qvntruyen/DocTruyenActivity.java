package com.example.qvntruyen;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DocTruyenActivity extends AppCompatActivity {
    ActionBar actionBar;
    TextView tenchap;
    TextView ndchap;
    Button but1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctruyen);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        but1=(Button)findViewById(R.id.prechap);
        tenchap=(TextView)findViewById(R.id.tenchap) ;
        ndchap=(TextView)findViewById(R.id.noidungchap);
         String data1 = getIntent().getExtras().getString("tenchap");
         if(data1.trim().equals("Chap 1"))
         {
             but1.setEnabled(false);
         }
         String data2 = getIntent().getExtras().getString("tentruyen");
        String data3 = getIntent().getExtras().getString("noidungchap");
         tenchap.setText(data1);
         ndchap.setText(data3);
         actionBar.setTitle(data2);
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
