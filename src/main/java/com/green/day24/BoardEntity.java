package com.green.day24;

public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAT;
    private String updatedAT;

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) { this.iboard = iboard; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtnts() {
        return ctnts;
    }

    public void setCtnts(String ctnts) {
        this.ctnts = ctnts;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(String createdAT) {
        this.createdAT = createdAT;
    }

    public String getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(String updatedAT) {
        this.updatedAT = updatedAT;
    }


    @Override
    public String toString() {
     return String.format("iboard: %d, title: %s, ctnts: %s, writer: %s, createdAt: %s, updatedAt: %s"
             ,iboard,title,ctnts,writer,createdAT,updatedAT );
    }

}
