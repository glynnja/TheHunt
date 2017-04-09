package com.example.jacksonglynn.thehunt3;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

/***************************************************************************************************
 *
 * The following class generates the hard page of the Scavenger Hunt game.
 *
 * @author Jackson Glynn, Mason Mahoney, Austin VanKempen
 * @version (2/20/2017)
 **************************************************************************************************/
public class Hard extends ScavengerHunt{
    /*Creates the back button */
    private Button add, finish, back;

    /*Creates the Text shown in sorry*/
    private TextView sorry;

    private FrameLayout image;

//    static final int REQUEST_IMAGE_CAPTURE = 1;
//
//    private void dispatchTakePictureIntent() {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        }
//
//    }

    /***********************************************************************************************
     *Creates the look of the hard screen and tell the text sorry what to put in it. It also
     * tells the back button what to do when clicked.
     *@param savedInstanceState - creates the xml layout
     **********************************************************************************************/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hard_screen);

        image = (FrameLayout) findViewById(R.id.image);

        //creates the back button and links it to the correct button in the class
        back = (Button) findViewById(R.id.back);

        //creates the add button and links it to the correct button in the class
        add = (Button) findViewById(R.id.add);

        //creates the finish button and links it to the correct button in the class
        finish = (Button) findViewById(R.id.finish);

        //creates the text and links it to the correct text box in the xml
        sorry = (TextView) findViewById(R.id.sorry);

        //Tells the text box sorry what to put into it.
        sorry.setText("Enter your Picture Clue!");
        sorry.setMovementMethod(new ScrollingMovementMethod());


        /*******************************************************************************************
         * Creates the button listener for finish. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        finish.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the finishedEasy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinishedHard.class);
                startActivity(intent);

                //finish() saves the states of everything in the xml and transfers the array to
                //finishedEasy's xml
                finish();
            }
        });


        /*******************************************************************************************
        * Creates the button listener for add. This tells the buttons what to do when it is
        * clicked.
        ******************************************************************************************/
        add.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the easy class
             *
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
//                String ag = enter.getText().toString().trim();
//                //erases the edit text after submitting an answer
//                if(ag.length() != 0){
//                    mlistItems.add(ag);
//                    enter.setText("");
//                }
//                adpt.setNotifyOnChange(true);
//                list.setAdapter(adpt);
            }
        });


        /*******************************************************************************************
         * Creates the button listener for back. This tells the buttons what to do when it is
         * clicked.
         ******************************************************************************************/
        back.setOnClickListener(new View.OnClickListener() {


            /***************************************************************************************
             * tells the back button to go back to the local class
             * @param v - the button when clicked
             **************************************************************************************/
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Local.class);
                startActivity(intent);
            }
        });
    }
}
