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

public class Easy extends ScavengerHunt {
    Button add, finish, back;
    private TextView clue, pic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_screen);

        clue = (TextView) findViewById(R.id.clue);
        pic = (TextView) findViewById(R.id.pic);
        add = (Button) findViewById(R.id.add);
        back = (Button) findViewById(R.id.back);
        finish = (Button) findViewById(R.id.finish);

        clue.setText("Enter Your Clue: ");
        clue.setMovementMethod(new ScrollingMovementMethod());

        pic.setText("Add A Picture: ");
        pic.setMovementMethod(new ScrollingMovementMethod());

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinishedEasy.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Local.class);
                startActivity(intent);
            }
        });
    }
}