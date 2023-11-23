package avaliação;

public class Principal {

	public static void main(String[]args) {
		
		Pedido pedido = new Pedido("mouse", 5, 4);
		
		pedido.setId(5);
		pedido.setProduto("mouse");
		pedido.setQuantidade(4);
		
		System.out.println(pedido.getId());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getQuantidade());
	}
}
