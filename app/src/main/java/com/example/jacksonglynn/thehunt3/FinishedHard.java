package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/***************************************************************************************************
 *
 * The following class generates the FinishedEasy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class FinishedHard extends Hard {
    /*Creates the button on the main screen */
    private Button back, done;

    /*Creates the Text shown in sorry*/
    private TextView pic;

    /***********************************************************************************************
     *Creates the look of the FinishedEasy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hard_hunt);

        //creates the text and links it to the correct text box in the xml
        pic = (TextView) findViewById(R.id.pic);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the done button and links it to the correct button in the class
        done = (Button) findViewById(R.id.done);

        //Tells the text box sorry what to put into it.
        pic.setText(" ");
        pic.setMovementMethod(new ScrollingMovementMethod());

        /*******************************************************************************************
         * Creates the button listener for done. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        done.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the done button to go back to display a message
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Finished.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the Easy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hard.class);
                startActivity(intent);
            }
        });
    }
}
