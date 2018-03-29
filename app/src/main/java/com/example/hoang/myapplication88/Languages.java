package com.example.hoang.myapplication88;

/**
 * Created by hoang on 3/28/2018.
 */

public class Languages {
    private String name;
    private String filename;
    private String fileurl;

    public Languages(String name, String filename, String fileurl) {
        this.name = name;
        this.filename = filename;
        this.fileurl = fileurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
