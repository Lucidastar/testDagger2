package com.lucidastar.testdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    @Inject
    Cloth cloth;
//    @Inject
//    Shoe shoe;

//    @Inject
//    Cloth redCoth;


//    @Inject
//    @Named("blue")
//    Cloth blueCoth;

    @Inject
    Clothes clothes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.tv_test);

//        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
//        build.inject(this);





//        mTextView.setText("我有"+clothes.toString());
//        mTextView.setText("我有"+redCoth.toString()+"和"+blueCoth.toString());

        //clothes.getCloth() 会自动的去找MainComponent中带有@Provides注解的方法返回
        mTextView.setText("redCloth=clothes中的cloth吗?:" + (cloth == clothes.getCloth()));
//        mTextView.setText(redCoth + clothes.getCloth().toString());
//        Log.i("mine", "onCreate: "+cloth.toString());

    }
}
