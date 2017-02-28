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
 * The following class generates the FrequentlyAskedQuestions page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin van Kempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class FrequentlyAskedQuestions extends ActionBarActivity {
    /*Creates the back button */
    Button back;

    /*Creates the Text shown in ffaRules*/
    private TextView ffaRules;


    /***********************************************************************************************
     *Creates the look of the faq screen and tell the text ffaRules what to put in it. It also
     * tells the back button what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq_screen);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the text and links it to the correct text box in the xml
        ffaRules = (TextView) findViewById(R.id.ffaRules);

        //Tells the text box ffaRules what to put into it.
        ffaRules.setText("1.How does one create a Scavenger Hunt? \n"
        + " - you can create a scavenger hunt by going to local and picking easy.\n"
        + "2. Is there pre saved scavenger hunts?\n"
        + " - there are pre saved scavenger hunts under presaved in local.\n"
        + "3. Can I share my scavenger Hunt with others?\n"
        + " - Yes, and this feature wont be available until release 2!\n"
        + "4. Can I play this scavenger hunt with multiple players?\n"
        + " - Yes, and this feature will be available in release 2!\n"
        + "5. Does easy also utilize the Google maps API?\n"
        + " - No, only hard will utilize the Google maps API.\n"
        + "6. What is a Local scavenger hunt?\n"
        + " - A local game is the same thing as a single player game.\n"
        + "7. How will you find what you are looking for or even know what to look for?\n"
        + " - The creator will give you clue on what it is you have to find.\n"
        + "8. What happens once the scavenger hunt is completed?"
        + " - Once you have completed the scavenger hunt then you have won the game!\n"
        + "9. Is this the best scavenger hunt out there?\n"
        + " - Well duh, of course it is!\n"
        + "10. If you have any further questions send this to WelcomeToTheHunt2017@gmail.com\n"
        );
        ffaRules.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the rules class
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
