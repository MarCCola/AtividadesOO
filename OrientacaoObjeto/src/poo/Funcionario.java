package poo;

public class Funcionario {
	
	private String nome;
	private float SalarioBruto;
	private String cargo;
	
public Funcionario (String nome, float Salario, String cargo) {
	
	this.cargo = cargo;
	this.nome = nome;
	SalarioBruto = Salario;
}
	
public String getNome() {
	
	return this.nome;
}

public float getSalarioBruto() {
	
	return this.SalarioBruto;
}
public String getCargo() {
	
	return this.cargo;
}

}
