package Hafta3;
class Sira{
	int sayi1,sayi2;

	public int getSayi1() {
		return sayi1;
	}

	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}

	public int getSayi2() {
		return sayi2;
	}

	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}
	public void doOrtanca(){
		while(++sayi1<--sayi2); //gövdeyi yazmadan işlemler yapabiliriz.
		System.out.println("Ortanca Sayi:"+sayi1);
	}
	public void doSay(){
		int sayac=1;
		while(getSayi1()<getSayi2()){  //sayi1 sayi 2den büyükse
	//		System.out.println(sayac++); // sayiyi yazdir. 1 arttır
		sayac++;
			sayi1++; //sayiyi da 1 artır.
		}
		System.out.println("Toplam "+sayac+" Adet sayıldı");
	}
}

public class Ornek06_While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Sira sira1=new Sira();
sira1.setSayi1(5);
sira1.setSayi2(9);
sira1.doOrtanca();
*/Sira sira2= new Sira();
sira2.setSayi1(5);
sira2.setSayi2(9);
sira2.doSay();

	}

}
