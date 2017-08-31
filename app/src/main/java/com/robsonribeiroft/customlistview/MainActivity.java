package com.robsonribeiroft.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.robsonribeiroft.customlistview.adapter.UserAdapter;
import com.robsonribeiroft.customlistview.util.CreateRandomUsers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_item);

        UserAdapter adapter = new UserAdapter(this, new CreateRandomUsers().create(30));
        listView.setAdapter(adapter);
    }
}
