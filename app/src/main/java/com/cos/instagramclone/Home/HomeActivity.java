package com.cos.instagramclone.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.cos.instagramclone.R;
import com.cos.instagramclone.Utils.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    private Context mContext = HomeActivity.this;
    private static final int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupBottomNavigationView();
        setupViewPager();
    }

    private void setupViewPager(){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager(), 1);
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new MessagesFragment());
        ViewPager viewPager = findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_home_home);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);

    }

    // 모든 Activity는 activity_home을 공유해서 사용한다.
    // 모든 Activity는 fragment를 통해 화면을 구분한다.
    // BottomNavigationView에서 체크된 메뉴에 색깔변화를 위해 setChecked()를 이용한다.
    // BottomNavigationView에 ViewPager를 이용하면 양 옆의 Activity가 메모리로 로딩되기 때문에 비효율적이다.
    private void setupBottomNavigationView(){
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
