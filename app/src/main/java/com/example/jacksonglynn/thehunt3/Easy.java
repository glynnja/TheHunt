package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/***************************************************************************************************
 *
 * The following class generates the Easy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin van Kempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Easy extends ScavengerHunt {
    /*Creates the buttons on the main screen */
    Button add, finish, back;

    /*Creates the Text shown in the xml*/
    private TextView clue, pic;


    /***********************************************************************************************
     *Creates the look of the easy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_screen);

        //creates the text clue and links it to the correct text box in the xml
        clue = (TextView) findViewById(R.id.clue);

        //creates the text pic and links it to the correct text box in the xml
        pic = (TextView) findViewById(R.id.pic);

        //creates the add button and links it to the correct button in the class
        add = (Button) findViewById(R.id.add);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the finish button and links it to the correct button in the class
        finish = (Button) findViewById(R.id.finish);

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
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for finish. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        finish.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the finishedEasy class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinishedEasy.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
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