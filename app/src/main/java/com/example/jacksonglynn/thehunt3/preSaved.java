package com.example.jacksonglynn.thehunt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/***************************************************************************************************
 *
 * The following class generates the preSaved page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class preSaved extends ScavengerHunt{
    /*Creates the back button */
    private Button back, gvsu, allendale, downGR;

    /*Creates the Text shown in sorry*/
    private TextView sorry;


    /***********************************************************************************************
     *Creates the look of the preSaved screen and tell the text sorry what to put in it. It also
     * tells the back button what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_saved);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the gvsu button and links it to the correct button in the class
        gvsu = (Button) findViewById(R.id.GVSU);

        //creates the gvsu button and links it to the correct button in the class
        allendale = (Button) findViewById(R.id.Allendale);

        //creates the gvsu button and links it to the correct button in the class
        downGR = (Button) findViewById(R.id.DowntownGR);

        //creates the text and links it to the correct text box in the xml
        sorry = (TextView) findViewById(R.id.sorry);

        //Tells the text box sorry what to put into it.
        sorry.setText("Please Choose A Hunt!");
        sorry.setMovementMethod(new ScrollingMovementMethod());


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


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        gvsu.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), preGVSU.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        allendale.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), preAllendale.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        downGR.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), preDownGR.class);
                startActivity(intent);
            }
        });
    }
}