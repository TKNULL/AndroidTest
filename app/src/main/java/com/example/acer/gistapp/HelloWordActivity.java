package com.example.acer.gistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//1、活动必须继承Activity或者它的子类（AppCompatActivity是Activity的子类）
public class HelloWordActivity extends AppCompatActivity {
    //2、重写onCreate方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //3、调用父类的onCreate方法
        super.onCreate(savedInstanceState);
        //4、给活动绑定一个布局，布局文件在【res】里面
        setContentView(R.layout.first_layout);

        //首先xml布局里面有button,在activity里面，为button添加Toast
        //通过findViewById方法获取在布局文件中定义的元素，得到按钮的实例
        //实例.setOnClickListener方法，来为实例（按钮）注册一个点击监听器，当点击的时候就会执行监听器里面的方法
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(HelloWordActivity.this,"你点击了按钮1",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
