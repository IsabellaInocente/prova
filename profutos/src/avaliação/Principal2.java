package avaliação;

public class Principal2 {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Livro");
		
		System.out.println("Cidade de Papel");
		System.out.println("nome:"+ produto.getNome());
		
		Livro livro = new Livro("John", "250", 250);
		System.out.println("\nProduto Livro");
		System.out.println("autor"+ livro.getAutor());
		System.out.println("paginas"+ livro.getPaginas());
	}

}
