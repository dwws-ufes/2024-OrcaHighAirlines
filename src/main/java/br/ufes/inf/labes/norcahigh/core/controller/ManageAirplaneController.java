package br.ufes.inf.labes.norcahigh.core.controller;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.norcahigh.core.application.ManageAirplaneService;
import br.ufes.inf.labes.norcahigh.core.domain.Airplane;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class ManageAirplaneController extends CrudController<Airplane> {

    @EJB
    private ManageAirplaneService manageAirplaneService;

    @Override
    protected CrudService<Airplane> getCrudService() {
        return manageAirplaneService;
    }
}
