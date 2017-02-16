package com.example.jacksonglynn.thehunt3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ScavengerHunt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scavenger_hunt);
    }
    public class MainActivity extends ActionBarActivity {

        private Button local, multiplayer, Rules;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_screen);

            local = (Button) findViewById(R.id.Local);
            multiplayer = (Button) findViewById(R.id.Multiplayer);
            Rules = (Button) findViewById(R.id.Rules);


            local.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchMap = new Intent(MainActivity.this, Local.class);
                    startActivity(launchMap);
                }
            });

            multiplayer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchMap = new Intent(MainActivity.this, Multiplayer.class);
                    startActivity(launchMap);
                }
            });

            Rules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent RulesPage = new Intent(MainActivity.this, Rules.class);
                    startActivity(Rules);
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
//        }
    }
}
