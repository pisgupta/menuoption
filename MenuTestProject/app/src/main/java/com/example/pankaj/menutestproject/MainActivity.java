package com.example.pankaj.menutestproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.add:
                Toast.makeText(MainActivity.this,"Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sub:
                Toast.makeText(MainActivity.this,"Sub",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mut:
                Toast.makeText(MainActivity.this,"Mut",Toast.LENGTH_SHORT).show();
                break;
            case R.id.div:
                Toast.makeText(MainActivity.this,"Div",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
