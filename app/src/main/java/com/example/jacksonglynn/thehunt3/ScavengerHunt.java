package com.example.jacksonglynn.thehunt3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

/***************************************************************************************************
 *
 * The following class generates a ScavengerHunt game
 *
 * @author Jackson Glynn, Mason Mahoney, Austin van Kempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class ScavengerHunt extends AppCompatActivity{
    /*Creates the buttons on the main screen */
    private Button Local, Multiplayer, Rules;


    /***********************************************************************************************
     *Creates the look of the main screen and adds an action listener for the buttons.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen); //tells the class what xml goes with it.
        addListenerOnButton();
    }


    /***********************************************************************************************
     * Creates the button listener. This tells the buttons what to do when they are clicked.
     **********************************************************************************************/
    public void addListenerOnButton(){
        final Context context = this;

            //creates the local button and links them to the correct button in the class
            Local = (Button) findViewById(R.id.Local);

            //creates the multiplayer button and links them to the correct button in the class
            Multiplayer = (Button) findViewById(R.id.Multiplayer);

            //creates the rules button and links them to the correct button in the class
            Rules = (Button) findViewById(R.id.Rules);


            /***************************************************************************************
             * Creates the button listener for local. This tells the buttons what to do when it is
             * clicked.
             **************************************************************************************/
            Local.setOnClickListener(new OnClickListener() {


                /***********************************************************************************
                 * tells the local button to go to the local class
                 * @param v - the button when clicked
                 **********************************************************************************/
                @Override
                public void onClick(View v) {
                        Intent launchMap = new Intent(context, Local.class);
                        startActivity(launchMap);
                    }
            });


            /***************************************************************************************
             * Creates the button listener for multiplayer. This tells the buttons what to do
             * when it is clicked.
             * ************************************************************************************/
            Multiplayer.setOnClickListener(new View.OnClickListener() {


                /***********************************************************************************
                 * tells the multiplayer button to go to the Multiplayer class
                 * @param v - the button when clicked
                 **********************************************************************************/
                @Override
                public void onClick(View v) {
                    Intent launchMap = new Intent(context, Multiplayer.class);
                    startActivity(launchMap);
                }
            });


             /**************************************************************************************
              * Creates the button listener for Rueles. This tells the buttons what to do when it is
              * clicked.
              *************************************************************************************/
            Rules.setOnClickListener(new View.OnClickListener() {


                /***************************************************************************************
                 * tells the rules button to go to the Rules class
                 * @param v - the button when clicked
                 **************************************************************************************/
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Rules.class);
                    startActivity(intent);
                }
            });


        }

    }

