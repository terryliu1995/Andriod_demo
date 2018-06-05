package com.example.zhiyuliu.andriod_demo.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zhiyuliu.andriod_demo.R;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // get intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //capture the layout and set text
        TextView textView =findViewById(R.id.textView);
        textView.setText(message);
    }

    /* call result activity when click button, and get result */
    public void getResult(View view) {
        // do someting
        Intent i = new Intent(this, ResultActivity.class);
        startActivityForResult(i, 1);
    }
    // get result from result activity
    protected  void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1 && resultCode == Activity.RESULT_OK) {
            String result = data.getStringExtra("result");
            TextView textView2 =findViewById(R.id.textView2);
            textView2.setText(result);
        }
    }
}
