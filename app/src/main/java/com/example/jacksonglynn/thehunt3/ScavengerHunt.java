package com.example.jacksonglynn.thehunt3;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class ScavengerHunt extends AppCompatActivity{ //extends Activity{//AppCompatActivity {
Button Local, Multiplayer, Rules;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        addListenerOnButton();
    }
   // public class MainActivity extends ActionBarActivity {
public void addListenerOnButton(){
    final Context context = this;
       // Button Local, Multiplayer, Rules;

//        @Override
//        public void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.main_screen);
//            addListenerOnButton();

            Local = (Button) findViewById(R.id.Local);
            Multiplayer = (Button) findViewById(R.id.Multiplayer);
            Rules = (Button) findViewById(R.id.Rules);


            Local.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent launchMap = new Intent(context, Local.class);
                        startActivity(launchMap);
                    }
            });

            Multiplayer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent launchMap = new Intent(context, Multiplayer.class);
                    startActivity(launchMap);
                }
            });

            Rules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent RulesPage = new Intent(context, Rules.class);
                    startActivity(RulesPage);
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
//}
