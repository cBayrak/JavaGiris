package Hafta2;

import java.io.IOException;
import java.util.Scanner;
	class DortIslem7{
		double Sonuc;//sonuc k���k harfle ba�lamal�.
		double a,b;
		public void setSayi(double a, double b) //set methodu de�i�kenleri ald��� i�in her methodda de�i�ken alma i�lemine gerek kalm�yor.
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
					System.out.println("Girdi�iniz Say�lar Birbirine Bolunememektedir.");
				}*/
				Sonuc=a/b;
				return Sonuc;
			}
			public void getSonuc(){
				System.out.println("��lemin sonucu: "+Sonuc);
			}
		
//kullan�c�dan al�nan 2 say� ile set ve get metotlar� olu�turup bu  metotlarla 4 i�lem yap ve metotlar�n sonu�lar�n� ekrana yazd�r.
public class JavaDers2 {


	}
	
	public static void main(String[] args) throws IOException {
		
		DortIslem7 Toplat= new DortIslem7();
		System.out.println("�lk say�y� giriniz.");
		Scanner input1=new Scanner(System.in);
		double a=input1.nextInt();
		System.out.println("�kinci sayiyi giriniz.");
		Scanner input2= new Scanner(System.in);
		double b= input2.nextInt();
		System.out.println("Yapmak istedi�iniz i�lemin belirtiniz. (+,-,*,/)");
		//Buraya i�lem eleminasyonu koy.
		Scanner input3=new Scanner(System.in);
		char islem=(char)System.in.read();
		//Toplat.Setsayi(a,b); kullan�p a�a��daki i�lemlerde a ve b yi parametre k�sm�ndan sileriz.
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
	
	

