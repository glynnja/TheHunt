package com.example.jacksonglynn.thehunt3;

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

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

/***************************************************************************************************
 *
 * The following class generates the Easy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class mEasy extends Multiplayer {
    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> multE = new ArrayList<String>();

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> multlist = new ArrayList<String>();

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<Integer> arraycount = new ArrayList<Integer>();

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<Marker> locList3 = new ArrayList<Marker>();

    /*Creates the buttons on the main screen */
    private Button add, finish, back, delete;// map;

    /*Creates the EditText shown in the xml*/
    private EditText enter, name;

    /*Creates the ListView shown in the xml*/
    private ListView mHunt;

    /*Creates a counter*/
    private int count = 0;

    /*Creates the Text shown in the xml*/
    private TextView clue, hName;


    /***********************************************************************************************
     *Creates the look of the easy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_easy);

        //creates the text clue and links it to the correct text box in the xml
        clue = (TextView) findViewById(R.id.clue);

        //creates the text clue and links it to the correct text box in the xml
        hName = (TextView) findViewById(R.id.huntName);

        //creates the editText and links it to the correct editText in the class
        enter = (EditText) findViewById(R.id.enter);

        //creates the listView and links it to the correct listView in the class
        mHunt = (ListView) findViewById(R.id.mHunt);

        //creates the editText and links it to the correct editText in the class
        name = (EditText) findViewById(R.id.name);

        //creates the add button and links it to the correct button in the class
        add = (Button) findViewById(R.id.add);

        //creates the delete button and links it to the correct button in the class
        delete = (Button) findViewById(R.id.delete);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the finish button and links it to the correct button in the class
        finish = (Button) findViewById(R.id.finish);

        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, multE);
        mHunt.setAdapter(adpt);
        mHunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //Tells the text box clue what to put into it.
        clue.setText("Enter Your Clue: ");
        clue.setMovementMethod(new ScrollingMovementMethod());

        //Tells the text box clue what to put into it.
        hName.setText("Name Your Scavenger Hunt: ");
        hName.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for delete. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        delete.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the delete button to delete the checked items in the list view
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                SparseBooleanArray checkedItemPositions = mHunt.getCheckedItemPositions();
                int itemCount = mHunt.getCount();

                for(int i=itemCount-1; i >= 0; i--){
                    if(checkedItemPositions.get(i)){
                        adpt.remove(multE.get(i));
                        Easy.locList.remove(Easy.locList.get(i));
                        count--;
                    }
                }

                checkedItemPositions.clear();
                adpt.notifyDataSetChanged();
            }
        });


        /*******************************************************************************************
         * Creates the button listener for add. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        add.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the add button to add the text to the arrays
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                String ag = enter.getText().toString().trim();

                //erases the edit text after submitting an answer
                if(ag.length() != 0){
                    Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(intent);
                    multE.add(ag);
                    count++;
                    enter.setText("");
                }
                adpt.setNotifyOnChange(true);
                mHunt.setAdapter(adpt);

            }
        });


        /*******************************************************************************************
         * Creates the button listener for finish. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        finish.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go to the mCreated.class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                String hn = name.getText().toString().trim();
                if(hn.length() != 0 && multE.size() > 2) {
                    Intent intent = new Intent(getApplicationContext(), mCreated.class);
                    startActivity(intent);
                    multlist.add(hn);
                    locList3.addAll(Easy.locList);
                    arraycount.add(count);

                    //finish() saves the states of everything in the xml and transfers the array to
                    //finishedEasy's xml
                    finish();
                }

                else {
                    if (multE.size() < 3) {
                        AlertDialog alertDialog = new AlertDialog.Builder(mEasy.this).create();
                        alertDialog.setTitle("Add More Clues");
                        alertDialog.setMessage("Please Enter at least 3 Clues!");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                    }
                    if (hn.length() == 0) {
                        AlertDialog alertDialog = new AlertDialog.Builder(mEasy.this).create();
                        alertDialog.setTitle("No Name");
                        alertDialog.setMessage("Please Name Your Hunt!");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                    }
                }
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the Multiplayer.class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                multE.clear();
                Intent intent = new Intent(getApplicationContext(), Multiplayer.class);
                startActivity(intent);
            }
        });

    }
}

