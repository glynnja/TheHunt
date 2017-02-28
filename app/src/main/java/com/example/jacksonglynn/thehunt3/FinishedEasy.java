package com.example.jacksonglynn.thehunt3;

/** AND AUSTIN
 *
 * Created by Jackson Glynn and Mason Mahoney2 on 2/19/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.SparseBooleanArray;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinishedEasy extends Easy {

    ListView hunt;
    private TextView textView;
    Button back, load;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_hunt);



        hunt = (ListView) findViewById(R.id.hunt);
        back = (Button) findViewById(R.id.back);
        load = (Button) findViewById(R.id.load);
        textView = (TextView) findViewById(R.id.textView);


        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
               // android.R.layout.simple_expandable_list_item_1, m_listItems);
         android.R.layout.simple_list_item_multiple_choice, m_listItems);

        hunt.setAdapter(adpt);
        hunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        SparseBooleanArray checked = hunt.getCheckedItemPositions();



        /*******************************************************************************************
         * Creates the button listener for add. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        load.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the easy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {

                    Intent intent = getIntent();

                        String cunt = intent.getStringExtra("list");

                textView.setText(cunt);

                textView.setMovementMethod(new ScrollingMovementMethod());




            }
        });


        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });
    }
}
