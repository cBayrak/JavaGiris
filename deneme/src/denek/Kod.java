package denek;
import java.util.Scanner;

class Cinsiyet{
	String cinsiyet;
	public void setCinsiyet(String cinsiyet){
		this.cinsiyet=cinsiyet;
	}
	public String getCinsiyet(String cinsiyet){
    return cinsiyet;
}
	public void doYazdir(){
		System.out.println("Cinsiyet"+cinsiyet);
	}
}

public class Kod {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Cinsiyet Giriniz: ");
Scanner input=new Scanner(System.in);
String cinsiyet=input.next();

Cinsiyet cinsiyet2=new Cinsiyet();
cinsiyet2.setCinsiyet(cinsiyet);
cinsiyet2.doYazdir();
String f=cinsiyet2.toString();
if(f=="Erkek")
{
	System.out.println("Hi Sir");
}
else
{
	System.out.println("Bonjour Matmazel");
}

/*Cinsiyet cinsiyet2=new Cinsiyet();
cinsiyet2.setCinsiyet("Goddamn Woman");
cinsiyet2.doYazdir(); */
	}

}
