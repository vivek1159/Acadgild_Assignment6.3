package com.example.vivek.assignment62;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView HelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        HelloWorld=(TextView)findViewById(R.id.HelloWorld);
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
        if (id == R.id.action_Blue) {
            HelloWorld.setTextColor(getResources().getColor((R.color.Blue)));
            return true;
        }
        else if (id == R.id.action_Red)
        {
            HelloWorld.setTextColor(getResources().getColor((R.color.Red)));
            return true;
        }
        else if (id == R.id.action_Green)
        {
            HelloWorld.setTextColor(getResources().getColor((R.color.Green)));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
