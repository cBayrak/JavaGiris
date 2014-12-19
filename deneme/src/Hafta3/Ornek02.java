package Hafta3;
//ve veya deðil

class LojicOperators{
	int s1;
	boolean sonuc;
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public void veOperatoru(){
		sonuc=s1>0 && s1<10;
	}
	public void veyaOperatoru(){
		sonuc=s1>0 || s1==-5;
	}
	public void degilOperatoru(){
		sonuc=!(s1>0 && s1<10);
	}
	public void doYazdir(){
		System.out.println("Sonuç "+sonuc);
	}
}

public class Ornek02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LojicOperators l1=new LojicOperators();
l1.setS1(7);
l1.veOperatoru();
l1.doYazdir();
l1.veyaOperatoru();
l1.doYazdir();
	}

}
