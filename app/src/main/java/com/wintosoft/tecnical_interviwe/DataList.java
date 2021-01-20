package com.wintosoft.tecnical_interviwe;

import com.google.gson.annotations.SerializedName;
import com.wintosoft.tecnical_interviwe.Models.UserDetails;

import java.util.List;

public class DataList {
    @SerializedName("data")
    private List<UserDetails> userDetailsList;

    public void setUserDetailsList(List<UserDetails> userDetailsList) {
        this.userDetailsList = userDetailsList;
    }

    public List<UserDetails> getUserDetailsList() {
        return userDetailsList;
    }
}
