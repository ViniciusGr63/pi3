public class Favoritos {
    private long id; // ID do produto
    private long userId; // ID do usuário

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    // adicionar e remover itens favoritos
    public void adicionarItemFavorito(Item item) {
        System.out.println("Item adicionado aos favoritos: " + item.getNome());
    }

    public void removerItemFavorito(Item item) {
        System.out.println("Item removido dos favoritos: " + item.getNome());
    }
}
