package Hafta2;

import java.io.IOException;
import java.util.Scanner;
	class DortIslem7{
		double Sonuc;//sonuc küçük harfle baþlamalý.
		double a,b;
		public void setSayi(double a, double b) //set methodu deðiþkenleri aldýðý için her methodda deðiþken alma iþlemine gerek kalmýyor.
		{
			this.a=a;
			this.b=b;
		}
		public double Toplama(double a,double b){
			Sonuc=a+b;
			return Sonuc;	
		}
			public double Cikarma(double a,double b)
			{ Sonuc=a-b;
			return Sonuc;
			
			}
			public double Carpma(double a, double b)
			{
				Sonuc=a*b;
				return Sonuc;
			}
			public double Bolme(double a,double b)
			{
			/*	if(a>b)
				{
					Sonuc=a/b;
					
				}
				else
				{
					System.out.println("Girdiðiniz Sayýlar Birbirine Bolunememektedir.");
				}*/
				Sonuc=a/b;
				return Sonuc;
			}
			public void getSonuc(){
				System.out.println("Ýþlemin sonucu: "+Sonuc);
			}
		
//kullanýcýdan alýnan 2 sayý ile set ve get metotlarý oluþturup bu  metotlarla 4 iþlem yap ve metotlarýn sonuçlarýný ekrana yazdýr.
public class JavaDers2 {


	}
	
	public static void main(String[] args) throws IOException {
		
		DortIslem7 Toplat= new DortIslem7();
		System.out.println("Ýlk sayýyý giriniz.");
		Scanner input1=new Scanner(System.in);
		double a=input1.nextInt();
		System.out.println("Ýkinci sayiyi giriniz.");
		Scanner input2= new Scanner(System.in);
		double b= input2.nextInt();
		System.out.println("Yapmak istediðiniz iþlemin belirtiniz. (+,-,*,/)");
		//Buraya iþlem eleminasyonu koy.
		Scanner input3=new Scanner(System.in);
		char islem=(char)System.in.read();
		//Toplat.Setsayi(a,b); kullanýp aþaðýdaki iþlemlerde a ve b yi parametre kýsmýndan sileriz.
	switch(islem)
	{
	case '+': islem='+';
		Toplat.Toplama(a,b);
		Toplat.getSonuc();
		break;
	case '-': islem='-';
		Toplat.Cikarma(a, b);
		Toplat.getSonuc();
		break;
	case '*': islem='*';
		Toplat.Carpma(a, b);
		Toplat.getSonuc();
		break;
	case '/':islem='/';
		Toplat.Bolme(a, b);
		Toplat.getSonuc();
		break;
	}
	}
	}
	
	

