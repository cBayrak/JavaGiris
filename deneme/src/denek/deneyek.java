package denek;

class Toplama{
	public Toplama(int a,int b){
		if(a+b>30)
		System.out.println("Sonucunuz 30dan b�y�kt�r"+(a+b));
		else
			System.out.println("Sonucunuz 30dan k���kt�r"+(a+b));
	}
}
class DortIslem{
	public DortIslem(){
		System.out.println("Yardur");
	}
}
public class deneyek {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DortIslem Ilk=new DortIslem();

Toplama Bir= new Toplama(5,6);
	}

}
