package Company;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Staff {
    protected int luongTrachNhiem;
    protected String chucDanh;
    private int tinhLuong = this.luong;

    public Manager(String maNhanVien, String tenNhanVien, int tuoiNV, double heSoLuong, String ngayVaoLam,String boPhan, int ngayNghi,int luong) {
        super(maNhanVien, tenNhanVien, tuoiNV, heSoLuong, ngayVaoLam, boPhan, ngayNghi,luong);
        this.chucDanh = chucDanh;
        this.luongTrachNhiem = luongTrachNhiem;
        this.luong=luong;



     }
      public void nhapip(Scanner input){
          super.nhapip(input);
          System.out.print("chọn chức danh: 1.Business Leader, 2.Project Leader, 3.Technical Leader");
          int chon=input.nextInt();

           if (chon == 1) {
               chucDanh = "Business Leader";
               luongTrachNhiem = 8000000;

           } else if (chon == 2) {
               chucDanh = "Project Leader";
               luongTrachNhiem = 5000000;
           } else {
               chucDanh = "Technical Leader";
               luongTrachNhiem = 6000000;
           }
          input.nextLine();
          calculateSalary();
          setTinhLuong(tinhLuong);
     }

    public Manager() {
       super();
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public int getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(int luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public int getTinhLuong() {
        return tinhLuong;
    }

    public void setTinhLuong(int tinhLuong) {
        this.tinhLuong = tinhLuong;
    }

    public double  calculateSalary() {
        TinhLuong luong = new TinhLuong();
        ArrayList<Staff> list=new ArrayList<>();
       tinhLuong = (int) luong.luongQuanly(this.heSoLuong, this.luongTrachNhiem);
      //int a= (int) tinhLuong;
        //a=this.luong;
        //a= (int) tinhLuong;

return  tinhLuong;
    }
    @Override
    public void displayInformation() {
        System.out.println("mã nhân viên: " + maNhanVien);
        System.out.println("tên nhân viên: " + tenNhanVien);
        System.out.println("tuổi nhân viên: "+ tuoiNV);
        System.out.println("hệ số lương: "+ heSoLuong);
        System.out.println("ngày vào làm: "+ ngayVaoLam);
        System.out.println("bộ phận: "+ boPhan);
        System.out.println("số ngày nghỉ: "+ ngayNghi);
        System.out.println("chức danh " + chucDanh);
        System.out.println("lương "+ tinhLuong);


        System.out.println("------------------------------------");
    }

    @Override
    public String toString() {
        return  " tenNhanVien='" + tenNhanVien + '\'' +
                "tinhLuong=" + tinhLuong

                ;
    }
}
