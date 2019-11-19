package com.cos.instagramclone.Search;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.cos.instagramclone.R;
import com.cos.instagramclone.Utils.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {

    private static final String TAG = "SearchActivity";
    private Context mContext = SearchActivity.this;
    private static final int ACTIVITY_NUM = 1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupBottomNavigationView();
    }

    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
