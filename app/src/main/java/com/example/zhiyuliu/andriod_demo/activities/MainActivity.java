package com.example.zhiyuliu.andriod_demo.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhiyuliu.andriod_demo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    private PopupWindow mPopWindow;
    private TextView mMenuTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenuTv = (TextView)findViewById(R.id.menu);
        mMenuTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupWindow();
            }
        });
    }

    /** called when click send button*/
    public void sendMessage(View view) {
        // response
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** called when click recycle button*/
    public void openRecycle(View view) {
        Intent recycleIntent = new Intent(this, RecycleLayoutActivity.class);
        startActivity(recycleIntent);
    }

    /** called when click popup window button*/
    private void showPopupWindow() {
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popuplayout, null);
        mPopWindow = new PopupWindow(contentView);
        mPopWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        mPopWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

        TextView tv1 = (TextView)contentView.findViewById(R.id.pop_computer);
        TextView tv2 = (TextView)contentView.findViewById(R.id.pop_financial);
        TextView tv3 = (TextView)contentView.findViewById(R.id.pop_manage);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);

        mPopWindow.showAsDropDown(mMenuTv);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.pop_computer:{
                Toast.makeText(this, "clicked computer", Toast.LENGTH_SHORT).show();
                mPopWindow.dismiss();
            }
            break;
            case R.id.pop_financial:{
                Toast.makeText(this,"clicked financial",Toast.LENGTH_SHORT).show();
                mPopWindow.dismiss();
            }
            break;
            case R.id.pop_manage:{
                Toast.makeText(this,"clicked manage",Toast.LENGTH_SHORT).show();
                mPopWindow.dismiss();
            }
            break;
        }
    }
}


