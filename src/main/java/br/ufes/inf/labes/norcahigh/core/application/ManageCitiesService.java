package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import jakarta.ejb.Local;

@Local
public interface ManageCitiesService extends CrudService<City> {
}
