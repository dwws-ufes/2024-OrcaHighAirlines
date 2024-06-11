package br.ufes.inf.labes.norcahigh.core.controller;


import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.jbutler.ejb.controller.PersistentObjectConverterFromId;
import br.ufes.inf.labes.norcahigh.core.application.ManageCityCuriosityService;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity;
import br.ufes.inf.labes.norcahigh.core.persistence.CityDAO;
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
public class ManageCityCuriosityController extends CrudController<CityCuriosity> {

    /**
     * Logger for this class.
     */
    private static final Logger logger =
            Logger.getLogger(ManageCityCuriosityController.class.getCanonicalName());


    @EJB
    private ManageCityCuriosityService manageCityCuriosityService;

    /**
     * List of existing cities, used to populate a drop-down field of the CRUD form.
     */
    private List<City> cities;

    /**
     * Converter for City objects, used in a drop-down field of the CRUD form.
     */
    private PersistentObjectConverterFromId<City> cityConverter;

    @Override
    protected CrudService<CityCuriosity> getCrudService() {
        return manageCityCuriosityService;
    }

    /**
     * Method called by CDI to initialize the list of cities and the City converter.
     *
     * @param cityDAO DAO to retrieve City objects and required by the JButler converter.
     */
    @Inject
    void initConverter(CityDAO cityDAO) {
        logger.log(Level.FINEST, "Initializing converter");
        cities = cityDAO.retrieveAll();
        Collections.sort(cities);
        cityConverter = new PersistentObjectConverterFromId<>(cityDAO);

    }

    public List<City> getCities() {
        return cities;
    }

    public PersistentObjectConverterFromId<City> getCityConverter() {
        return cityConverter;
    }
}