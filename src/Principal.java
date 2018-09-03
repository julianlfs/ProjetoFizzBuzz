public class Principal {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			FizzBuzz fizzBuzz = new FizzBuzz(i);
			
			System.out.println(fizzBuzz.escrever());
		}

	}

}
