package hoTen_23679981;

public class Tam {
     private String ten;
	 private double x;
     private double y;

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if(ten != null) {
			this.ten = ten;
		}
		throw new Exception("loi");
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Tam() {}
	public Tam(String ten, double x, double y) throws Exception {
		if(ten != null) this.ten = ten;
		else throw new Exception("loi");
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Tam [ten=" + ten + ", x=" + x + ", y=" + y + "]";
	}
	 	
	}
