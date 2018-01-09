package com.ishaandhamija.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    Button b1;
    RecyclerView r1;
    ArrayList<messages> message1;
    adapter ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message1=new ArrayList<>();
        message1.add(new messages("jjjj","ishaan"));
        message1.add(new messages("jjjj","hfahgfm"));

        r1=(RecyclerView)findViewById(R.id.recyler);
        ad=new adapter(this,message1);
        r1.setLayoutManager(new LinearLayoutManager(this));
        r1.setAdapter(ad);

        ad.notifyDataSetChanged();
    }
}
