/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class dNhan_vien {
    private String id, Ten_NV, CMND, Ngay_sinh;
    private int Sdt_nv;

    public dNhan_vien() {
    }

    public dNhan_vien(String id, String Ten_NV, String CMND, String Ngay_sinh, int Sdt_nv) {
        this.id = id;
        this.Ten_NV = Ten_NV;
        this.CMND = CMND;
        this.Ngay_sinh = Ngay_sinh;
        this.Sdt_nv = Sdt_nv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen_NV() {
        return Ten_NV;
    }

    public void setTen_NV(String Ten_NV) {
        this.Ten_NV = Ten_NV;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNgay_sinh() {
        return Ngay_sinh;
    }

    public void setNgay_sinh(String Ngay_sinh) {
        this.Ngay_sinh = Ngay_sinh;
    }

    public int getSdt_nv() {
        return Sdt_nv;
    }

    public void setSdt_nv(int Sdt_nv) {
        this.Sdt_nv = Sdt_nv;
    }
    
}
