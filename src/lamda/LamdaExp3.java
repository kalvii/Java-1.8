package lamda;
interface Sayable{
	String say(String name);
}

public class LamdaExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1=(name)->{
			return name;
		};
		System.out.println(s1.say("kanhaiya"));

	}

}
