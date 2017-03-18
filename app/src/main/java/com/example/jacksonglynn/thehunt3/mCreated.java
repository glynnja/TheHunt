package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


/***************************************************************************************************
 *
 * The following class generates the Finished page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class mCreated extends mEasy {
    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> multClues = new ArrayList<String>();

    /*Creates the ArrayList shown in the xml and declares it as a static variable*/
    public final static ArrayList<String> multName = new ArrayList<String>();

    /*Creates the button on the main screen */
    private Button back, main;

    /*Creates the Text shown in win*/
    private TextView done;


    /***********************************************************************************************
     *Creates the look of the Finished screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_created);

        //creates the done button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the done button and links it to the correct button in the class
        main = (Button) findViewById(R.id.main);

        //creates the text and links it to the correct text box in the xml
        done = (TextView) findViewById(R.id.done);

        //Tells the text box Win what to put into it.
        done.setText("Congrats Your Hunt Has Been Added To Multiplayer!");
        done.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for done. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the done button to go back to the start screen
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                //returns the user back to the start screen
//                Intent i = getBaseContext().getPackageManager()
//                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
//                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
                Intent intent = new Intent(getApplicationContext(), Multiplayer.class);
                startActivity(intent);

                multClues.addAll(multE);
                multName.addAll(multlist);

                //Clears all data after going to main screen
                multE.clear();
                multlist.clear();
            }
        });

        /*******************************************************************************************
         * Creates the button listener for done. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        main.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the done button to go back to the start screen
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                //returns the user back to the start screen
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

                multClues.addAll(multE);
                multName.addAll(multlist);

                //Clears all data after going to main screen
                multE.clear();
                multlist.clear();
            }
        });
    }
}
