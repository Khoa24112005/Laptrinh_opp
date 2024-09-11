package bapTap9;

public class CongNhan {
    private String maCN;
    private String hoTen;
    private int soSP;

    // Constructor
    public CongNhan(String maCN, String hoTen, int soSP) {
        this.maCN = maCN;
        this.hoTen = hoTen;
        this.soSP = soSP > 0 ? soSP : 0;
    }

    // Getter và Setter
    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP > 0 ? soSP : 0;
    }

    // Phương thức tính lương
    public double tinhLuong() {
        double donGia;
        if (soSP < 200) {
            donGia = 0.5;
        } else if (soSP < 400) {
            donGia = 0.55;
        } else if (soSP < 600) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }
        return soSP * donGia;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Ma CN: " + maCN + ", Ho Ten: " + hoTen + ", So SP: " + soSP + ", Luong: " + tinhLuong();
    }
}


