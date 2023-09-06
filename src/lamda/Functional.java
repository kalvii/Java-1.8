package lamda;

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kl=12;
		
		Drwable b=()->System.out.println("Print"+kl);
			b.draw();

	}

}

//public class Functional {  
//    public static void main(String[] args) {  
//        int width=10;  
//  
//        //without lambda, Drawable implementation using anonymous class  
//        Drwable d=new Drwable(){  
//            public void draw(){System.out.println("Drawing "+width);}  
//        };  
//        d.draw();  
//    }  
//}  
