package AtividadeOO2;

public class Livraria {

	public static void main(String [] args) {
		
  
		LivroVendido L1 = new LivroVendido("The witcher", "Emma Potter", "Prestigio", 250 , 2013 );
		
		L1.ImprimirLivro();
		L1.CalcPrecoVd(15);
		
		
		
		System.out.printf("Valor de venda :%.2f \n" ,  L1.getPrecoVenda());
		/*double x = 2.2557;
		*System.out.println("Valor de venda : "+  String.format("%.2f",  L1.getPrecoVenda() ) );*/
 }
}
