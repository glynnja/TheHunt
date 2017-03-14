package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/***************************************************************************************************
 *
 * The following class generates the local page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class MultiPlay extends Multiplayer {
    /*Creates the buttons on the rules screen */
    private Button play, back;

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> playList = new ArrayList<String>();

    /*Creates the ListView shown in the xml*/
    private ListView plist;

    /*Creates the Text shown in the xml*/
    private TextView rules;


    /***********************************************************************************************
     *Creates the look of the local screen and tells it what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_play);

        //creates the text clue and links it to the correct text box in the xml
        rules = (TextView) findViewById(R.id.rules);

        //creates the Easy button and links them to the correct button in the class
        play = (Button) findViewById(R.id.play);

        //creates the listView and links it to the correct listView in the class
        plist = (ListView) findViewById(R.id.plist);

        //creates the back button and links them to the correct button in the class
        back = (Button) findViewById(R.id.back);



        final ArrayAdapter<String> adpt2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, playList);
        plist.setAdapter(adpt2);
        plist.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);


        //Tells the text box clue what to put into it.
        rules.setText("Check a Hunt You Wish To Play. \n" +
                "Then Click Play Hunt To Begin.");
        rules.setMovementMethod(new ScrollingMovementMethod());

        /*******************************************************************************************
         * Creates the button listener for play. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        play.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the hard class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hard.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the Multiplayer class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Multiplayer.class);
                startActivity(intent);
            }
        });

    }




}