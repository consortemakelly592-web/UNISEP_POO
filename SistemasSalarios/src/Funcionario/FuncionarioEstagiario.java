package Funcionario;

public class FuncionarioEstagiario extends Funcionario {
	public double calcularSalario() {
        
        return salarioBase - (salarioBase * 0.05);
    }

}
