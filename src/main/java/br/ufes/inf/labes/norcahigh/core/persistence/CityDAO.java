package br.ufes.inf.labes.norcahigh.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import jakarta.ejb.Local;

@Local
public interface CityDAO extends BaseDAO<City> {

    City findByName(String name) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException;

}
