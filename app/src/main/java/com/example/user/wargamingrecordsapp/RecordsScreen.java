package com.example.user.wargamingrecordsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecordsScreen extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    List<Unit> unitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records_screen);

        unitList = new ArrayList<>();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        unitList.add(new Unit("Unit 1"));
        unitList.add(new Unit("Unit 2"));
        unitList.add(new Unit("Unit 3"));
        unitList.add(new Unit("Unit 4"));
        unitList.add(new Unit("Unit 5"));
        unitList.add(new Unit("Unit 6"));
        unitList.add(new Unit("Unit 7"));
        unitList.add(new Unit("Unit 8"));
        unitList.add(new Unit("Unit 9"));
        unitList.add(new Unit("Unit 10"));
        unitList.add(new Unit("Unit 11"));
        unitList.add(new Unit("Unit 12"));
        unitList.add(new Unit("Unit 13"));
        unitList.add(new Unit("Unit 14"));
        unitList.add(new Unit("Unit 15"));
        unitList.add(new Unit("Unit 16"));
        unitList.add(new Unit("Unit 17"));
        unitList.add(new Unit("Unit 18"));
        unitList.add(new Unit("Unit 19"));
        unitList.add(new Unit("Unit 20"));

        // specify an adapter (see also next example)
        adapter = new UnitRecordAdapter(this, unitList);
        mRecyclerView.setAdapter(adapter);
    }
}
