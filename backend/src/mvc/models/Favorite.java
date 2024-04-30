import java.util.List;
import java.util.ArrayList;

public class Favorite {
    private List<Product> produtosFavorite;
    private int nameFavoriteList;

    public Favorite(int nameFavoriteList) {
        this.nameFavoriteList = nameFavoriteList;
        this.produtosFavorite = new ArrayList<>();
    }

    public List<Product> getProdutosFavorite() {
        return new ArrayList<>(produtosFavorite); 
    }


    public void setProdutosFavorite(List<Product> produtosFavorite) {
        this.produtosFavorite = new ArrayList<>(produtosFavorite); 
    }

  
    public int getNameFavoriteList() {
        return nameFavoriteList;
    }

   
    public void setNameFavoriteList(int nameFavoriteList) {
        this.nameFavoriteList = nameFavoriteList;
    }
}
