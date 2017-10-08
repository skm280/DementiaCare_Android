package com.example.sung.dementiacare.information;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sung.dementiacare.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Sung on 2017. 9. 3..
 */

public class InformationVideoActivity extends AppCompatActivity {
    final int ARRAY_RESOURCE_ID = R.array.list_info_title_media;

    static String[] menuList;

    @BindView(R.id.list_info_title)
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_information);
        ButterKnife.bind(this);

        menuList = getResources().getStringArray(ARRAY_RESOURCE_ID);

        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.listview_item_layout, menuList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), InformationVideoListActivity.class);
                intent.putExtra("sub_index", position);
                startActivity(intent);
            }
        });

    }
}