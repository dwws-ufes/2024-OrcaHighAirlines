package br.ufes.inf.labes.norcahigh.core.controller;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.jbutler.ejb.controller.PersistentObjectConverterFromId;
import br.ufes.inf.labes.norcahigh.core.application.ManageAirplaneCuriosityService;
import br.ufes.inf.labes.norcahigh.core.domain.Airplane;
import br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import br.ufes.inf.labes.norcahigh.core.persistence.AirplaneDAO;
import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@ViewScoped
public class ManageAirplaneCuriosityController extends CrudController<AirplaneCuriosity> {

    private static final Logger logger =
            Logger.getLogger(ManageAirplaneCuriosityController.class.getCanonicalName());

    @EJB
    private ManageAirplaneCuriosityService manageAirplaneCuriosityService;

    /**
     * List of existing cities, used to populate a drop-down field of the CRUD form.
     */
    private List<Airplane> airplanes;

    /**
     * Converter for City objects, used in a drop-down field of the CRUD form.
     */
    private PersistentObjectConverterFromId<Airplane> airplaneConverter;

    @Override
    protected CrudService<AirplaneCuriosity> getCrudService() {
        return manageAirplaneCuriosityService;
    }

    @Inject
    void initConverter(AirplaneDAO airplaneDAO) {
        logger.log(Level.FINEST, "Initializing converter");
        airplanes = airplaneDAO.retrieveAll();
        Collections.sort(airplanes);
        airplaneConverter = new PersistentObjectConverterFromId<>(airplaneDAO);

    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public PersistentObjectConverterFromId<Airplane> getAirplaneConverter() {
        return airplaneConverter;
    }
}
