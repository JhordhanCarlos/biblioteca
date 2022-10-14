package biblioteca_netbeans;

/**
 *
 * @author Jhordhan
 */
class Alugavel {

    private String titulo;
    private String tipo;
    private String editora;
    private Number isbn;
    private Float preco;
    private Boolean isRented;
    private Number classificacao;
    private Number numPaginas;
    private String tema;
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the isbn
     */
    public Number getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(Number isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the preco
     */
    public Float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Float preco) {
        this.preco = preco;
    }

    /**
     * @return the isRented
     */
    public Boolean getIsRented() {
        return isRented;
    }

    /**
     * @param isRented the isRented to set
     */
    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }

    /**
     * @return the classificacao
     */
    public Number getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(Number classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the numPaginas
     */
    public Number getNumPaginas() {
        return numPaginas;
    }

    /**
     * @param numPaginas the numPaginas to set
     */
    public void setNumPaginas(Number numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }
    
}
