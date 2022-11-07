package com.lanriviot.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button11 = findViewById(R.id.btn11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.bilibili.com");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        Button button12 = (Button) findViewById(R.id.btn12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://10.11.1.30");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        Button button21 = (Button) findViewById(R.id.btn21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.douyin.com/search/%E4%BD%95%E9%87%8E%E5%8D%8E?source=normal_search&aid=175cfff2-aa9a-494b-89c8-2abda56152b7&enter_from=recommend&focus_method=&gid=7118334844450426120");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        //
        Button button22 = (Button) findViewById(R.id.btn22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://space.bilibili.com/18343098?spm_id_from=333.337.0.0");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        //
        Button button31 = (Button) findViewById(R.id.btn31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://m.weibo.cn/u/1664562813?uid=1664562813&t=0&luicode=10000011&lfid=100103type%3D1%26q%3D%E6%B2%B3%E9%87%8E%E5%8D%8E");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button button32 = (Button) findViewById(R.id.btn32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://live.bilibili.com/6?spm_id_from=333.337.0.0");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //
        Button button41 = (Button) findViewById(R.id.btn41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://live.bilibili.com/26184858?broadcast_type=0&is_room_feed=1&spm_id_from=333.999.0.0");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button button42 = (Button) findViewById(R.id.btn42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://live.bilibili.com/26051501?broadcast_type=0&is_room_feed=1&spm_id_from=333.999.0.0");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
//        //
//        Button button31 = (Button) findViewById(R.id.btn31);
//        button31.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        Button button32 = (Button) findViewById(R.id.btn32);
//        button32.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


    }
}