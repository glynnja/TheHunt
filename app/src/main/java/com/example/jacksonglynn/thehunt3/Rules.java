package com.example.jacksonglynn.thehunt3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/***************************************************************************************************
 *
 * The following class generates the rules page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin van Kempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Rules extends ActionBarActivity {
    /*Creates the buttons on the rules screen */
    Button Local, Multiplayer, faq, back;


    /***********************************************************************************************
     *Creates the look of the rules screen and adds an action listener for the buttons.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_screen); //tells the class what xml goes with it.

        //creates the local button and links them to the correct button in the class
        Local = (Button) findViewById(R.id.Local);

        //creates the multiplayer button and links them to the correct button in the class
        Multiplayer = (Button) findViewById(R.id.Multiplayer);

        //creates the faq button and links them to the correct button in the class
        faq = (Button) findViewById(R.id.faq);

        //creates the back button and links them to the correct button in the class
        back = (Button) findViewById(R.id.back);


    /*******************************************************************************************
     * Creates the button listener for local. This tells the buttons what to do when it is
     * clicked.
     ******************************************************************************************/
        Local.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the local button to go to the localRules class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LocalRules.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for multiplayer. This tells the buttons what to do when it is
         * clicked.
        ******************************************************************************************/
        Multiplayer.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the multiplayer button to go to the MultiplayerRules class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MultiplayerRules.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for faq. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        faq.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the faq button to go to the FrequentlyAskedQuestions class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FrequentlyAskedQuestions.class);
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