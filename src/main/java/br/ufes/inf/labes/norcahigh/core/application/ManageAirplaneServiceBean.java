package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.Airplane;
import br.ufes.inf.labes.norcahigh.core.persistence.AirplaneDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageAirplaneServiceBean extends CrudServiceImpl<Airplane> implements ManageAirplaneService {

    @EJB
    private AirplaneDAO airplaneDAO;

    @Override
    public BaseDAO<Airplane> getDAO() {
        return airplaneDAO;
    }
}
