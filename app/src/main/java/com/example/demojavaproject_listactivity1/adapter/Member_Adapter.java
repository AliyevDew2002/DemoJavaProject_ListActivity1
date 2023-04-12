package com.example.demojavaproject_listactivity1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demojavaproject_listactivity1.R;
import com.example.demojavaproject_listactivity1.model.Member;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Member_Adapter extends BaseAdapter {

    Context context;
    ArrayList<Member> members;
    LayoutInflater inflater;

    public Member_Adapter(Context context, ArrayList<Member> members){
        this.context=context;
        this.members=members;
        this.inflater=(LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return members.size();
    }

    @Override
    public Member getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.member_qolib, null);


        ImageView profile=convertView.findViewById(R.id.iv_profile);
        TextView fullname=convertView.findViewById(R.id.tv_fullname);

        Member member=members.get(position);

        profile.setImageResource(member.getProfile());
        fullname.setText(member.getFullname());


        return convertView ;
    }
}
