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
		tip1.setSayi((byte)50); //sayi deðer kaybetmemesi için burada sayýnýn byte tipinde oldugunu gösterdik. int'ten daha küçük sayý aralýgýna sahip oldugu için deðer kaybetmemesini istedik.
		System.out.println(tip1.getSayi()); 
			}

		}