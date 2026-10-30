package Funcionario;

public class Main {

	public static void main(String[] args) {

		// 1. Instanciando os funcionários
        Funcionario_CLT clt = new Funcionario_CLT();
        clt.nome = "Ana Silva";
        clt.salarioBase = 3000.0;

        Funcionario_PJ pj = new Funcionario_PJ();
        pj.nome = "Carlos Souza";
        pj.salarioBase = 5000.0;

        FuncionarioEstagiario estagiario = new FuncionarioEstagiario();
        estagiario.nome = "Mariana Lima";
        estagiario.salarioBase = 1500.0;

        // 2 e 3. Apresentando os dados e calculando o salário no console
        System.out.println("--- Funcionário CLT ---");
        System.out.println("Nome: " + clt.nome);
        System.out.println("Salário-base: R$ " + clt.salarioBase);
        System.out.println("Salário Final: R$ " + clt.calcularSalario());

        System.out.println("\n--- Funcionário PJ ---");
        System.out.println("Nome: " + pj.nome);
        System.out.println("Salário-base: R$ " + pj.salarioBase);
        System.out.println("Salário Final: R$ " + pj.calcularSalario());

        System.out.println("\n--- Funcionário Estagiário ---");
        System.out.println("Nome: " + estagiario.nome);
        System.out.println("Salário-base: R$ " + estagiario.salarioBase);
        System.out.println("Salário Final: R$ " + estagiario.calcularSalario());
    }

	}
