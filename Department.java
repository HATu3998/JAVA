package Company;

import java.util.ArrayList;

public class Department {
    private int maBoPhan;
    private String tenBoPhan;
    private int soLuongNV;


    public Department(){};
    public Department(int maBoPhan,String tenBoPhan,int soLuongNV, ArrayList<Staff> list) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNV = soLuongNV;
        for (Staff x:list) {
          tenBoPhan=  x.boPhan;
        }
    }



    public int getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return this.tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuongNV() {
        return this.soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }


    @Override
    public String toString() {
        return "Department{" +
                "maBoPhan=" + maBoPhan +
                ", tenBoPhan='" + tenBoPhan + '\'' +
                ", soLuongNV=" + soLuongNV +
                '}';
    }
}
