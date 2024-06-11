package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.norcahigh.core.domain.User;
import jakarta.ejb.Local;

@Local
public interface UserDAO extends BaseDAO<User> {

    User retrieveByEmail(String email) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException;
}
