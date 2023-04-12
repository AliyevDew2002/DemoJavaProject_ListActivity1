package com.example.demojavaproject_listactivity1.model;

import java.io.Serializable;

public class Member implements Serializable {
   private int profile;
   private String fullname;

   public Member(int profile, String fullname){
       this.profile=profile;
       this.fullname=fullname;
   }

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
