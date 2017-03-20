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
 * The following class generates the localRules page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class LocalRules extends ActionBarActivity {
    /*Creates the back button */
    private Button back;

    /*Creates the Text shown in ffaRules*/
    private TextView ffaRules;


    /***********************************************************************************************
     *Creates the look of the localRules screen and tell the text ffaRules what to put in it.
     * It also tells the back button what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_rules);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the text and links it to the correct text box in the xml
        ffaRules = (TextView) findViewById(R.id.ffaRules);

        //Tells the text box ffaRules what to put into it.
        ffaRules.setText("In Local there are three options! \n"
                +"      - Easy, PreSaved, and Hard. \n\n\n"
                +"Easy:\n"
                +"In the Easy option it will ask you for two different things.   \n"
                +"      - The name of your scavenger hunt and the clues to your scavenger hunt. \n\n"
                +"Some requirements to the name and the clues. \n"
                +"      - You must have entered something in the name and you must have at least 3 clues. \n\n"
                +"If you mess up on a clue that you've already added. \n"
                +"      - Find your clue in the screen below, Check the box to that clue and hit the delete button. \n\n"
                +"When you are finished creating your scavenger hunt click Finish scavenger hunt and begin playing your hunt.\n\n\n"
                +"PreSaved:\n "
                +"In PreSaved there are three options.\n"
                +"      - GVSU, Allendale, and Downtown Grand Rapids\n\n"
                +"How to play each PreSaved\n"
                +"      - Walk within 25 meters of the clue to check the box when all boxes are checked you win\n\n\n"
                +"Hard:\n"
                +"In hard you will be asked to add a picture clue.\n"
                +"      - Simply click the icon to find a picture on google images, and then click the add button.\n\n"
                +"When you finished adding to the scavenger hunt.\n"
                +"      - Click Finish Scavenger Hunt and enjoy playing your hunt.");
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
