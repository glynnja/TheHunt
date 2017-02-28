package com.example.jacksonglynn.thehunt3;

import android.app.Activity;
import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/***************************************************************************************************
 *
 * The following class generates the Easy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin van Kempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Easy extends ScavengerHunt {
   // ArrayAdapter<String> m_adapter;
 //  ArrayList<List> m_listItems = new ArrayList<List>();

   public static ArrayList<String> m_listItems = new ArrayList<String>();
  //  String m_listItems[];
    //    public ArrayList<String> getM_listItems(){
//        return m_listItems;
//    }

  //  ArrayList<String> clone = new ArrayList<>();
    /*Creates the buttons on the main screen */
    Button add, finish, back;

    EditText enter;
    ListView list;

    /*Creates the Text shown in the xml*/
    private TextView clue, pic, test;
    public String maybe;

    /***********************************************************************************************
     *Creates the look of the easy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_screen);

        //creates the text clue and links it to the correct text box in the xml
        clue = (TextView) findViewById(R.id.clue);

        //creates the text pic and links it to the correct text box in the xml
        pic = (TextView) findViewById(R.id.pic);
        test = (TextView) findViewById(R.id.test);

        enter = (EditText) findViewById(R.id.enter);


        list = (ListView) findViewById(R.id.list);

        //creates the add button and links it to the correct button in the class
        add = (Button) findViewById(R.id.add);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the finish button and links it to the correct button in the class
        finish = (Button) findViewById(R.id.finish);

       // m_adapter = new ArrayAdapter<String>(this, R.layout.easy_screen, m_listItems);
       // list.setAdapter(m_adapter);
        //final String input = enter.getText().toString();

        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
               // android.R.layout.simple_expandable_list_item_1, m_listItems);
                android.R.layout.simple_list_item_multiple_choice, m_listItems);
        list.setAdapter(adpt);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);


        //Tells the text box clue what to put into it.
        clue.setText("Enter Your Clue: ");
        clue.setMovementMethod(new ScrollingMovementMethod());

        //Tells the text box pic what to put into it.
        pic.setText("Add A Picture: ");
        pic.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for add. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        add.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the easy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                //m_listItems.add(enter.gettoString());
                String ag = enter.getText().toString().trim();
                if(ag.length() != 0){
                    m_listItems.add(ag);
                    enter.setText("");
                }
                //m_listItems.add(enter.getText().toString().trim());
                //m_listItems.add(enter.toString());
                adpt.setNotifyOnChange(true);
                list.setAdapter(adpt);
                test.setText(m_listItems.toString());
                test.setMovementMethod(new ScrollingMovementMethod());
                //clone.add(enter.getText().toString());
//                Intent intent = new Intent (m_listItems.add(enter.getText().toString()));
              //  m_listItems.add(new String(input));
              //  m_adapter.notifyDataSetChanged();
               // Intent intent = new Intent(getApplicationContext(), Camera.class);
               // startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for finish. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
//        list.setOnClickListener(new View.OnClickListener(){
//        @Override
//            public void onClick(View v){
//
//        }
//        });

        finish.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the finishedEasy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
              //  m_listItems.addAll(clone);
                //ArrayList<String> clone = new ArrayList<>();
                //clone.addAll(m_listItems);
               // savedInstanceState.getStringArrayList(m_listItems.toString());
               // list.setText(getIntent().getStringExtra("m_listItems"));
                Intent intent = new Intent(getApplicationContext(), FinishedEasy.class);
                intent.putExtra("list", m_listItems);
//                for(int i =0; i < m_listItems.size();i++) {
//                    intent.putExtra(m_listItems.set(i, m_listItems.toString()), m_listItems);
//                }
               // Intent intent = new Intent(getApplicationContext(), FinishedEasy.class);
                startActivity(intent);
                finish();
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Local.class);
                startActivity(intent);
            }
        });

  }
}

