package Funcionario;

public class Funcionario_CLT extends Funcionario {

    public double calcularSalario() {
       
        return salarioBase - (salarioBase * 0.08);
    }


}
