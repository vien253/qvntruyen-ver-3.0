package com.example.qvntruyen;

public class ChitietTruyen {
    private int IDTruyen;
    private String Chap;
    private String NoiDung;
    private int ID;

    public ChitietTruyen(int IDTruyen, String chap, String noiDung, int ID) {
        this.IDTruyen = IDTruyen;
        Chap = chap;
        NoiDung = noiDung;
        this.ID = ID;
    }

    public int getIDTruyen() {
        return IDTruyen;
    }

    public void setIDTruyen(int IDTruyen) {
        this.IDTruyen = IDTruyen;
    }

    public String getChap() {
        return Chap;
    }

    public void setChap(String chap) {
        Chap = chap;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
