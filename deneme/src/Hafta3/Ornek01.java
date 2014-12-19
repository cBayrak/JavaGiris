package Hafta3;
import java.io.IOException;
import java.util.Scanner;
class IliskiselOperatorler{
	boolean sonuc;
	int a;int b;
	public boolean isEsit(int sayi1,int sayi2){
	return sonuc=sayi1==sayi2; //sayi1 sayi2ye eþit mi?	
	}
	public boolean isEsitDegil(int sayi1,int sayi2){
		return sonuc=sayi1!=sayi2; //sayi 1 sayi 2ye eþit deðilse sonuc true döndür.
	}
	public boolean isBuyuk(int sayi1,int sayi2){
		return sonuc=sayi1>sayi2; 
	}
	public boolean isKucuk(int sayi1,int sayi2){
		return sonuc=sayi1<sayi2; //sayi 1 sayi2den küçük mü
	}
	public boolean isBuyukVeyaEsit(int sayi1,int sayi2){
		return sonuc=sayi1>=sayi2;
	}
	public boolean isKucukVeyaEsit(int sayi1,int sayi2){
		return sonuc=sayi1<=sayi2;
	}
	public void doYazdir(){
		System.out.println("Sonuc: "+sonuc);
	}
	public void setSayi(int a,int b){
		this.a=a;
		this.b=b;
	}
}

public class Ornek01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IliskiselOperatorler operator1=new IliskiselOperatorler();
//scannerla yap
System.out.println("Birinci sayýyý giriniz.");
Scanner giris1=new Scanner(System.in);
int a=giris1.nextInt();
System.out.println("Ýkinci sayýyý giriniz.");
Scanner giris2=new Scanner(System.in);
int b=giris2.nextInt();
operator1.setSayi(a,b);
operator1.isEsit(a,b); operator1.doYazdir();
operator1.isEsit(a,b);operator1.doYazdir();

operator1.isEsitDegil(a,b);operator1.doYazdir();
operator1.isEsitDegil(a,b); operator1.doYazdir();

operator1.isBuyuk(a,b); operator1.doYazdir();
operator1.isBuyuk(b,a); operator1.doYazdir();
operator1.isKucuk(a,b); operator1.doYazdir();
	}

}
