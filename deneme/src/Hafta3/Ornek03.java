package Hafta3;
class soruÝsaretiOperatoru{
	int sayi;

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	public String ifThenElse(){
		return sayi>0 ? "Büyük" : "Küçük";
	}
	public void doYazdir(){
		System.out.println(ifThenElse());
	}
}
public class Ornek03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
soruÝsaretiOperatoru soru1=new soruÝsaretiOperatoru();
soru1.setSayi(41);
soru1.doYazdir();

	}

}
