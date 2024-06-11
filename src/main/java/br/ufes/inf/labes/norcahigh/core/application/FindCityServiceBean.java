package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import br.ufes.inf.labes.norcahigh.core.persistence.CityDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.List;
import java.util.logging.Logger;

@Stateless
@PermitAll
public class FindCityServiceBean implements FindCityService {

    /** Logger for this class. */
    private static final Logger logger =
            Logger.getLogger(FindCityServiceBean.class.getCanonicalName());

    @EJB
    private CityDAO cityDAO;

    @Override
    public List<City> findAll() {
        return cityDAO.retrieveAll();
    }


    @Override
    public City findCity(String cityName) {
        try {
            return cityDAO.findByName(cityName);
        } catch (PersistentObjectNotFoundException e) {
            throw new RuntimeException(e);
        } catch (MultiplePersistentObjectsFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
