package com.example.jacksonglynn.thehunt3;

/**
 * Created by Jackson Glynn on 2/15/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hard extends ScavengerHunt{
    Button back;
    private TextView sorry;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplayer_screen);

        back = (Button) findViewById(R.id.back);
        sorry = (TextView) findViewById(R.id.sorry);

        sorry.setText("Sorry this feature will be coming in Release 2!");
        sorry.setMovementMethod(new ScrollingMovementMethod());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Local.class);
                startActivity(intent);
            }
        });
    }
}
