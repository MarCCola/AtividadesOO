package poo;

public class Principal {

	public static void main(String[] args) {

     Funcionario f1 = new Funcionario("Jose", 10000, "Operador");
     Funcionario f2 = new Funcionario("Antonio", 1000, "Caixa");
     Funcionario f3 = new Funcionario("Luis", 12000, "Gerente");
     
     System.out.println("Nome : " + f1.getNome());
     System.out.println("Nome : " + f1.getSalarioBruto());
     System.out.println("Nome : " + f1.getCargo());
     System.out.println("***************************");
     System.out.println("Nome : " + f2.getNome());
     System.out.println("Nome : " + f2.getSalarioBruto());
     System.out.println("Nome : " + f2.getCargo());
     System.out.println("***************************");
     System.out.println("Nome : " + f3.getNome());
     System.out.println("Nome : " + f3.getSalarioBruto());
     System.out.println("Nome : " + f3.getCargo());
     
     
     
	}

}
