package vn.edu.usth.library2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Home_fragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        ScrollView listBookView = (ScrollView).findViewById(R.id.horizontal_scrollview1);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}