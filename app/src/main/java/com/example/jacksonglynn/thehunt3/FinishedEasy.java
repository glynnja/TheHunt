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
import java.util.Collections;
import java.util.List;

public class FinishedEasy extends Easy {

    //ArrayList<String> m_listItems = new ArrayList<String>();
    ListView hunt;
    Button back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_hunt);

        hunt = (ListView) findViewById(R.id.hunt);
        back = (Button) findViewById(R.id.back);

//        public static List<Easy> cloneList(List<Easy>, m_listItems){
//            List<Easy> clone = new ArrayList<Easy>(m_listItems.size());
//            for (Easy item : m_listItems) clone.add(item.clone());
//            return clone;
//        }
       // Easy = onCreate.getList();
        //Easy hunt = Collections.synchronizedList(new ArrayList(m_listItems));
       //setContentView();
        //m_listItems = getIntent().getStringArrayListExtra;
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, clone);
        // android.R.layout.simple_list_item_multiple_choice, m_listItems);
       // m_listItems.add(Easy.class.getName(list).toString());
        hunt.setAdapter(adpt);
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
