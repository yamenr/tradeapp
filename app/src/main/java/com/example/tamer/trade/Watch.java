package com.example.tamer.trade;

/**
 * Created by tamer on 3/9/2018.
 */

public class Watch {

    private String WatchID;
    private String UserId;
    private String WatchBrand;
    private String Color;
    private String WatchSpecs;
    private String Size;
    private String DesiredWatch;
    private String Condition;
    private String PhontoUrl;

    public Watch(String watchID, String userId, String watchBrand, String color, String watchSpecs, String size, String desiredWatch, String condition, String phontoUrl) {
        WatchID = watchID;
        UserId = userId;
        WatchBrand = watchBrand;
        Color = color;
        WatchSpecs = watchSpecs;
        Size = size;
        DesiredWatch = desiredWatch;
        Condition = condition;
        PhontoUrl = phontoUrl;
    }

    public Watch(){}

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String watchID) {
        WatchID = watchID;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getWatchBrand() {
        return WatchBrand;
    }

    public void setWatchBrand(String watchBrand) {
        WatchBrand = watchBrand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getWatchSpecs() {
        return WatchSpecs;
    }

    public void setWatchSpecs(String watchSpecs) {
        WatchSpecs = watchSpecs;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getDesiredWatch() {
        return DesiredWatch;
    }

    public void setDesiredWatch(String desiredWatch) {
        DesiredWatch = desiredWatch;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getPhontoUrl() {
        return PhontoUrl;
    }

    public void setPhontoUrl(String phontoUrl) {
        PhontoUrl = phontoUrl;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "WatchID='" + WatchID + '\'' +
                ", UserId='" + UserId + '\'' +
                ", WatchBrand='" + WatchBrand + '\'' +
                ", Color='" + Color + '\'' +
                ", WatchSpecs='" + WatchSpecs + '\'' +
                ", Size='" + Size + '\'' +
                ", DesiredWatch='" + DesiredWatch + '\'' +
                ", Condition='" + Condition + '\'' +
                ", PhontoUrl='" + PhontoUrl + '\'' +
                '}';
    }

}
