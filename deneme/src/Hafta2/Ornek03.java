package Hafta2;

class PrimitiveVeriTipleri1{ //ilkel veri tipi int byte char long = primitive
	byte sayi;
	public void setSayi(byte sayi){
		this.sayi=sayi;
	}
	public byte getSayi(){
		return sayi;
	}
}
public class Ornek03 {
	public static void main(String[] args) {
		PrimitiveVeriTipleri1 tip1=new PrimitiveVeriTipleri1();
		tip1.setSayi((byte)50); //sayi de�er kaybetmemesi i�in burada say�n�n byte tipinde oldugunu g�sterdik. int'ten daha k���k say� aral�g�na sahip oldugu i�in de�er kaybetmemesini istedik.
		System.out.println(tip1.getSayi()); 
			}

		}