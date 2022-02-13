
public class B extends A {

	B() {
		System.out.println("B의 인수는 0입니다.");
	}
	B(int b) {
		super(b);
		System.out.println("B의 인수는 1입니다.");
	}
}
