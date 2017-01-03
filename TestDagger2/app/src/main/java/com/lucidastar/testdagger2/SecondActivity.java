package com.lucidastar.testdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    TextView mTextView;
    @Inject
    Cloth blueCloth;
    @Inject
    ClothHandler clothHandler;

    @Inject
    Trousers mTrousers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = (TextView) findViewById(R.id.tv_second);
        SecondComponent build = DaggerSecondComponent.builder().baseComponent(((MyApplication)getApplication()).getBaseComponent()).secondModule(new SecondModule()).build();
        build.inject(this);
//        SecondComponent build = DaggerSecondComponent.builder().secondModule(new SecondModule()).build();
//        build.inject(this);
        mTextView.setText("蓝布料加工后变成了" + clothHandler.handle(blueCloth) + "\nclothHandler地址:" + clothHandler+"其他"+mTrousers);

    }
}
