package com.example.jacksonglynn.thehunt3;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
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
public class FinishedEasy extends MapsActivity {
    /*Creates the ListView shown in the xml*/
    private ListView hunt, huntName;

//    /*Creates the Text shown in the xml*/
//    private TextView huntName;

    /*Creates the button on the main screen */
    private Button back, done;


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

        //creates the listView and links it to the correct listView in the class
        huntName = (ListView) findViewById(R.id.huntName);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the done button and links it to the correct button in the class
        done = (Button) findViewById(R.id.done);

//        //creates the text clue and links it to the correct text box in the xml
//        huntName = (TextView) findViewById(R.id.huntName);

        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,
         android.R.layout.simple_list_item_multiple_choice, mlistItems);
        hunt.setAdapter(adpt);
        hunt.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
//                android.R.layout.simple_list_item_1, mStringList) {
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent) {
//                View view = super.getView(position, convertView, parent);
//                TextView text = (TextView) view.findViewById(android.R.id.text1);
//                text.setTextColor(Color.BLACK);
//                return view;
//            }
//        };


        //creates the list view and sets up how it looks and acts
        final ArrayAdapter<String> adpt2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, namelist) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = ((TextView) view.findViewById(android.R.id.text1));
                textView.setTextSize(35);
                textView.setTextColor(0xFFFFFFFF);
                //textView.setMinHeight(0); // Min Height
                //textView.setTextColor(3324321);
               // textView.setMinimumHeight(0); // Min Height
                //textView.setHeight(); // Height
                return view;
            }
        };
        huntName.setAdapter(adpt2);
        huntName.setChoiceMode(ListView.CHOICE_MODE_NONE);

       // ((ListView) convertView.findViewById(R.id.huntName)).setTypeface(null, Typeface.BOLD);

        //((TextView) convertView.findViewById(R.id.huntName)).setTypeface(null, Typeface.BOLD);
       // huntName.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

//        huntName.setText(namelist.toString().trim());
//        huntName.setMovementMethod(new ScrollingMovementMethod());

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

              //  for(int i = 0; i < mlistItems.size(); i++) {
                   // if (mLocationRequest == locList(mlistItems.get(i))) {
                        Intent intent = new Intent(getApplicationContext(), Finished.class);
                        startActivity(intent);
                   // }
              //  }
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
                namelist.clear();
                Intent intent = new Intent(getApplicationContext(), Easy.class);
                startActivity(intent);
            }
        });
    }
}
