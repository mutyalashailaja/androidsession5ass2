package com.example.admin.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id==R.id.item1)
            Toast.makeText(this,"this is computer",Toast.LENGTH_SHORT).show();
        if(id==R.id.item2)
            Toast.makeText(this,"this is gamepad",Toast.LENGTH_SHORT).show();
        if(id==R.id.item3)
            Toast.makeText(this,"this is camera",Toast.LENGTH_SHORT).show();
        if(id==R.id.item4)
            Toast.makeText(this,"this is video",Toast.LENGTH_SHORT).show();
        if(id==R.id.item5)
            Toast.makeText(this,"this is email",Toast.LENGTH_SHORT).show();



        return true;
    }
}
