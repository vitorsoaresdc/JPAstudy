package com.example.jpa;

import jakarta.persistence.EntityManager;

public class AdicionaProduto {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
//        em.getTransaction().begin();

        Celulares celular = new Celulares();
        celular.setNome("iphone 7");
        celular.setPreco(1.500);

        ProdutoDao dao = new ProdutoDao(em);
        dao.adicionarCelular(celular);
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.clear();


    }
}
