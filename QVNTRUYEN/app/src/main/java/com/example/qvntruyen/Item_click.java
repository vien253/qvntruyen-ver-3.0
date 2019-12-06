package com.example.qvntruyen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

public class Item_click extends AppCompatActivity {
    ActionBar actionBar;
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_click);
        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

