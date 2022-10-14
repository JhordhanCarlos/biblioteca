/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_netbeans;

import java.util.Date;

/**
 *
 * @author Jhordhan
 */
public class Usuario {

    private String nome;
    private String identidade;
    private Number cpf;
    private Date dataNascimento;
    private Number idade;   
    private String role;
    private Boolean isGerente;
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the identidade
     */
    public String getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the cpf
     */
    public Number getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Number cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the idade
     */
    public Number getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Number idade) {
        this.idade = idade;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the isGerente
     */
    public Boolean getIsGerente() {
        return isGerente;
    }

    /**
     * @param isGerente the isGerente to set
     */
    public void setIsGerente(Boolean isGerente) {
        this.isGerente = isGerente;
    }

}
