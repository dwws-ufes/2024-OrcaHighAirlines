package br.ufes.inf.labes.norcahigh.core.persistence;


import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.norcahigh.core.domain.Airplane;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class AirplaneJPADAO extends BaseJPADAO<Airplane> implements AirplaneDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
