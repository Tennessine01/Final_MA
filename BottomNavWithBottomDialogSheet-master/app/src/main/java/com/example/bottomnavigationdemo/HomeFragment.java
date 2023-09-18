package com.example.bottomnavigationdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.bottomnavigationdemo.ApiResponse.SubjectBook.Subject;
import com.example.bottomnavigationdemo.ApiResponse.SubjectBook.SubjectApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {
//    ListView lvbook;
//    ArrayList<String> arrayCourse;
//    private RequestQueue mRequestQueue;
//    private String iurl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        LinearLayout listBookView = (LinearLayout) view.findViewById(R.id.list_book);


//        ArrayList<String> listTitle = getData();
//        listTitle.add("gello");
//        listTitle.forEach(title -> {
//            View bookItemView = inflater.inflate(R.layout.button_book_component, null);
//            TextView titleView = bookItemView.findViewById(R.id.titleTxt);
//            titleView.setText(title);
//            listSexBookView.addView(bookItemView);
//        });
        getData(inflater, view);
        return view;
    }

    private void getData(LayoutInflater inflater, View view) {
        String BASE_URL = "https://openlibrary.org";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        SubjectApi api = retrofit.create(SubjectApi.class);

        Call<Subject> call = api.getLoveSubjects(10);
        call.enqueue(new Callback<Subject>() {
            @Override
            public void onResponse(Call<Subject> call, Response<Subject> response) {
                if (response.isSuccessful()) {
                    Subject subject = response.body();
                    // Xử lý dữ liệu ở đây
                    List<String> listTilte = new ArrayList<String>();
                    subject.getWorks().forEach(workItem -> {
                                                        String title = workItem.getTitle();
                                                        listTilte.add(title);}  );
                    displayTitles(inflater, view, listTilte);
                } else {
                    // Xử lý lỗi ở đây
                }
            }

            @Override
            public void onFailure(Call<Subject> call, Throwable t) {
                // Xử lý lỗi kết nối ở đây
            }
        });
    }
    // thể hiện sách ở trong horizontal scrollview
    private void displayTitles(LayoutInflater inflater, View view, List<String> listTitle) {
        LinearLayout listBookView = (LinearLayout) view.findViewById(R.id.list_book);
        //với mỗi giá trị argument lisTitle truyền vào:
        listTitle.forEach(title -> {

            View bookItemView = inflater.inflate(R.layout.button_book_component, null);

            //Tạo ra một object mới là titleView để truyền giá trị của listTile vào và gán nó ở trong titleTxt của file button_book_component
            TextView titleView = bookItemView.findViewById(R.id.titleTxt);
            titleView.setText(title);
            listBookView.addView(bookItemView);
        });
    }
}