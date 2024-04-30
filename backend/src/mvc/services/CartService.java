public class CartService {




    public void calcularPreco(){
        double total = 0;
        for(Product produto: produtos){
          total += produto.getPrecoProduto();
        }
        System.out.println("Total: "+total);
      }
      public void listarProdutos(){
        for(Product produto: produtos){
          System.out.println("Produto: "+produto.getNumero()+" - "+produto.getNomeProduto()+" - "+produto.getPrecoProduto());
        }
      }
      public void limparCarrinho(){
        produtos.clear();
        System.out.println("Carrinho limpo com sucesso!");
      }
    
}
