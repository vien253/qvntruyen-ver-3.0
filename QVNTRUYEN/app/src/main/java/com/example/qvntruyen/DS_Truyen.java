package com.example.qvntruyen;

public class DS_Truyen {
    private int ID;
    private String TenTruyen;
    private String TheLoai;
    private  String Anh;
    private  String TacGia;

    public DS_Truyen(int ID, String tenTruyen, String theLoai, String anh, String tacGia) {
        this.ID = ID;
        TenTruyen = tenTruyen;
        TheLoai = theLoai;
        Anh = anh;
        TacGia = tacGia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        TenTruyen = tenTruyen;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theLoai) {
        TheLoai = theLoai;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }
}
