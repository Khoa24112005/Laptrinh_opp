package bapTap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
    private ArrayList<CongNhan> danhSach;

    // Constructor khởi tạo mảng ArrayList
    public DanhSachCongNhan() {
        danhSach = new ArrayList<>();
    }

    // Phương thức thêm công nhân
    public boolean themCongNhan(CongNhan cn) {
        if (danhSach.size() < 100) {  // Giả sử danh sách có tối đa 100 công nhân
            danhSach.add(cn);
            return true;
        }
        return false;
    }

    // Phương thức xuất thông tin tất cả công nhân
    public void xuatThongTinCongNhan() {
        for (CongNhan cn : danhSach) {
            System.out.println(cn);
        }
    }

    // Phương thức tính số lượng công nhân
    public int soLuongCongNhan() {
        return danhSach.size();
    }

    // Phương thức xuất công nhân làm trên 200 sản phẩm
    public void xuatCongNhanTren200SP() {
        for (CongNhan cn : danhSach) {
            if (cn.getSoSP() > 200) {
                System.out.println(cn);
            }
        }
    }

    // Phương thức sắp xếp công nhân theo số sản phẩm giảm dần
    public void sapXepTheoSoSPGiamDan() {
        Collections.sort(danhSach, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan cn1, CongNhan cn2) {
                return cn2.getSoSP() - cn1.getSoSP();
            }
        });
    }
}
