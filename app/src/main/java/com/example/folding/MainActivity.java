package com.example.folding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.lanjing.easytoastlibrary.EasyToast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_one)
    Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_one)
    public void onViewClicked() {
        Intent one = new Intent(this,OneActivity.class);
        startActivity(one);
        EasyToast.showLongSuccessToast(this,"你点击了按钮");
    }
}
