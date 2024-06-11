package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class AirplaneCuriosityJPADAO extends BaseJPADAO<AirplaneCuriosity> implements AirplaneCuriosityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
