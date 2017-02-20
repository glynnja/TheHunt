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
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class FrequentlyAskedQuestions extends ActionBarActivity {

    Button back;
    private TextView ffaRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq_screen);

        back = (Button) findViewById(R.id.back);
        ffaRules = (TextView) findViewById(R.id.ffaRules);

        ffaRules.setText("1.How does one create a Scavenger Hunt? \n"
        + " - you can create a scavenger hunt by going to local and picking easy.\n"
        + "2. Is there pre saved scavenger hunts?\n"
        + " - there are pre saved scavenger hunts under presaved in local.\n"
        + "3. Can I share my scavenger Hunt with others?\n"
        + " - this feature wont be available until release 2."
        );
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
