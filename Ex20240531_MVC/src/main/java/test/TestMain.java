package test;

public class TestMain {
	public static void main(String[] args) {
		
		InterA a = () -> {
			System.out.println("A");
		};
		
		InterB b = (n1, n2) -> {
			return n1+n2;
		};
		
		// -----------------------
		/* 
			함수가 여러 개일때는 잘 사용하지 않는다.
		 */
		
		a.test();
		System.out.println(b.test(7, 8));
		
	}
}
