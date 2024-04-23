package br.ufes.inf.labes.ohas.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.ohas.core.domain.City;
import jakarta.ejb.Local;

@Local
public interface CityDAO extends BaseDAO<City> {

}
