package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/***************************************************************************************************
 *
 * The following class generates the FinishedEasy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin van Kempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class FinishedEasy extends Easy {
    /*Creates the ListView shown in the xml*/
    ListView hunt;

    /*Creates the button on the main screen */
    Button back, done;


    /***********************************************************************************************
     *Creates the look of the FinishedEasy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_hunt);

        //creates the listView and links it to the correct listView in the class
        hunt = (ListView) findViewById(R.id.hunt);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the done button and links it to the correct button in the class
        done = (Button) findViewById(R.id.done);

        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
         android.R.layout.simple_list_item_multiple_choice, m_listItems);
        hunt.setAdapter(adpt);
        hunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);


        /*******************************************************************************************
         * Creates the button listener for done. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        done.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the done button to go back to display a message
             *
             * @param v - the button when clicked 
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Finished.class);
                startActivity(intent);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the Easy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });
    }
}
