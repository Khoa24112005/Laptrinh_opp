package hoTen_23679981;

public class HinhTron {
    private double banKinh;
    private Tam i;
    private static final double PI = 3.1416;
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception {
		if(bk > 0) this.banKinh = bk;
		else throw new Exception("loi");
	}
	
	public Tam getI() {
		return i;
	}
	public void setI(Tam i) throws Exception {
		if(i != null) this.i = i;
		else throw new Exception("loi");
	}
	public HinhTron() {}
	public HinhTron(double banKinh, Tam i) {
		this.banKinh = banKinh;
		this.i = i;
	}
	@Override
	public String toString() {
		return "HinhTron [banKinh=" + banKinh + ", i=" + i + "]";
	}
    public double dienTich() {
    	return 	PI * this.banKinh * this.banKinh;
    }
    public double chuVi() {
    	return this.banKinh * 2 * PI;
    }
    
}
