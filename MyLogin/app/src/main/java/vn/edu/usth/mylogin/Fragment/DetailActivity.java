package vn.edu.usth.mylogin.Fragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import vn.edu.usth.mylogin.Domain.BookDomain;
import vn.edu.usth.mylogin.Helper.ManagementMyLibrary;
import vn.edu.usth.mylogin.R;

public class DetailActivity extends AppCompatActivity {
    private Button addToLibraryBtn;
    private TextView plusBtn, minusBtn, titleTxt, feeTxt, descriptionTxt, numberOrderTxt, authorTxt, ratingTxt, timeTxt;
    private ImageView picBook;
    private BookDomain object;
    private int numberOrder = 1;
    private ManagementMyLibrary managementMyLibrary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail_book);

        managementMyLibrary = new ManagementMyLibrary(DetailActivity.this);

        initView();
        getBundle();
    }

    private void getBundle() {
        object = (BookDomain) getIntent().getSerializableExtra("object");

        int drawableResourceId = this.getResources().getIdentifier(object.getPicUrl(), "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picBook);

        titleTxt.setText(object.getTitle());
        descriptionTxt.setText(object.getDescription());
        ratingTxt.setText(object.getRating() + " ");
        authorTxt.setText(object.getAuthor() + " " );
        timeTxt.setText(object.getTime() + " ");
        addToLibraryBtn.setText("Add to library");


        addToLibraryBtn.setOnClickListener(v -> {
            managementMyLibrary.insertBook(object);
        });
    }

    private void initView() {
        addToLibraryBtn = findViewById(R.id.addToLibraryBtn);
        timeTxt = findViewById(R.id.timeTxt);
        titleTxt=findViewById(R.id.titleTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        picBook = findViewById(R.id.bookPic);
        authorTxt = findViewById(R.id.AuthorTxt);
        ratingTxt = findViewById(R.id.ratingTxt);

    }
}