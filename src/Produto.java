
public class Produto {
    private int codigo;
    private String nome;
    private float preco;
    private int qtd;


    public Produto(int codigo, String nome, float preco, int qtd) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            ", qtd='" + getQtd() + "'" +
            "}";
    }

}