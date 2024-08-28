package test;

import hoTen_23679981.HinhTron;
import hoTen_23679981.Tam;

public class test {
    public static void main(String[] args) throws Exception {
		Tam i = new Tam("I", 2, 2);
    	HinhTron h1 = new HinhTron(5, i);
    	System.out.println("hinh tron tam :" +i.toString());
    	System.out.println("dien tich hinh tron la : " +h1.dienTich());
    	System.out.println("chu vi hinh tron la : " +h1.chuVi());
	}
}
