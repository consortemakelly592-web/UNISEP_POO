package calculadora_heranca;

public class Divisao extends calculadora {
	public Divisao (double valor1, double valor2) {
		super (valor1, valor2);
		
	}
	
	public void divisao() {
		double resultado = valor1 / valor2;
		
		System.out.println("RESULTADO DA DIVISÃO:" + resultado);
		
	}

}
