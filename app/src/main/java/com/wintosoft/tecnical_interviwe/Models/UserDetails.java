package com.wintosoft.tecnical_interviwe.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserDetails {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("userDetails")
    @Expose
    private UserDetailsNew userDetails;
    @SerializedName("liceneDetail")
    @Expose
    private LiceneDetails liceneDetail;

//@SerializedName("firstName")
//@Expose
//private String firstName;
//    @SerializedName("lastName")
//    @Expose
//private String lastName;
//    @SerializedName("phone")
//    @Expose
//private String phone;
//    @SerializedName("email")
//    @Expose
//private String email;
//    @SerializedName("nic")
//    @Expose
//private String nic;
//    @SerializedName("password")
//    @Expose
//private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDetailsNew getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetailsNew userDetails) {
        this.userDetails = userDetails;
    }

    public LiceneDetails getLiceneDetail() {
        return liceneDetail;
    }

    public void setLiceneDetail(LiceneDetails liceneDetail) {
        this.liceneDetail = liceneDetail;
    }
}
