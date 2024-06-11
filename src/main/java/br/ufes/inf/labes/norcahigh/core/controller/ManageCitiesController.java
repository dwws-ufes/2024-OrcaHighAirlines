package br.ufes.inf.labes.norcahigh.core.controller;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.norcahigh.core.application.ManageCitiesService;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class ManageCitiesController extends CrudController<City> {

    @EJB
    private ManageCitiesService manageCitiesService;

    @Override
    protected CrudService<City> getCrudService() {
        return manageCitiesService;
    }

}
