package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity;
import jakarta.ejb.Local;

@Local
public interface ManageAirplaneCuriosityService extends CrudService<AirplaneCuriosity> {
}
