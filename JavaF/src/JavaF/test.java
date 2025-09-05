package JavaF;

public class test {

	public static void main(String[] args) {
		System.out.println("집에 가고 싶당..");
		
		for(int i=1; i<10; i++) {
			
			for(int j=2; j<10; j++) {
				
				System.out.printf(j + "*" + i + "=" + i*j + "\t");
			}
			
			System.out.println();
		}

	}

}
