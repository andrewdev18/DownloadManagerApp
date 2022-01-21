package com.example.downloadmanagerapp;

public class DownloadFile {
    private String fileName;
    private String size;
    private String uri;

    public DownloadFile() {
    }

    public DownloadFile(String fileName, String size, String uri) {
        this.fileName = fileName;
        this.size = size;
        this.uri = uri;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
