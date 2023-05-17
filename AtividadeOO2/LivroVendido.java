package AtividadeOO2;

public class LivroVendido {

	private String Nome;
	private String Autor;
	private String Edicao;
    private float PrecoCusto;
    private float PrecoVenda;
    private int Ano;
    
    
    public LivroVendido (String Nome, String Autor, String Edicao, float PrecoCusto, int Ano) {
    	this.Nome = Nome;
    	this.Ano = Ano;
    	this.Autor = Autor;
    	this.PrecoCusto = PrecoCusto;
    	this.Edicao = Edicao;
    }
    
    // metodos
    
    public void ImprimirLivro() {
    	
    	System.out.println("Nome do livro : " + this.Nome);
    	System.out.println("Nome do Autor do livro : " + this.Autor);
    	System.out.println("O ano do livro : " + this.Ano);
    	System.out.println("Preço de Custo do livro : " + this.PrecoCusto );
    	System.out.println("Edição do livro : " + this.Edicao);
    	
    }

    
    public double CalcPrecoVd(float Percent) {
    	
    	
    	this.PrecoVenda = PrecoCusto + this.PrecoCusto * Percent / 100;
    	        
    	
    	return this.PrecoVenda;
    }
    
    
    public double getPrecoVenda() {
		return PrecoVenda;
	}

    // getters e setters
    
	public String getNome() {
		return this.Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getAutor() {
		return this.Autor;
	}

	public void setAutor(String autor) {
		this.Autor = autor;
	}

	public String getEdicao() {
		return this.Edicao;
	}

	public void setEdicao(String edicao) {
		this.Edicao = edicao;
	}

	public float getPrecoCusto() {
		return this.PrecoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.PrecoCusto = precoCusto;
	}

	public int getAno() {
		return this.Ano;
	}

	public void setAno(int ano) {
		this.Ano = ano;
	}
}
