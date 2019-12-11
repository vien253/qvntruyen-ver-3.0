package com.example.qvntruyen;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DocTruyenActivity  extends AppCompatActivity implements View.OnClickListener {
    ArrayList<ChitietTruyen> chaptruyen;
    TextView httruyen;
    TextView ten;
    Button but1;
    Button but2;
    int k;
    String data;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctruyen);
        httruyen=(TextView)findViewById(R.id.noidungchap) ;
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        data= getIntent().getExtras().getString("tentruyen");
        actionBar.setTitle(data);
        but1=(Button)findViewById(R.id.nextchap);
        but2=(Button)findViewById(R.id.prechap);
        ten=(TextView)findViewById(R.id.tenchap);
        Bundle extras = getIntent().getExtras();
        String id= extras.getString("chap");
        ten.setText(id);
        String id1= id.substring(5);
        k = Integer.valueOf(id1);
        chaptruyen= new ArrayList<>();
        chaptruyen=Item_click.img_detail;
        int s= chaptruyen.size();
        for(int i=0;i<s;i++)
        {
            if((k-1)==i) {
                httruyen.setText(chaptruyen.get(i).getNoiDung());

            }
        }

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);


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


    @Override
    public void onClick(View view) {

        int s= chaptruyen.size();

        if(view==but1)
        {
            k=k+1;
            if(k-1<s) {
                for (int i = 0; i <s; i++) {
                    if ((k - 1) == i) {
                        httruyen.setText(chaptruyen.get(i).getNoiDung());
                        ten.setText("Chap "+String.valueOf(k));


                    }

                }
            }
            if(k-1>=s)
            {
                k=s;
                Toast.makeText(this,"Đây là Chap cuối",Toast.LENGTH_SHORT).show();
            }



        }
        if(view==but2)
        {
            k=k-1;
            if(k-1>=0) {
                for (int i = 0; i <s; i++) {
                    if ((k - 1) == i) {
                        httruyen.setText(chaptruyen.get(i).getNoiDung());
                        ten.setText("Chap "+String.valueOf(k));
                    }
                }
            }
            if(k-1<0)
            {
                k=1;
                Toast.makeText(this,"Đây là Chap đầu",Toast.LENGTH_SHORT).show();
            }

        }




    }
}