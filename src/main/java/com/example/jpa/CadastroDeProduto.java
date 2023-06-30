package com.example.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto acessorio = new Produto("iphone 12", "teste@gmail.com" );

        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDao dao = new ProdutoDao(em);
        dao.cadastrar(acessorio);
        em.getTransaction().begin();
        em.getTransaction().commit();
       em.close();

    }
}
