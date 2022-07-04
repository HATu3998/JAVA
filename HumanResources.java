package Company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HumanResources {
public static void main(String[] args){
   HumanResources human=new HumanResources(); //gọi lớp human
   ArrayList<Staff> list=new ArrayList<>();  //tạo arraylist staff
   ArrayList<Department> de= new ArrayList<>(); //tạo arraylist department

    Employee s1=new Employee("0","Nguyễn văn a",20,3,"28/12/2019","kỹ thuật",0,9000000);
    list.add(s1);


    Scanner input=new Scanner(System.in);
    do {
        //tạo menu bằng vòng lặp
        System.out.println("0. để thoát chương trình");
        System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty ");
        System.out.println("2. Hiển thị các bộ phận trong công ty");
        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận ");
        System.out.println("4. Thêm nhân viên mới vào công ty: ");
        System.out.println("5. Tìm kiếm thông tin nhân viên theo  mã nhân viên ");
        System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty ");
        System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần ");
        System.out.println("8. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần ");


        for (Staff x:list){
//thêm dữ liệu tạo mảng department
            if(x.boPhan=="kinh doanh"){

                Department d1=new Department(01,x.boPhan,20,list);
                de.add(d1);
            }else if(x.boPhan=="quản lý"){
                Department d1=new Department(01,x.boPhan,20,list);
                de.add(d1);
            }else if(x.boPhan=="kỹ thuật"){
                Department d1=new Department(01,x.boPhan,20,list);
                de.add(d1);
            }
        }

        System.out.print(" Lựa chọn : ");
        int num = input.nextInt();

        //người dùng nhập số chọn chức năng
        switch (num) {
            case 0:
                System.exit(0);
                break;
            case 1:
                //duyệt mảng để hiển thị staff
                for (Staff x : list) {
                    x.displayInformation();
                }
                break;
            case 2:

                for (Department x : de) {

                 System.out.println(x.toString());

                } System.out.println("--------------------------");
                break;
            case 3:
                for (Staff x : list) {
                    System.out.println(x.tenNhanVien+" "+x.boPhan);
                }
                break;
            case 4:
                //thêm nhân viên
                System.out.print(" Lựa chọn loại nhân viên:1. nhân viên hành chính, 2.nhân viên quản lý ");
                int luaChon = input.nextInt();
                //chọn class Employee hoặc manager
                switch (luaChon){
                    case 1:Employee e=new Employee();
                    e.nhapip(input);
                    list.add(e);
                        break;
                    case 2:Manager m=new Manager();
                    m.nhapip(input);
                    list.add(m);
                        break;
                }
                break;
            case 5:
                System.out.print("nhập mã: ");
            String ma=input.next();
                Staff nhanVien=null;
                for(Staff x:list){
                    if(x.getMaNhanVien().equalsIgnoreCase(ma)){   //mã nv giống với mã tìm kiếm
                        nhanVien=x;  //nv bằng mã, lưu lại đối tượng và break đem ra ngoài

                        break;
                    }
                    if(nhanVien != null){ //so sánh nv khác null
                        System.out.println("thông tin nhân viên đã tìm");
                        nhanVien.getTenNhanVien() ;
                        nhanVien.getBoPhan();
                        System.out.println("-------");
                   list.clear();

                    }else{
                        System.out.println("không tìm thấy theo mã");

                    }
               }
            case 6:for (Staff x : list) {

                System.out.println(x.toString());

            }
                break;
            case 7:
                //bảng lương tăng dần
                Collections.sort(list,(a,b)->a.getLuong()-b.getLuong());
                System.out.println(list);
                break;
            case 8:
                Collections.sort(list,(a,b)->b.getLuong()-a.getLuong());
                System.out.println(list);
                break;

        }
    }while(true);
}

    public HumanResources() {
    }
}
