package com.sora.demon8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sora on 2015/11/28.
 */
public class FActivity extends Activity {
    private Button tb1;
    private Button tb2;
    private Context mContext;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity);
        mContext = this;
        tb1 = (Button)findViewById(R.id.bt1);
        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,SActivity.class);
                startActivity(intent);
            }
        });
        tb2 = (Button)findViewById(R.id.bt2);
        tb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,SActivity.class);
                startActivityForResult(intent,1);
            }
        });
        tv = (TextView)findViewById(R.id.textView);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==2){
            String content = data.getStringExtra("data");
            tv.setText(content);
            }
         }
}


