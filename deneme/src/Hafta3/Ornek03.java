package Hafta3;
class soru�saretiOperatoru{
	int sayi;

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	public String ifThenElse(){
		return sayi>0 ? "B�y�k" : "K���k";
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
soru�saretiOperatoru soru1=new soru�saretiOperatoru();
soru1.setSayi(41);
soru1.doYazdir();

	}

}
