package com.example.jacksonglynn.thehunt3;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.SparseBooleanArray;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

/***************************************************************************************************
 *
 * The following class generates the Easy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Easy extends ScavengerHunt {
    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
   public static ArrayList<String> mlistItems = new ArrayList<String>();

    /*Creates the buttons on the main screen */
    private Button add, finish, back;

    /*Creates the EditText shown in the xml*/
    private EditText enter;

    /*Creates the ListView shown in the xml*/
    private ListView list;

    /*Creates the Text shown in the xml*/
     private TextView clue;


    /***********************************************************************************************
     *Creates the look of the easy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_screen);

        //creates the text clue and links it to the correct text box in the xml
        clue = (TextView) findViewById(R.id.clue);

        //creates the editText and links it to the correct editText in the class
        enter = (EditText) findViewById(R.id.enter);

        //creates the listView and links it to the correct listView in the class
        list = (ListView) findViewById(R.id.list);

        //creates the add button and links it to the correct button in the class
        add = (Button) findViewById(R.id.add);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the finish button and links it to the correct button in the class
        finish = (Button) findViewById(R.id.finish);

        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, mlistItems);
        list.setAdapter(adpt);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //Tells the text box clue what to put into it.
        clue.setText("Enter Your Clue: ");
        clue.setMovementMethod(new ScrollingMovementMethod());
        /*******************************************************************************************
         * Creates the button listener for add. This tells the buttons what to do when it is
        * clicked.
        ******************************************************************************************/
//        list.setOnItemSelectedListener(new View.OnContextClickListener() {
//            @Override
//            public void onClick(View v){
//                m_listItems.remove(list.toString());
//            }
//
//        });
//        list.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                SparseBooleanArray checkedPositions = new SparseBooleanArray();
//                checkedPositions.clear();
//                checkedPositions = list.getCheckedItemPositions();
//                int size = checkedPositions.size();
//                if (size != 0) {
//
//                    for (int i = 0; i <= size; i++) {
//                        if (checkedPositions.valueAt(i)) {
//                            list.clear(list.getItemAtPosition(i));
//                            m_listItems.remove(list.getItemAtPosition());
//                            list.setAdapter(adpt);
//                            //list.notifyDataSetChanged();
//                        }
//                    }
//                } else {
//                }
//            }
//        });

//        list.setOnClickListener(new View.OnClickListener() {
//
//
//            /***************************************************************************************
//             * tells the back button to go back to the easy class
//             *
//             * @param v - the button when clicked
//             **************************************************************************************/
//           // @Override
//            public void onItemClick(final View v) {
//                AlertDialog.Builder mes = new AlertDialog.Builder(Easy.this);
//                mes.setTitle("Delete?");
//                mes.setMessage("Are you sure you want to delete?");
//                mes.setNegativeButton("Cancel", null);
//                mes.setPositiveButton("Ok", new AlertDialog.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int which) {
//                        m_listItems.remove(v);
//                        adpt.notifyDataSetChanged();
//                    }});
//                }
//            });

//        list.setOnLongClickListener(new View.OnLongClickListener()
//                                   {
//                                       @Override
//                                       public boolean onLongClick(View view) {
//                                           remove(listView.indexOfChild(view));
//                                           return true;
//                                       }
//                                   });

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
                String ag = enter.getText().toString().trim();
                //erases the edit text after submitting an answer
                if(ag.length() != 0){
                    mlistItems.add(ag);
                    enter.setText("");
                }
                adpt.setNotifyOnChange(true);
                list.setAdapter(adpt);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for finish. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        finish.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the finishedEasy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinishedEasy.class);
                startActivity(intent);

                //finish() saves the states of everything in the xml and transfers the array to
                //finishedEasy's xml
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

