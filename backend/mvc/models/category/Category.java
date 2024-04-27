import java.util.List;

public class Categoria {
    private String nomeCategoria;
    private List<String> produtos;

    public Categoria(String nomeCategoria, List<String> produtos) {
        this.nomeCategoria = nomeCategoria;
        this.produtos = produtos;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }
}