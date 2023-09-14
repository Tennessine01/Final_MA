package vn.edu.usth.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton = findViewById(R.id.homebutton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đổi sang Activity mới
                Intent intent = new Intent(MainActivity.this, Mylibrary.class); // Thay thế NewActivity bằng tên Activity mới của bạn

                // Bắt đầu Activity mới
                startActivity(intent);
            }
        });
        ImageButton imageButton2 = findViewById(R.id.homebutton3);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đổi sang Activity mới
                Intent intent = new Intent(MainActivity.this, Setting.class); // Thay thế NewActivity bằng tên Activity mới của bạn

                // Bắt đầu Activity mới
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: This is a log message.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: This is a log message.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: This is a log message.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: This is a log message.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: This is a log message.");
    }
}

