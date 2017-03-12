package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/***************************************************************************************************
 *
 * The following class generates the multiplayerRules page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class MultiplayerRules extends ActionBarActivity {
    /*Creates the back button */
    private Button back;

    /*Creates the Text shown in ffaRules*/
    private TextView ffaRules;


    /***********************************************************************************************
     *Creates the look of the multiplayerRules screen and tell the text ffaRules what to put in it.
     * It also tells the back button what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplayer_rules); //tells the class what xml goes with it.

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the text and links it to the correct text box in the xml
        ffaRules = (TextView) findViewById(R.id.ffaRules);

        //Tells the text box ffaRules what to put into it.
        ffaRules.setText("Create your own local scavenger hunt? \n\n"
                +"1. \n\n"
                +"2. \n\n"
                +"3. \n\n"
                +" \n\n"
                +"1. \n\n"
                +"2. ");
        ffaRules.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the Rules class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rules.class);
                startActivity(intent);
            }
        });
    }
}
