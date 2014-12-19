package Hafta3;
class Ogrenci{
	public void doSay(int sayi){
		while(sayi>0){
			System.out.println(sayi--);
		}
	}
}
public class Ornek05_Donguler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ogrenci ogrenci1=new Ogrenci();
ogrenci1.doSay(5);
	}

}
