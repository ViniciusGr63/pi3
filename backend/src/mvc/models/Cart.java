import java.util.ArrayList;

class Cart {
    private ArrayList<Product> produtos;
    private int precoTotal;

  
    public Cart(int precoTotal) {
        this.produtos = new ArrayList<>();
        this.precoTotal = precoTotal;
    }

    public ArrayList<Product> getProdutos() {
        return produtos;
    }

    
    public void setProdutos(ArrayList<Product> produtos) {
        this.produtos = produtos;
    }

   
    public int getPrecoTotal() {
        return precoTotal;
    }

   
    public void setPrecoTotal(int precoTotal) {
        this.precoTotal = precoTotal;
    }
}
