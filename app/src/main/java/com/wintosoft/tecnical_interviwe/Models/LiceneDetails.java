package com.wintosoft.tecnical_interviwe.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LiceneDetails {


    @SerializedName("imageFront")
    @Expose
    private String imageFront;
    @SerializedName("ImageBack")
    @Expose
    private String ImageBack;

    public String getImageFront() {
        return imageFront;
    }

    public void setImageFront(String imageFront) {
        this.imageFront = imageFront;
    }

    public String getImageBack() {
        return ImageBack;
    }

    public void setImageBack(String imageBack) {
        ImageBack = imageBack;
    }
}
