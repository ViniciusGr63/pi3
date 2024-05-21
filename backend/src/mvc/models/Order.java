public class Order {
    private int OderId;
    private List<Product> produtosOrder;
    private int precoOder;

    public Order (int OderId, List<Product> produtosOrder,int precoOder){
        this.OderId = OderId;
        this.produtosOrder = new ArrayList<Product>();
        this.precoOder = precoOder;

    }

    
    
    public int getOrderId() {
        return orderId;
    }

    
    public List<Product> getProdutosOrder() {
        return new ArrayList<>(produtosOrder); 
    }

   
    public void setProdutosOrder(List<Product> produtosOrder) {
        this.produtosOrder = new ArrayList<>(produtosOrder); 
    }

  
    public int getPrecoOrder() {
        return precoOrder;
    }

    public void setPrecoOrder(int precoOrder) {
        this.precoOrder = precoOrder;
    }

    
}
