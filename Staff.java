package Company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Staff {
//khai báo biến
    protected String maNhanVien;
    protected String tenNhanVien;
    protected int  tuoiNV;
    protected double heSoLuong;
    protected String ngayVaoLam;
    protected String boPhan;
    protected int ngayNghi;
    protected int luong;
    public Staff() {

    }


    public int getTuoiNV() {
        return tuoiNV;
    }

    public void setTuoiNV(int tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
//hàm staff để tạo mảng
    public Staff(String maNhanVien, String tenNhanVien, int tuoiNV, double heSoLuong, String ngayVaoLam, String boPhan, int ngayNghi, int luong){
        this.maNhanVien=maNhanVien;
        this.tenNhanVien=tenNhanVien;
        this.tuoiNV=tuoiNV;
        this.heSoLuong=heSoLuong;
        this.ngayVaoLam=ngayVaoLam;
        this.boPhan=boPhan;
        this.ngayNghi=ngayNghi;
        this.luong=luong;


    }



    public void nhapip(Scanner input){
//hàm nhập dữ liệu thêm nv
        System.out.print("mã: ");this.maNhanVien=input.next();
        System.out.print("họ tên: "); this.tenNhanVien= input.next();
        System.out.print("tuổi: ");this.tuoiNV=input.nextInt();
        System.out.print("hệ số lương: ");this.heSoLuong=input.nextDouble();
        System.out.print("ngày vào làm: ");this.ngayVaoLam=input.next();
      System.out.print("chọn bộ phận: 1.kinh doanh , 2.Quản lý, 3. Kỹ thuật ");
        this.boPhan=input.next();
      switch (this.boPhan){
          case "1": boPhan="kinh doanh"; break;
          case "2": boPhan="quản lý"; break;
          case "3": boPhan="kỹ thuật"; break;

      }

        System.out.print("ngày nghỉ: "); this.ngayNghi=input.nextInt();
        input.nextLine();

    }



    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNV;
    }

    public void setTuoiNhanVien(int  tuoiNhanVien) {
        this.tuoiNV = tuoiNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public int getNgayNghi() {
        return ngayNghi;
    }

    public void setNgayNghi(int ngayNghi) {
        this.ngayNghi = ngayNghi;
    }

    @Override
    public String toString() {
        return
                "maNhanVien='" + maNhanVien + '\'' +
                ", tenNhanVien='" + tenNhanVien + '\'' +
                ", luong=" + luong +
                '}';
    }

    abstract void displayInformation();
//tạo hàm abstract


}


