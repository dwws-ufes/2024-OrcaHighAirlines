package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.norcahigh.core.domain.User_;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.norcahigh.core.domain.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Stateless
public class UserJPADAO extends BaseJPADAO<User> implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public User retrieveByEmail(String email) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> root = cq.from(User.class);

        // Filters the query with the email.
        cq.where(cb.equal(root.get(User_.email), email));
        User result = executeSingleResultQuery(cq, email);
        return result;
    }
}
