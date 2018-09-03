public class FizzBuzz {

	private int numero;
	
	public FizzBuzz(int numero) {
		this.numero = numero;
	}

	public Boolean isNumeroPositivo() {
		return (this.numero > 0);
	}

	public Boolean isMultiploPor3() {
		return (this.numero % 3 == 0);
	}

	public Boolean isMultiploPor5() {
		return (this.numero % 5 == 0);
	}

	public String escrever() {
		
		String mensagem = null;
		
		if (isNumeroPositivo()) {
		
			if (isMultiploPor3() && !isMultiploPor5())
				mensagem = "Fizz";
			else if (!isMultiploPor3() && isMultiploPor5())
				mensagem = "Buzz";
			else if (isMultiploPor3() && isMultiploPor5())
				mensagem = "FizzBuzz";
			else
				mensagem = String.valueOf(this.numero);
		}
		
		return mensagem;
	}

}
