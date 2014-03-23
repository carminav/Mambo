package com.example.Mambo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
   private Button button;


//    View view;
  //  callContentPage_intent.setData(Uri);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Intent callContentPage_intent = new Intent(this, PostContent.class);
     //   final Intent callLocationPage_intent = new Intent(this, PostLocation.class);
        button = (Button) findViewById(R.id.MainPost_button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(callContentPage_intent);
              //  Log.i("Got it", Post.postToBeSent.getCategory());
                //Log.i("Got it", Post.postToBeSent.get());
                //Log.i("Got it", Post.postToBeSent.getTitle());
                //Log.i("Got it", Post.postToBeSent.getTitle());
                //Log.i("Got it", Post.postToBeSent.getTitle());
                //Log.i("Got it", Post.postToBeSent.getTitle());
     //           startActivity(callLocationPage_intent);

            }

        }
        );

    }



}
