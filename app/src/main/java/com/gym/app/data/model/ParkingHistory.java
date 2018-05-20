package com.gym.app.data.model;

import android.content.Context;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.Date;

public class ParkingHistory {

    @SerializedName("id")
    private int id;

    @SerializedName("start_datetime")
    private Timestamp start_date;

    @SerializedName("end_datetime")
    private Timestamp end_date;

    @SerializedName("park_spot")
    private ParkPlace mParkSpot;

    public ParkingHistory(){}

    public ParkPlace getParkSpot() {
        return mParkSpot;
    }


    public int getId(){
        return id;
    }

    public Timestamp getStart_date(){
        return start_date;
    }

    public Timestamp getEnd_date(){
        return end_date;
    }


    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return null;
    }
}
