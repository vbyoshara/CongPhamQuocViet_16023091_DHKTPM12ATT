package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

public class NhanVien_ver2 {
    private String maNV;
    private String tenNV;
    private Boolean gioiTinh;

    public NhanVien_ver2 (String maNV,String tenNV,Boolean gioiTinh){
        this.tenNV = tenNV;
        this.maNV = maNV;
        this.gioiTinh = gioiTinh;
    }
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return maNV + "-" +  tenNV;
    }
}
