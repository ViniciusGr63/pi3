public class FavoriteService {
     // adicionar e remover itens favoritos
     public void adicionarItemFavorito(Item item) {
        System.out.println("Item adicionado aos favoritos: " + item.getNome());
    }

    public void removerItemFavorito(Item item) {
        System.out.println("Item removido dos favoritos: " + item.getNome());
    }
}
