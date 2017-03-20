package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/***************************************************************************************************
 *
 * The following class generates the Finished page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class MultiFinished extends FinishedPlay {
    /*Creates the button on the main screen */
    private Button done;

    /*Creates the Text shown in win*/
    private TextView win;


    /***********************************************************************************************
     *Creates the look of the Finished screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_done);

        //creates the done button and links it to the correct button in the class
        done = (Button) findViewById(R.id.done);

        //creates the text and links it to the correct text box in the xml
        win = (TextView) findViewById(R.id.win);

        //Tells the text box Win what to put into it.
        win.setText("Congratulations You Completed:\n" + playList.get(0).toString());
        win.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for done. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        done.setOnClickListener(new View.OnClickListener() {


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
                //clears the playList so it doesn't affect the MulitPlay class
                playList.clear();
            }
        });
    }
}
