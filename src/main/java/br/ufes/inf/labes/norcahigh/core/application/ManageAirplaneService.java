package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.norcahigh.core.domain.Airplane;
import jakarta.ejb.Local;

@Local
public interface ManageAirplaneService extends CrudService<Airplane> {
}
