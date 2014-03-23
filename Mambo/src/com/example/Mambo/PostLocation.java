package com.example.Mambo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by Sruti on 3/22/14.
 */
public class PostLocation extends MyActivity {
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("Got It", "Pt5");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postlocation);
        Log.i("Got it", Post.postToBeSent.getTitle());
        Log.i("Got it", Post.postToBeSent.getPost_statement());
        Log.i("Got it", Post.postToBeSent.getUser());
        Log.i("Got it", Post.postToBeSent.getEndTime());
    button = (Button) findViewById(R.id.Submit2_post);
    button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
           // getLocation();
            finish();
        }
    });


    }
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.emergency:
                    if (checked)
                        Post.postToBeSent.setCategory("EMERGENCY");
                        break;
                case R.id.social:
                    if (checked)
                        Post.postToBeSent.setCategory("Social");
                        break;
                case R.id.free:
                    if(checked)
                        Post.postToBeSent.setCategory("Free");
                    break;
                case R.id.promo:
                    Post.postToBeSent.setCategory("Promotion");
                    break;
                case R.id.misc:
                    Post.postToBeSent.setCategory("Miscellaneous");
                    break;
            }
        }
}
/*
    public void getLocation()
    {
        EditText Location = (EditText) findViewById(R.id.Address_post);

       // Post.postToBeSent.setCategory(Category.getText().toString());
    }
*/
