package br.ufes.inf.labes.norcahigh.core.application;


import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import br.ufes.inf.labes.norcahigh.core.persistence.CityDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageCitiesServiceBean extends CrudServiceImpl<City> implements ManageCitiesService {

    @EJB
    private CityDAO cityDAO;

    @Override
    public BaseDAO<City> getDAO(){
        return cityDAO;
    }

}
