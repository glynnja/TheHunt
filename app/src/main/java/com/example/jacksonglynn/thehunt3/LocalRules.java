package com.example.jacksonglynn.thehunt3;

/**
 * Created by Jackson Glynn on 2/16/2017.
 */
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class LocalRules extends ActionBarActivity {
    Button back;
    private TextView ffaRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_rules);

        back = (Button) findViewById(R.id.back);
        ffaRules = (TextView) findViewById(R.id.ffaRules);

        ffaRules.setText("Create your own local scavenger hunt? \n\n"
                +"1. \n\n"
                +"2. \n\n"
                +"3. \n\n"
                +" \n\n"
                +"1. \n\n"
                +"2. ");
        ffaRules.setMovementMethod(new ScrollingMovementMethod());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rules.class);
                startActivity(intent);
            }
        });
    }
}
