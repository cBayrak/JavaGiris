package Hafta3;
class InstanceOf{
	public void instanceOf(Object params){ //instance of methodundan bi de�er alacak. herhangi bir tipteki de�eri alacakt�r.
		//t�m de�i�ken tipleri object s�n�f�na dahildir.
		System.out.println(params instanceof String);//params �n de�i�ken t�r� string mi
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
