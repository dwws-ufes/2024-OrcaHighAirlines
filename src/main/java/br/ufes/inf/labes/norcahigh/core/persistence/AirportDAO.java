package br.ufes.inf.labes.norcahigh.core.persistence;


import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.Airport;
import jakarta.ejb.Local;

@Local
public interface AirportDAO extends BaseDAO<Airport> {
}
