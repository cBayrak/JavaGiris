package Hafta3;
class InstanceOf{
	public void instanceOf(Object params){ //instance of methodundan bi deðer alacak. herhangi bir tipteki deðeri alacaktýr.
		//tüm deðiþken tipleri object sýnýfýna dahildir.
		System.out.println(params instanceof String);//params ýn deðiþken türü string mi
	}
}
public class Ornek04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceOf instance=new InstanceOf();
instance.instanceOf("btbs");
	}

}
