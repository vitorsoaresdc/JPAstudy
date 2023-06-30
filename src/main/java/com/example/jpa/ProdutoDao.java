package com.example.jpa;

import jakarta.persistence.EntityManager;

public class ProdutoDao {
    private EntityManager em;
    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

    public void adicionarCelular(Celulares celulares) {
        this.em.persist(celulares);
    }

    public void apagar(Celulares celulares) {
        this.em.remove(celulares);
    }
}
