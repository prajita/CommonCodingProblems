package commonCodingPkg;

abstract class AB {
	public abstract void a();

	public void b() {
		System.out.println("b");

	}
}

abstract class B {

	public void b() {
		System.out.println("AB");

	}
}

public class Main{
	public static void main(String[] args) {
		B b = new B(){
			public void a() {
				System.out.println("A");
			}
			public void b() {
				System.out.println("B");
			}
		};
		b.b();
		
		StringBuilder sb=new StringBuilder("abcd");
		String s=new String("abcd");
		sb.reverse();
		System.out.println(s.compareTo("ab"));
		System.out.println(sb);
		System.out.println(s);
		
		sb.append((char)('a'+25));
		System.out.println(sb);
	}
	
}



