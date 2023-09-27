package vn.edu.usth.mylogin.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import vn.edu.usth.mylogin.Adapter.BookListAdapter;
import vn.edu.usth.mylogin.Domain.BookDomain;
import vn.edu.usth.mylogin.R;

public class Home extends Fragment {
    private RecyclerView.Adapter adapterBookList;
    private RecyclerView recyclerViewBook, recyclerViewBook2, recyclerViewBook3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewBook = view.findViewById(R.id.HomeView1);
        initRecyclerview();

        recyclerViewBook2 = view.findViewById(R.id.HomeView2);
        initRecyclerview2();

        recyclerViewBook3 = view.findViewById(R.id.HomeView3);
        initRecyclerview3();
        return view;
    }
    private void initRecyclerview() {
        ArrayList<BookDomain> items=new ArrayList<>();
        items.add(new BookDomain(
                "A Million To One",
                "Description",
                "Content",
                "book1",1920,4," Tony Faggioli"));
        items.add(new BookDomain(
                "Last Hope",
                "Description",
                "Content",
                "book2",1930,4," Quarry Jack"));
        items.add(new BookDomain("Harry Potter",
                "Description",
                "Content",
                "book3",2010,4," J.K.Rowling"));
        items.add(new BookDomain("A Kite for Moon",
                "Description",
                "Content",
                "book4",2014,4," Jane Yolen"));
        recyclerViewBook.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        adapterBookList= new BookListAdapter(items);
        recyclerViewBook.setAdapter(adapterBookList);
    }
    private void initRecyclerview2() {
        ArrayList<BookDomain> items=new ArrayList<>();
        items.add(new BookDomain("The Mind Of A Leader",
                "Description",
                "Content",
                "book5",2015,4,"Kevin Anderson"));
        items.add(new BookDomain("The Cour Age Of Hope Less Ness",
                "Description",
                "Content",
                "book6",1960,4," Slavoj Zizek"));
        items.add(new BookDomain("The Death Of Vivek Oji",
                "Description",
                "Content",
                "book7",1988,4," Akwaeke Emezi"));


        recyclerViewBook2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        adapterBookList= new BookListAdapter(items);
        recyclerViewBook2.setAdapter(adapterBookList);
    }


    private void initRecyclerview3() {
        ArrayList<BookDomain> items=new ArrayList<>();
        items.add(new BookDomain("Thrill Of The Chase",
                "Description",
                "Content",
                "book8",1999,4,"Ellie Roth"));
        items.add(new BookDomain("Memory",
                "Description",
                "Content",
                "book9",2007,4," Angelina Alodo"));
        items.add(new BookDomain("The Litte Dog",
                "Description",
                "Content",
                "book10",2009,4," Joson"));


        recyclerViewBook3.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        adapterBookList=new BookListAdapter(items);
        recyclerViewBook3.setAdapter(adapterBookList);
    }
}