package com.example.Mambo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TimePicker;
import android.util.Log;

/**
 * Created by Sruti on 3/22/14.
 */
public class PostContent extends MyActivity {
    private Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postcontent);

        final Intent callLocationPage_intent = new Intent(this, PostLocation.class);
        button = (Button) findViewById(R.id.Submit1_post);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                getInfo();
                Log.i("Got It", "Pt4");
               startActivity(callLocationPage_intent);
                finish();
            }
        });
    }

        private void getInfo(){
        Log.i("Got It", "Pt1");
        EditText Title = (EditText) findViewById(R.id.Title_post);
        EditText Content = (EditText) findViewById(R.id.Content_post);
        EditText User = (EditText) findViewById(R.id.Name_post);
        TimePicker ClearTime = (TimePicker) findViewById(R.id.Timer_post);
            //////
            Log.i("Got It", "Pt2");
            if( Title.getText() == null && Title.getText().toString().length() == 0  )
                Title.setError( "Don't forget the Title!" );
            if( Content.getText() == null && Content.getText().toString().length() == 0 )
                Content.setError( "Need the deetz" );
            if( User.getText() == null && User.getText().toString().length() == 0 )
                User.setError( "Who's posting? Tell Us" );
            Log.i("Got It", "Pt3");
            ////////
            Post.postToBeSent = new Post("","","","",Title.getText().toString(), Content.getText().toString(),
                    User.getText().toString(), "", "","");
            ClearTime.clearFocus();
            Post.postToBeSent.setEndTime(ClearTime.getCurrentHour().toString().concat(":".concat(ClearTime.getCurrentMinute().toString())));

            CheckBox Anon = (CheckBox) findViewById(R.id.checkBox);
            if (Anon.isChecked())
                Post.postToBeSent.setUser("Anonymous");

        }




}
