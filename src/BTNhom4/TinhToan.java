package BTNhom4;

import java.util.Scanner;

public class TinhToan {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String check = "N";
		do {
		int number = Show();	   
		   
		   switch (number) {
		   case 1:// Hinh chu nhat
			   
			   // nhap chieu dai
			   float dai;
			   			   do
			   {
			   				   System.out.println("Nhap chieu dai, hay nhap so >0:");
			   				    dai = sc.nextFloat();}
			   while (dai<=0);
			   			   
			   // nhap chieu rong
			   float rong;
			   do {			   
			   System.out.println("Nhap chieu rong, hay nhap so >0:");
			   rong = sc.nextFloat();}
			   while (rong<=0);			   
			   
			   ChuNhat chuNhat = new ChuNhat(dai, rong);
			   System.out.println("Dien tich hinh chu nhat:"+ chuNhat.Tinh_Dien_Tich());
			   System.out.println("Chi vi hinh chu nhat:"+ chuNhat.Tinh_Chu_Vi());
		     
		     break;
		   case 2://Hinh vuong
			   do {
			   System.out.println("Nhap chieu dai 1 canh:");
			    dai = sc.nextFloat();}
			   while(dai<=0);			   
			   HinhVuong hinhVuong = new HinhVuong(dai,dai);
			   System.out.println("Dien tich hinh chu nhat:"+ hinhVuong.Tinh_Dien_Tich());
			   System.out.println("Chi vi hinh chu nhat:"+ hinhVuong.Tinh_Chu_Vi());
		     break;
		   
		   case 3://Hinh tam giac
			   
			   // Nhap chieu dai canh ngan 
			   do {
				   System.out.println("Nhap chieu dai canh ngan nhat:");
				    dai = sc.nextFloat();}
				   while(dai<=0);	
			   
			   // Nhap chieu dai canh dai
			   do {
				   System.out.println("Nhap chieu dai canh dai:");
				    rong = sc.nextFloat();}
				   while(rong <=0);
			   
			   // Nhap chieu dai canh day
			   float day;
			   do {
				   System.out.println("Nhap chieu dai canh day:");
				    day = sc.nextFloat();}
				   while(day <=0);
			   	// Nhap duong cao 
			   float duongcao;
			   do {
				   System.out.println("Nhap chieu dai duong cao:");
				    duongcao = sc.nextFloat();}
				   while(duongcao <=0);
			   TamGiac tamGiac = new TamGiac(dai,rong,day,duongcao);
			   System.out.println("Dien tich hinh tam giac:"+ tamGiac.Tinh_Dien_Tich());
			   System.out.println("Chu vi hinh tam giac:"+ tamGiac.Tinh_Chu_Vi());		  	   		   		   
			   
		       break;
		       
		   case 4://Hinh tron
			   // nhap chieu dai ban kinh
			   do {
				   System.out.println("Nhap chieu dai ban kinh:");
				    dai = sc.nextFloat();}
				   while(dai<=0);	
			   HinhTron hinhTron = new HinhTron(dai);
			   System.out.println("Dien tich hinh tron:"+ hinhTron.Tinh_Dien_Tich());
			   System.out.println("Chu vi hinh tron:"+ hinhTron.Tinh_Chu_Vi());
			     
		       break;
		       
		   default:
			   System.out.println("Ban chi duoc nhap tu 1 den 4");
		   }		     
		   	   	  
		  
		   System.out.println("Ban co muon tinh dien tich hinh khac khong? Y/N");
		   check = sc.next();		   
		   		}
		   while(check.equals("Y"));

	}
	
	public static int Show() {
		   System.out.println("Ban muon tinh dien tich va chu vi cua hinh nao? Hay chon so tuong ung");
		   System.out.println("1-Hinh chu nhat");
		   System.out.println("2-Hinh vuong");
		   System.out.println("3-Hinh tam giac");
		   System.out.println("4-Hinh tron");
		   int number = sc.nextInt();
		   return number;
	}

}
