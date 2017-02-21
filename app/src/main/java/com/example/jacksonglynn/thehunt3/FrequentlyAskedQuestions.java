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
        + " - this feature wont be available until release 2."
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
