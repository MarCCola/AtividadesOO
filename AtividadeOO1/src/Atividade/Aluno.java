package Atividade;

public class Aluno {

	//Atributos
	
	private int Matricula;
	private String Nome;
	private int AnoIngressado;
	private String Curso;
	private int QuantidadeDeMaterias;
	private String situacao;
	
	// Metodos 
	
	public Aluno (String Nome,int AnoIngressado, String Curso) {
		
	     this.Nome = Nome;
		 this.AnoIngressado = AnoIngressado ;
		 this.Curso = Curso;
	}
	
	public int PermaneciaFaculdade(int AnoAtual) {
		
		AnoIngressado -= AnoAtual;
		return AnoIngressado;
	}
	
	public float Mensalidade(int QntMaterias) {
          
		QuantidadeDeMaterias = QntMaterias * 150;
		
		return QuantidadeDeMaterias;
  	}
	
	// Getters
	
	public String getNome() {
		return this.Nome;
	}
	
	public int getMatricula() {
		return this.Matricula;
	}
	
	public String getCurso() {
		return this.Curso;
	}
	
	public String getSituacao() {
		return this.situacao;
	}
	
}
