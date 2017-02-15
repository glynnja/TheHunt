package com.example.jacksonglynn.thehunt3;

/**
 * Created by Jackson Glynn on 2/15/2017.
 */
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Local extends ActionBarActivity {

    Button preSaved, Easy, Hard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules_page);

        preSaved = (Button) findViewById(R.id.preSaved);
        Easy = (Button) findViewById(R.id.Easy);
        Hard = (Button) findViewById(R.id.Hard);

        preSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), preSaved.class);
                startActivity(intent);
            }
        });

        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });

        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hard.class);
                startActivity(intent);
            }
        });


    }



//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//            // Inflate the menu; this adds items to the action bar if it is present.
//            getMenuInflater().inflate(R.menu.menu_main, menu);
//            return true;
//        }
//
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            // Handle action bar item clicks here. The action bar will
//            // automatically handle clicks on the Home/Up button, so long
//            // as you specify a parent activity in AndroidManifest.xml.
//            int id = item.getItemId();
//
//            //noinspection SimplifiableIfStatement
//            if (id == R.id.action_settings) {
//                return true;
//            }
//
//            return super.onOptionsItemSelected(item);
    //   }
    //  }
}
