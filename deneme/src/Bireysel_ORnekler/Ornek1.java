package Bireysel_ORnekler;
import java.util.Scanner;
//kullan�c�dan 3 adet not alan ve bunlar�n ortalamas� 50nin �zerindeyse ge�tiniz de�ilse kald�n�z yazan program�n kodlar�.
class Not{
	int a,b,c,ortalama;
	public void setSayi(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}
	public int Ortalama(int a,int b,int c)
	{
		ortalama=(a+b+c)/3;
		return ortalama;
		
	}
public void getYear()
{
	if(ortalama>=50)
	{
	System.out.println("Tebrikler ge�tiniz. Puan�n�z: "+ortalama);
	}
	else
	System.out.println("�zg�n�z Kald�n�z Puan�n�z: "+ortalama);
}
	public int notOrt(int a){
		return a;
	}
}
public class Ornek1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Not notlar=new Not();
System.out.println("L�tfen ilk notu giriniz.");
Scanner ilk=new Scanner(System.in);
int a=ilk.nextInt();
System.out.println("L�tfen ikinci notu giriniz.");
Scanner iki=new Scanner(System.in);
int b=iki.nextInt();
System.out.println("L�tfen ���nc� notu giriniz.");
Scanner uc=new Scanner(System.in);
int c=uc.nextInt();
notlar.Ortalama(a, b, c);
notlar.getYear();



	}

}
