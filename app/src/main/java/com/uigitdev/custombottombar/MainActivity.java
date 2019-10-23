package com.uigitdev.custombottombar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uigitdev.custombottombar.model.CustomBottomItem;
import com.uigitdev.custombottombar.uigitdev.design.CustomBottomBar;
import com.uigitdev.custombottombar.uigitdev.design.adapter.ItemAdapter;

public class MainActivity extends AppCompatActivity implements ItemAdapter.ItemSelectorInterface {
    private CustomBottomBar customBottomBar;
    public static final int BOOKMARK = 0;
    public static final int LIKES = 1;
    public static final int SEARCH = 2;
    public static final int PROFILE = 3;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customBottomBar = new CustomBottomBar(this, findViewById(R.id.customBottomBar), MainActivity.this);
        initItems();
        customBottomBar.changeBackground(getString(R.color.colorItemDefaultBackground));
        customBottomBar.setDefaultBackground(getString(R.color.colorItemDefaultBackground));
        customBottomBar.setDefaultTint(getString(R.color.colorItemDefaultTint));
        customBottomBar.changeDividerColor(getString(R.color.colorDivider));
        customBottomBar.hideDivider();
        customBottomBar.apply(BOOKMARK);
    }

    @SuppressLint("ResourceType")
    private void initItems() {
        CustomBottomItem bookmark = new CustomBottomItem(BOOKMARK, R.drawable.ic_bookmark, getString(R.string.item_0), getString(R.color.colorItemBackground), getString(R.color.colorItemTint));
        CustomBottomItem likes = new CustomBottomItem(LIKES, R.drawable.ic_likes, getString(R.string.item_1), getString(R.color.colorItem1Background), getString(R.color.colorItem1Tint));
        CustomBottomItem search = new CustomBottomItem(SEARCH, R.drawable.ic_search, getString(R.string.item_2), getString(R.color.colorItem2Background), getString(R.color.colorItem2Tint));
        CustomBottomItem profile = new CustomBottomItem(PROFILE, R.drawable.ic_profile, getString(R.string.item_3), getString(R.color.colorItem3Background), getString(R.color.colorItem3Tint));

        customBottomBar.addItem(bookmark);
        customBottomBar.addItem(likes);
        customBottomBar.addItem(search);
        customBottomBar.addItem(profile);
    }

    @Override
    public void itemSelect(int selectedID) {
        switch (selectedID){
            case BOOKMARK:
                //todo do something, when Bookmark is selected
                Toast.makeText(MainActivity.this, "Bookmark", Toast.LENGTH_LONG).show();
                break;
            case LIKES:
                //todo do something, when Likes is selected
                Toast.makeText(MainActivity.this, "Likes", Toast.LENGTH_LONG).show();
                break;
            case SEARCH:
                //todo do something, when Search is selected
                Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_LONG).show();
                break;
            case PROFILE:
                //todo do something, when Profile is selected
                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
