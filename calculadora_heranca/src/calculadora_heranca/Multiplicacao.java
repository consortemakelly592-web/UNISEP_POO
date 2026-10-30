package calculadora_heranca;

public class Multiplicacao extends calculadora {
	
	public Multiplicacao (double valor1, double valor2) {
		super (valor1 , valor2);
		
	}
	
	public void multiplicacao() {
		double resultado = valor1 * valor2;
		
		System.out.println ("RESULTADO DA MULTIPLICAÇÃO:" + resultado);
		}
		

}
