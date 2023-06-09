package br.com.maquiny.mvc.mudimarketplace.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity 
public class Pedido {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataDeEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
    	descricao = descricao;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }
    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }
    public LocalDate getDataDeEntrega() {
        return dataDeEntrega;
    }
    public void setDataDeEntrega(LocalDate dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }
    public String getUrlProduto() {
        return urlProduto;
    }
    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }
    public String getUrlImagem() {
        return urlImagem;
    }
    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

}
