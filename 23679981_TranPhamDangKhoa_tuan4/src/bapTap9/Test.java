package bapTap9;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        DanhSachCongNhan ds = new DanhSachCongNhan();
        Scanner sc = new Scanner(System.in);
        
        // Thêm công nhân vào danh sách
        System.out.print("Nhập số lượng công nhân: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1));
            System.out.print("Mã CN: ");
            String maCN = sc.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Số sản phẩm: ");
            int soSP = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống
            
            CongNhan cn = new CongNhan(maCN, hoTen, soSP);
            ds.themCongNhan(cn);
        }
        
        // Xuất thông tin tất cả công nhân
        System.out.println("Thông tin tất cả công nhân:");
        ds.xuatThongTinCongNhan();
        
        // Sắp xếp công nhân theo số sản phẩm giảm dần
        ds.sapXepTheoSoSPGiamDan();
        System.out.println("\nDanh sách công nhân sau khi sắp xếp theo số sản phẩm giảm dần:");
        ds.xuatThongTinCongNhan();
        
        // Xuất công nhân có số sản phẩm > 200
        System.out.println("\nCông nhân có số sản phẩm lớn hơn 200 :");
        ds.xuatCongNhanTren200SP();
    }
}
