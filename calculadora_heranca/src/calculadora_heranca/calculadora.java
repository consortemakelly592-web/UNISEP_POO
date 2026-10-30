package calculadora_heranca;

public class calculadora {
	double valor1=0;
	double valor2=0;
	
	public calculadora (double valor1, double valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		
	}
	public void soma() {
		System.out.println("executar operação soma!");
		
	}
	public void subtracao() {
		System.out.println("executar operação subtração!");
		}
	public void multiplicacao () {
		System.err.println("executar operação multiplicação!");
	}
	public void divisao () {
		System.out.println("executar operação divsão!");
	}
 
}
