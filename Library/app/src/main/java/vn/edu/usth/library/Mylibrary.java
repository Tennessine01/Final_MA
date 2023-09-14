package vn.edu.usth.library;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;


public class Mylibrary extends AppCompatActivity {
    private static final String TAG = "MylibraryActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylibrary_layout);
        ImageButton imageButton = findViewById(R.id.librarybutton1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đổi sang Activity mới
                Intent intent = new Intent(Mylibrary.this, MainActivity.class); // Thay thế NewActivity bằng tên Activity mới của bạn

                // Bắt đầu Activity mới
                startActivity(intent);
            }
        });
        ImageButton imageButton2 = findViewById(R.id.librarybutton3);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đổi sang Activity mới
                Intent intent = new Intent(Mylibrary.this, Setting.class); // Thay thế NewActivity bằng tên Activity mới của bạn

                // Bắt đầu Activity mới
                startActivity(intent);
            }
        });
    }
}