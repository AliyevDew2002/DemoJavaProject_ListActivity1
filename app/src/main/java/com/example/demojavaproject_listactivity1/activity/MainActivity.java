package com.example.demojavaproject_listactivity1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.example.demojavaproject_listactivity1.R;
import com.example.demojavaproject_listactivity1.adapter.Member_Adapter;
import com.example.demojavaproject_listactivity1.model.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        listView=findViewById(R.id.listView);
        context=this;

        ArrayList<Member> members=new ArrayList<>();
       for (int i=0; i<=30; i++){
           members.add(new Member(R.mipmap.ic_launcher,"Shaxzod Aliyev:"+i));
       }
        refreshAdapter(members);
    }
    void refreshAdapter(ArrayList<Member> members){
        Member_Adapter member_adapter=new Member_Adapter(context,members);
        listView.setAdapter(member_adapter);

    }
}