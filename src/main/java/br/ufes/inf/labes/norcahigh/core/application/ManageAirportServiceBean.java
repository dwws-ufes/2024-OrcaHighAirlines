package br.ufes.inf.labes.norcahigh.core.application;


import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.Airport;
import br.ufes.inf.labes.norcahigh.core.persistence.AirportDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageAirportServiceBean extends CrudServiceImpl<Airport> implements ManageAirportService {
    @EJB
    private AirportDAO airportDAO;

    @Override
    public BaseDAO<Airport> getDAO() {
        return airportDAO;
    }
}
