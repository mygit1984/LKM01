package test;

public class ForLoopDemo {
	public static void main(String[] args) {
		int v1=8;  //local variable
		
		for(v1=0;v1<=5;v1++) {
			System.out.println(v1);
			if(v1==3) {
				break;
			}
		}
		
	}

}
