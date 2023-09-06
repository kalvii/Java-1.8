package lamda;
interface Addable{
	 int add(int a,int b);
}

public class LamdaExp2 {

	public static void main(String[] args) {
		
		Addable a1=(a,b)->(a+b);
		System.out.println(a1.add(10, 12));
		
		Addable a2=(a,b)->(a+b);
		System.out.println(a2.add(34, 36));
		

	}

}
