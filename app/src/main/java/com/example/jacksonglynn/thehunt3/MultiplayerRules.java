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

        //multiplayer rules.
        ffaRules.setText("Create your own multiplayer scavenger hunt? \n\n"
                +"1. \nIn multiplayer, you can either create your own hunt for others to play or play someone elses\n"
                +"2. \nAfter logging into Google Play, you will be able to hunt with others from around the world!\n"
                +"3. \n This is where you will choose whether to post a hunt or play someone elses!\n"
                +"4. \nIf you decide to play someone elses hunt, follow their clues until you finish all of the checkpoints!\n"
                +"5. \nYou will have to be within 50 feet of the location if you want to check that clue off your hunt.\n"
                +"6. \nAfter you have finished all of the clues, you have completed that persons hunt.\n"
                +"7. \nEither pick another hunt or make your own. Happy Hunting!\n"
                +" \n\n"
                +"1. \nIf you choose to play a presaved hunt, then you will first choose presaved.\n"
                +"2. Then pick from the list of presaved locations that you would like to play from."
                +"3. \nComplete all the checkmarks to complete that hunt! Happy Hunting!\n");
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
