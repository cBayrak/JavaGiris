package Bireysel_ORnekler;
import java.util.Scanner;
//kullanýcýdan 3 adet not alan ve bunlarýn ortalamasý 50nin üzerindeyse geçtiniz deðilse kaldýnýz yazan programýn kodlarý.
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
	System.out.println("Tebrikler geçtiniz. Puanýnýz: "+ortalama);
	}
	else
	System.out.println("Üzgünüz Kaldýnýz Puanýnýz: "+ortalama);
}
	public int notOrt(int a){
		return a;
	}
}
public class Ornek1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Not notlar=new Not();
System.out.println("Lütfen ilk notu giriniz.");
Scanner ilk=new Scanner(System.in);
int a=ilk.nextInt();
System.out.println("Lütfen ikinci notu giriniz.");
Scanner iki=new Scanner(System.in);
int b=iki.nextInt();
System.out.println("Lütfen üçüncü notu giriniz.");
Scanner uc=new Scanner(System.in);
int c=uc.nextInt();
notlar.Ortalama(a, b, c);
notlar.getYear();



	}

}
