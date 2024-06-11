package br.ufes.inf.labes.norcahigh.core.application;


import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity;
import br.ufes.inf.labes.norcahigh.core.persistence.AirplaneCuriosityDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageAirplaneCuriosityServiceBean extends CrudServiceImpl<AirplaneCuriosity> implements ManageAirplaneCuriosityService {

    @EJB
    private AirplaneCuriosityDAO airplaneCuriosityDAO;

    @Override
    public BaseDAO<AirplaneCuriosity> getDAO() {
        return airplaneCuriosityDAO;
    }
}
