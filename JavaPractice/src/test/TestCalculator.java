package test;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int v1=c1.addNumber(10, 20);
		System.out.println(v1);
		int v2=c1.multiplyNumber(10, 20);
		System.out.println(v2);
	}

}
