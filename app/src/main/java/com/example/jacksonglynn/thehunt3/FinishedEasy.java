package com.example.jacksonglynn.thehunt3;

/** AND AUSTIN
 *
 * Created by Jackson Glynn and Mason Mahoney2 on 2/19/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class FinishedEasy extends Easy {

    //ArrayList<String> m_listItems = new ArrayList<String>();
    ListView hunt;
    Button back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_hunt);

        hunt = (ListView) findViewById(R.id.list);
        back = (Button) findViewById(R.id.back);

        //m_listItems = getIntent().getStringArrayListExtra;
//        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
//                android.R.layout.simple_expandable_list_item_1, m_listItems);
        // android.R.layout.simple_list_item_multiple_choice, m_listItems);
       // m_listItems.add(Easy.class.getName(list).toString());
      //  hunt.setAdapter(adpt);
        hunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

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
