package vn.edu.usth.mylogin.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import vn.edu.usth.mylogin.Adapter.LibraryListAdapter;
import vn.edu.usth.mylogin.Helper.ChangeNumberItemsListener;
import vn.edu.usth.mylogin.Helper.ManagementMyLibrary;
import vn.edu.usth.mylogin.R;

public class MyLibrary extends Fragment {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;
    private ManagementMyLibrary managementMyLibrary;
    private TextView totalFeeTxt, taxTxt, deliveryTxt, totalTxt, emptyTxt;

    private View view_list;
    private double tax;
    private ScrollView scrollView;
    private ImageView backBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_library, container, false);
        managementMyLibrary = new ManagementMyLibrary(getContext());
        recyclerViewList = view.findViewById(R.id.myLibrary_view);
//        initList();
//        initView();
        return view;
    }



    private void initList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        adapter = new LibraryListAdapter(managementMyLibrary.getListBook(), getContext(), new ChangeNumberItemsListener() {
            @Override
            public void changed() {

            }
        });

        recyclerViewList.setAdapter(adapter);

        if(managementMyLibrary.getListBook().isEmpty()){
            emptyTxt.setVisibility(View.VISIBLE);
            scrollView.setVisibility(View.GONE);
        }else{
            emptyTxt.setVisibility(View.GONE);
            scrollView.setVisibility(View.VISIBLE);
        }
    }



    private void initView(View view) {
        recyclerViewList = view.findViewById(R.id.myLibrary_view);
        scrollView = view.findViewById(R.id.scrollView);
        //backBtn = findViewById(R.id.backBtn);
        emptyTxt = view.findViewById(R.id.emptyTxt);
    }

}