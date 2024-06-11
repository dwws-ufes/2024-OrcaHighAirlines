package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.norcahigh.core.domain.Airport;
import jakarta.ejb.Local;

@Local
public interface ManageAirportService extends CrudService<Airport> {
}
