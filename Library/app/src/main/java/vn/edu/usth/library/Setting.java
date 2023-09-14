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


public class Setting extends AppCompatActivity {
    private static final String TAG = "SettingActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_layout);
        ImageButton imageButton = findViewById(R.id.settingbutton1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đổi sang Activity mới
                Intent intent = new Intent(Setting.this, MainActivity.class); // Thay thế NewActivity bằng tên Activity mới của bạn

                // Bắt đầu Activity mới
                startActivity(intent);
            }
        });
        ImageButton imageButton2 = findViewById(R.id.settingbutton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển đổi sang Activity mới
                Intent intent = new Intent(Setting.this, Mylibrary.class); // Thay thế NewActivity bằng tên Activity mới của bạn

                // Bắt đầu Activity mới
                startActivity(intent);
            }
        });
    }
}