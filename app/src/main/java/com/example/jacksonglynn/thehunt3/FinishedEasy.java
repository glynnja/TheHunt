package com.example.jacksonglynn.thehunt3;

/** AND AUSTIN
 *
 * Created by Jackson Glynn and Mason Mahoney2 on 2/19/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
    //private ArrayList m_listItems = Easy.m_listItems;
   // ArrayList<String> cloned = new ArrayList<String>();
   // String[] array = getIntent().getExtras().getStringArray("list");
   // ArrayList<String> cloned = new ArrayList<String>();
    ListView hunt;
    private TextView textView;
    Button back, load;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_hunt);

       // Intent intent = new Intent(getApplicationContext(), FinishedEasy.class);
        //startActivity(intent);
//        Bundle b = getIntent().getExtras();
//
//        if(b!=null) {
//            ArrayList<String> clone = (ArrayList<String>) b.getStringArrayList(m_listItems.toString());
//            textView.setText(clone.toString());
//            textView.setMovementMethod(new ScrollingMovementMethod());
//        }
           // System.out.println(arr);

        hunt = (ListView) findViewById(R.id.hunt);
        back = (Button) findViewById(R.id.back);
        load = (Button) findViewById(R.id.load);
        textView = (TextView) findViewById(R.id.textView);

       // m_listItems.addAll(m_listItems);

//        textView.setText(m_listItems.toString());
//        textView.setMovementMethod(new ScrollingMovementMethod());
//        public static List<Easy> cloneList(List<Easy>, m_listItems){
//            List<Easy> clone = new ArrayList<Easy>(m_listItems.size());
//            for (Easy item : m_listItems) clone.add(item.clone());
//            return clone;
//        }
       // Easy = onCreate.getList();
        //Easy hunt = Collections.synchronizedList(new ArrayList(m_listItems));
       //setContentView();
        //m_listItems = getIntent().getStringArrayListExtra;
       // clone.add(enter.getText().toString());
      //  adpt.setNotifyOnChange(true);

//        hunt.equals(list.toString());
//        m_listItems.add(enter.getText().toString());
       // clone.add(m_listItems.toString());
//        clone.toString();
//        m_listItems.add(list.toString());
//        list.getCheckedItemCount();

       //  clone.addAll(m_listItems);

        // m_listItems.add(enter.getText().toString());
       // clone.addAll(m_listItems);

        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
               // android.R.layout.simple_expandable_list_item_1, m_listItems);
         android.R.layout.simple_list_item_multiple_choice, m_listItems);
       // m_listItems.add(Easy.class.getName(list).toString());
      //  m_listItems.add(list.toString());
      //  adpt.setNotifyOnChange(true);
        hunt.setAdapter(adpt);
        hunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

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
                //for(int i=0; i<m_listItems.indexOf(i); i++) {
                    //clone.addAll(m_listItems);
                    //hunt.addTouchables(list.toString());
                    Intent intent = getIntent();
                   // if(null != intent){
                        String cunt = intent.getStringExtra("list");
                   // }
                   // hunt.equals(cunt);
                   // textView.setText(m_listItems.toString());
                textView.setText(cunt);

                textView.setMovementMethod(new ScrollingMovementMethod());


//                Bundle b = getIntent().getExtras();
//
//                if(b!=null) {
//                    ArrayList<String> clone = (ArrayList<String>) b.getStringArrayList(m_listItems.toString());
//                    textView.setText(clone.toString());
//                    textView.setMovementMethod(new ScrollingMovementMethod());
//                }
               // }
                //hunt.equals(list);
              //  m_listItems.add();
                ;
               // m_listItems.add(enter.getText().toString());
               // adpt.setNotifyOnChange(true);
               // hunt.setAdapter(adpt);
                //clone.addAll(m_listItems);
//                Intent intent = new Intent (m_listItems.add(enter.getText().toString()));
                //  m_listItems.add(new String(input));
                //  m_adapter.notifyDataSetChanged();
                // Intent intent = new Intent(getApplicationContext(), Camera.class);
                // startActivity(intent);
            }
        });
//        hunt.equals(list.toString());
//        m_listItems.add(enter.getText().toString());
       // public void onStart()
//        m_listItems.add(list.toString());
       // adpt.setNotifyOnChange(true);
       // hunt.setAdapter(adpt);

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
