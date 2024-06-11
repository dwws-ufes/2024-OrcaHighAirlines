package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import br.ufes.inf.labes.norcahigh.core.domain.City_;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Stateless
public class CityJPADAO extends BaseJPADAO<City> implements CityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }


    @Override
    public City findByName(String name) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException {
        // Constructs the query over the City class.
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<City> cq = cb.createQuery(City.class);
        Root<City> root = cq.from(City.class);

        // Filters the query with the acronym.
        cq.where(cb.equal(root.get(City_.name), name));
        City result = executeSingleResultQuery(cq, name);
        return result;
    }
}
