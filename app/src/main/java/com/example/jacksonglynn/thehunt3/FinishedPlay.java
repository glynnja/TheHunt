package com.example.jacksonglynn.thehunt3;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/***************************************************************************************************
 *
 * The following class generates the FinishedEasy page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class FinishedPlay extends MultiPlay {
    /*Creates the ListView shown in the xml*/
    private ListView hunt, huntName;

    /*Creates the button on the main screen */
    private Button back, done;

    /*Creates a counter*/
    private int count = 0;


    /***********************************************************************************************
     *Creates the look of the FinishedEasy screen and tell the texts what to put in it. It also
     * tells the buttons what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_play);

        //creates the listView and links it to the correct listView in the class
        hunt = (ListView) findViewById(R.id.hunt);

        //creates the listView and links it to the correct listView in the class
        huntName = (ListView) findViewById(R.id.huntName);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the done button and links it to the correct button in the class
        done = (Button) findViewById(R.id.done);

        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, playList2);

        hunt.setAdapter(adpt);
        hunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, playList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = ((TextView) view.findViewById(android.R.id.text1));
                textView.setTextSize(35);
                textView.setTextColor(0xFFFFFFFF);
                return view;
            }
        };
        huntName.setAdapter(adpt2);
        huntName.setChoiceMode(ListView.CHOICE_MODE_NONE);


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
                for(int c = 0; c < playList2.size()+1; c++){
                    if(hunt.isItemChecked(c)){
                        count++;
                    }
                    if(count == playList2.size()+1){
                        Intent intent = new Intent(getApplicationContext(), MultiFinished.class);
                        startActivity(intent);
                    }
                }
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
                locList4.clear();
                playList.clear();
                playList2.clear();
                Intent intent = new Intent(getApplicationContext(), MultiPlay.class);
                startActivity(intent);
            }
        });
    }
}