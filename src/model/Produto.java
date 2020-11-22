package model;

public class Produto {
    private String descricao;
    private String categoria;
    private double qntEstoque;
    private double vlrVenda;
    private String unidade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getQntEstoque() {
        return qntEstoque;
    }

    public void setQntEstoque(double qntEstoque) {
        this.qntEstoque = qntEstoque;
    }

    public double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    
}
