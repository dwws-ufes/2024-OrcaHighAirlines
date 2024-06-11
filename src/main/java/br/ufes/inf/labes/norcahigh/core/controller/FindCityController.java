package br.ufes.inf.labes.norcahigh.core.controller;


import br.ufes.inf.labes.jbutler.ejb.controller.JSFController;
import br.ufes.inf.labes.norcahigh.core.application.FindCityService;
import br.ufes.inf.labes.norcahigh.core.domain.City;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.model.ResponsiveOption;

import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class FindCityController extends JSFController {

    @EJB
    private FindCityService findCityService;

    @Inject
    private SessionController sessionController;

    private List<ResponsiveOption> responsiveOptions;

    private List<City> cities;

    private City selectedCity;

    @PostConstruct
    public void init() {
        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1024px", 3, 3));
        responsiveOptions.add(new ResponsiveOption("768px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("560px", 1, 1));
    }

    public City getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(City selectedCity) {
        this.selectedCity = selectedCity;
    }

    public List<City> getCities() {
        return findCityService.findAll();
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }
}
