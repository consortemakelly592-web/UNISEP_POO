package calculadora_heranca;

public class Subtracao extends calculadora{
	
	public Subtracao(double valor1, double valor2) {
		super(valor1, valor2);
		
	}
	
	public void subtracao() {
		
		double resultado = valor1 - valor2;
		
		System.out.println("RESULTADO DA SUBTRAÇÃO:" + resultado);
	}

}
