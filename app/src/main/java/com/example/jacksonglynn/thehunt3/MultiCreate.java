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
public class MultiCreate extends Multiplayer {
    /*Creates the buttons on the rules screen */
    private Button mEasy, mHard, back;


    /***********************************************************************************************
     * Creates the look of the local screen and tells it what to put in it. It also
     * tells the buttons what to do when clicked.
     *
     * @param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_create);

        //creates the Easy button and links them to the correct button in the class
        mEasy = (Button) findViewById(R.id.easy);

        //creates the Easy button and links them to the correct button in the class
        mHard = (Button) findViewById(R.id.hard);

        //creates the back button and links them to the correct button in the class
        back = (Button) findViewById(R.id.back);



        /*******************************************************************************************
         * Creates the button listener for play. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        mEasy.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the Easy button to go mEasy class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mEasy.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for play. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        mHard.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the Hard button to go to the mHard class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mHard.class);
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