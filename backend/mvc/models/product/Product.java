public class Product{
    private int idProduto;
    private int quantidadeProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private String imgProduto;

    public Product( int idProduto, int quantidadeProduto,String nomeProduto,String descricaoProduto,String imgProduto){
      this.idProduto = idProduto;
      this.quantidadeProduto = quantidadeProduto;
      this.nomeProduto = nomeProduto;
      this.descricaoProduto = descricaoProduto;
      this.imgProduto = imgProduto;
    }

    public void getProduct (int idProduto,String nameUser){
        return Product;
    }

    public void setIdProduto (int idProduto){
        this.idProduto = idProduto;
    }
    public void setquantidadeProduto (int quantidadeProduto){
        this.quantidadeProduto = quantidadeProduto;
    }
    public void setNameProduto (String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public void setDescricaoProduto (String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }
    public void setImgProduto (String imgProduto){
        this.imgProduto = imgProduto;
    }
    
}