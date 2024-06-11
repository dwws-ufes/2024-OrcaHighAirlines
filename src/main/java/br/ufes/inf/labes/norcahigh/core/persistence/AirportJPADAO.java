package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.norcahigh.core.domain.Airport;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class AirportJPADAO extends BaseJPADAO<Airport> implements AirportDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
