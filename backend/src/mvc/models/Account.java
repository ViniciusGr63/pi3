import com.google.firebase.auth.internal.GetAccountInfoResponse.User;

public class Account extends User {

    private String enderecoUser;
    private String metodoPagamento;

    public Account(String enderecoUser, String metodoPagamento) {
        super();
        this.enderecoUser = enderecoUser; 
        this.metodoPagamento = metodoPagamento;
    }

    public String getEnderecoUser() {
        return enderecoUser;
    }

    public void setEnderecoUser(String enderecoUser) {
        this.enderecoUser = enderecoUser;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
