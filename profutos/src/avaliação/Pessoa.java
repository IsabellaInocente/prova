package avaliação;

public class Pessoa {
	public String nome;
	public int numero;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

}
