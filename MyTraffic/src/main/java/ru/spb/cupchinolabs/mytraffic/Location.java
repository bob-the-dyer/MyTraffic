package ru.spb.cupchinolabs.mytraffic;

import android.webkit.JavascriptInterface;

public class Location {

    static public Location INSTANCE = new Location();

    private String firstCoord = "59.93";
    private String secondCoord = "30.31";
    private int zoom = 14;

    private Location(){}

    @JavascriptInterface
    public String getFirstCoord() {
        return firstCoord;
    }

    @JavascriptInterface
    public String getSecondCoord() {
        return secondCoord;
    }

    @JavascriptInterface
    public int getZoom() {
        return zoom;
    }

    @JavascriptInterface
    public void setFirstCoord(String firstCoord) {
        this.firstCoord = firstCoord;
    }

    @JavascriptInterface
    public void setSecondCoord(String secondCoord) {
        this.secondCoord = secondCoord;
    }

    @JavascriptInterface
    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
}
