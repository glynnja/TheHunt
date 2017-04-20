package com.example.jacksonglynn.thehunt3;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


/***************************************************************************************************
 *
 * The following class generates the preSaved page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class preDownGR extends ScavengerHunt{
    /*Creates the Array shown in the xml */
    private String grList[] = {"Go to the Blue Bridge.", "Go explore the Devos building.",
            "Check out the Van Andel Arena.", "Checkout The Bob.",
            "Find Rosa Parks Circle."};

    /*Creates the back button */
    private Button back;

    /*Creates the Text shown in sorry*/
    private TextView rules;

    /*Creates the ListView shown in the xml*/
    private ListView downGR;


    /***********************************************************************************************
     *Creates the look of the rules screen and adds an action listener for the buttons.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pre_downgr); //tells the class what xml goes with it.

        //creates the text rules and links it to the correct text box in the xml
        rules = (TextView) findViewById(R.id.rules);

        //creates the listView and links it to the correct listView in the class
        downGR = (ListView) findViewById(R.id.downGR);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);


        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, grList);
        downGR.setAdapter(adpt);
        downGR.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //Tells the text box clue what to put into it.
        rules.setText("Check the box when you are in Range of the Clue!");
        rules.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the preSaved class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), preSaved.class);
                startActivity(intent);
            }
        });

    }
}
