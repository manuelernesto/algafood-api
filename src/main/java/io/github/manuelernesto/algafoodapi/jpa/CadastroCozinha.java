package io.github.manuelernesto.algafoodapi.jpa;

import io.github.manuelernesto.algafoodapi.domain.model.Cozinha;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
        return manager.createQuery("FROM Cozinha", Cozinha.class)
                .getResultList();
    }

}










