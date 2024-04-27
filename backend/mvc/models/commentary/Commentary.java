import java.util.Date;

public class Comentario {

    private String nomeAutor;
    private String textoComentario;
    private Date dataComentario;

    public Comentario(String nomeAutor, String textoComentario, Date dataComentario) {
        this.nomeAutor = nomeAutor;
        this.textoComentario = textoComentario;
        this.dataComentario = dataComentario;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTextoComentario() {
        return textoComentario;
    }
    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }


    public Date getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
    }
    public void editarTexto(String novoTexto) {
        this.textoComentario = novoTexto;
    }
    public void excluir() {

    }
}