package com.cos.instagramclone.Share;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.cos.instagramclone.R;
import com.cos.instagramclone.Utils.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ShareActivity extends AppCompatActivity {

    private static final String TAG = "ShareActivity";
    private Context mContext = ShareActivity.this;
    private static final int ACTIVITY_NUM = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: ShareActivity");
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
