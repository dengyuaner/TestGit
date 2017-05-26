package com.dy.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 测试git，提交，更新，解决冲突
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //本地修改代码后提交到服务器

        //我在本地修改内容，新增一条注释

        //我在服务端修改内容，新增一条注释
    }
}
