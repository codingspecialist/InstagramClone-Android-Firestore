package com.cos.instagramclone.Profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cos.instagramclone.Likes.LikeActivity;
import com.cos.instagramclone.R;
import com.cos.instagramclone.Utils.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "ProfileActivity";
    private Context mContext = ProfileActivity.this;
    private static final int ACTIVITY_NUM = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setupBottomNavigationView();
        // 6강 추가
        setupToolbar();
    }

    // 6강 추가
    private void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar); //기본 툴바 변경

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d(TAG, "onMenuItemClick: "+item.getItemId());
                switch (item.getItemId()){
                    case R.id.profileMenu:
                        break;
                }
                return false;
            }
        });
    }

    // 6강 추가
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);

        return true;
    }

    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
