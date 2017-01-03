package com.lucidastar.testdagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class FirstActivity extends AppCompatActivity {

    TextView mTextView;

    @Inject
    Cloth redCloth;

    @Inject
    ClothHandler clothHandler;
    @Inject
    Clothes mClothes;

    @Inject
    Trousers mTrousers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mTextView = (TextView) findViewById(R.id.tv_first);


        FirstComponent build = DaggerFirstComponent.builder().baseComponent(((MyApplication)getApplication()).getBaseComponent()).firstModule(new FirstModule()).build();
        build.inject(this);



//        FirstComponent build = DaggerFirstComponent.builder().firstModule(new FirstModule()).build();
//        build.inject(this);
//        mTextView.setText("红布料加工后变成了" + clothHandler.handle(redCloth) + "\nclothHandler地址:" + clothHandler+"布料:"+mClothes.getCloth());
        mTrousers.setName("裤子");

        mTextView.setText("红布料加工后变成了"+mTrousers.getName());


    }

    public void startSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
