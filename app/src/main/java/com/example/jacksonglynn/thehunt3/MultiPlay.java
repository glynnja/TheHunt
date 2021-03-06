package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

/***************************************************************************************************
 *
 * The following class generates the local page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class MultiPlay extends mCreated {
    /*Creates the buttons on the rules screen */
    private Button play, back;

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> playList = new ArrayList<String>();

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> playList2 = new ArrayList<String>();

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<Marker> locList4 = new ArrayList<Marker>();

    /*Creates the ListView shown in the xml*/
    private ListView plist;

    /*Creates the Text shown in the xml*/
    private TextView rules;

    /*Creates a total at 0*/
    private int total = 0;

    /*Creates an amount at 0*/
    private int amount = 0;


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
               android.R.layout.simple_list_item_multiple_choice, multName);
        plist.setAdapter(adpt2);
        plist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

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
                SparseBooleanArray checkedItemPositions = plist.getCheckedItemPositions();
                int itemCount = plist.getCount();

                //adds everything one by one
                 for(int i = 0; i< itemCount; i++){
                    total = total + arraycount.get(i);
                        if (checkedItemPositions.get(i)) {
                            playList.add(multName.get(i));
                            amount = total - arraycount.get(i);

                            //adds the clues and locations one by one
                            for(int c= amount; c < total; c++){
                                playList2.add(multClues.get(c));
                                locList4.add(locList3.get(c));
                            }
                            Intent intent = new Intent(getApplicationContext(), FinishedPlay.class);
                            startActivity(intent);
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