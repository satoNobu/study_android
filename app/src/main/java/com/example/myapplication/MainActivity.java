package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.textView)
    TextView text;

    @AfterViews
    void Initialize() {
        // 初期化処理など
        text.setText("アノテーション");

    }

}
