package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/***************************************************************************************************
 *
 * The following class generates the local page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Local extends Easy {
    /*Creates the buttons on the rules screen */
    private Button preSaved, easy, hard, back;


    /***********************************************************************************************
     *Creates the look of the local screen and tells it what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_screen);

        //creates the preSaved button and links them to the correct button in the class
        preSaved = (Button) findViewById(R.id.PreSaved);

        //creates the Easy button and links them to the correct button in the class
        easy = (Button) findViewById(R.id.Easy);

        //creates the Hard button and links them to the correct button in the class
        hard = (Button) findViewById(R.id.Hard);

        //creates the back button and links them to the correct button in the class
        back = (Button) findViewById(R.id.back);


        /*******************************************************************************************
         * Creates the button listener for preSaved. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        preSaved.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the preSaved class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), preSaved.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for Easy. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        easy.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the easy class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                namelist.clear();
                mlistItems.clear();
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for Hard. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        hard.setOnClickListener(new View.OnClickListener() {


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
             * tells the back button to go back to the ScavengerHunt class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScavengerHunt.class);
                startActivity(intent);
            }
        });

    }




}
