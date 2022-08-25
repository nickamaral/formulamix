package br.com.formulamix.produtosmix.products;

import org.hibernate.ObjectNotFoundException;

import java.io.Serializable;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException() {
        super("produto não encontrado");
    }
}
