public class User{
    private int idUser;
    private String nameUser;
    private String emailUser;
    private String senhaUser;

    public User(int idUser, String nameUser, String emailUser, String senhaUser){
        this.idUser = idUser;
        this.emailUser = emailUser;
        this.emailUser = emailUser;
        this.senhaUser = senhaUser;
    }
    public void getUser(int idUser, String nameUser){
        return User;

    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public void setNameUser(String nameUser){
        this.nameUser = nameUser;
    }
    public void setEmailUser(String emailUser){
        this.emailUser = emailUser;
    }
    public void setSenhalUser(String senhaUser){
        this.senhaUser = senhaUser;
    }
}