package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity;
import br.ufes.inf.labes.norcahigh.core.persistence.CityCuriosityDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageCityCuriosityServiceBean extends CrudServiceImpl<CityCuriosity> implements ManageCityCuriosityService {

    @EJB
    private CityCuriosityDAO cityCuriosityDAO;

    @Override
    public BaseDAO<CityCuriosity> getDAO() {
        return cityCuriosityDAO;
    }
}
