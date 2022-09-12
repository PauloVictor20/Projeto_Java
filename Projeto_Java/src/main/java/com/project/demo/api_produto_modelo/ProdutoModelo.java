package com.project.demo.api_produto_modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class ProdutoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="codigo")
    private int codigo;

    @Column(name="nome")
    private String nome;

    @Column(name="valor")
    private double valor;
    
    public void setNome(String nome){
        this.nome = nome;

    }
    public double getValor(){
        return valor;
        
    }
    public void setValor(double valor){
        this.valor =valor;
    }
}
