package com.simple.gh.myapplication.sqlobj;

/**
 * Created by gh on 2017-09-14.
 */

public class FileInfo {
    private String serverip;
    private int length ;
    private int pos ;
    private int start ;

    public FileInfo() {
        length = 0;
        pos = 0;
        start = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getServerip() {
        return serverip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

}
