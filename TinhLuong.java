package Company;

public class TinhLuong implements LuongInterface{

    @Override
    public double luongNhanVien(double heSoLuong, int gioLamThem) {

        double luong = (heSoLuong * 3000000) + (gioLamThem * 200000);
        return luong;
    }

    @Override
    public double luongQuanly(double heSoLuong, int luongTrachNhiem) {
        return heSoLuong*5000000+luongTrachNhiem;
    }
}
