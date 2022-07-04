package Company;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Staff{
    protected int gioLamThem;
    private double tinhLuong = this.luong;

//hàm employee tạo mảng kế thừa từ staff
    public Employee(String maNhanVien, String tenNhanVien, int  tuoiNV, double heSoLuong, String ngayVaoLam,String boPhan ,int ngayNghi,int luong) {

        super(maNhanVien, tenNhanVien, tuoiNV, heSoLuong, ngayVaoLam, boPhan, ngayNghi,luong);
        this.luong=luong;

        this.gioLamThem = gioLamThem;

    }

    public Employee() {
    }

    public void nhapip(Scanner input){
        //hàm kế thừa từ hàm cha ,nhập thêm 2 biến
        super.nhapip(input);
        System.out.print("Giờ làm thêm ");  gioLamThem =input.nextInt();
        setGioLamThem( gioLamThem);
        calculateSalary();
        setTinhLuong(tinhLuong);
    }


    public int getGioLamThem() {
        return gioLamThem;
    }

    public void setGioLamThem(int gioLamThem) {
        this.gioLamThem = gioLamThem;
    }




public double calculateSalary(){
        //gọi hàm tính lương
TinhLuong luong=new TinhLuong();
    ArrayList<Staff> list=new ArrayList<>();

 tinhLuong= luong.luongNhanVien( heSoLuong, gioLamThem);

    return tinhLuong;
}


    public double getTinhLuong() {
        return tinhLuong;
    }

    public void setTinhLuong(double tinhLuong) {
        this.tinhLuong = tinhLuong;
    }

    @Override
    public void displayInformation() {
//hàm hiển thị
        System.out.println("mã nhân viên: " + maNhanVien);
        System.out.println("tên nhân viên: " + tenNhanVien);
        System.out.println("tuổi nhân viên: "+ tuoiNV);
        System.out.println("hệ số lương: "+ heSoLuong);
        System.out.println("ngày vào làm: "+ ngayVaoLam);
        System.out.println("bộ phận: "+ boPhan);
        System.out.println("số ngày nghỉ: "+ ngayNghi);
        System.out.println("lương "+tinhLuong );
        //calculateSalary();

        System.out.println("------------------------------------");

    }

    @Override
    public String toString() {
        return "tên " + tenNhanVien+ " "+
                "tinhLuong=" + tinhLuong +
                '}';
    }
}
