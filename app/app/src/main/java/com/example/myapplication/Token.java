package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token
{
    @SerializedName("accessToken")
    @Expose
    String access_token;
    Token( String access_token )
    {
        this.access_token = access_token;
    }
    public String getAccessToken()
    {
        return access_token;
    }
    public void setAccessToken( String access_token )
    {
        this.access_token = access_token;
    }
}