package br.ufes.inf.labes.ohas.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.ohas.core.domain.City;
import jakarta.ejb.Local;

@Local
public interface ManageCitiesService extends CrudService<City> {
}
