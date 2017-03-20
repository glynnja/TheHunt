package com.example.jacksonglynn.thehunt3;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

/***************************************************************************************************
 *
 * The following class generates the multiplayer page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Multiplayer extends ScavengerHunt implements OnMapReadyCallback {
    /*Creates the back button */
    private Button back, create, play;

    /*Creates the Text shown in sorry*/
    private TextView sorry;


    /***********************************************************************************************
     *Creates the look of the multiplayer screen and tell the text sorry what to put in it. It also
     * tells the back button what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplayer_screen);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the back button and links it to the correct button in the class
        play = (Button) findViewById(R.id.play);

        //creates the back button and links it to the correct button in the class
        create = (Button) findViewById(R.id.create);

        //creates the text and links it to the correct text box in the xml
        sorry = (TextView) findViewById(R.id.sorry);

        //Tells the text box sorry what to put into it.
        sorry.setText("Welcome To Multiplayer! \n" +
                "Would you like to Create a Hunt for the World? \n" +
                "Or \n" +
                "Would you like to Play A Game?");
        sorry.setMovementMethod(new ScrollingMovementMethod());


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

        /*******************************************************************************************
         * Creates the button listener for create. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        create.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the create button to go to MultiCreate
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                mEasy.multE.clear();
                Intent intent = new Intent(getApplicationContext(), mEasy.class);
                startActivity(intent);
            }
        });

        /*******************************************************************************************
         * Creates the button listener for play. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        play.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the play button to go MultiPlay
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MultiPlay.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}



