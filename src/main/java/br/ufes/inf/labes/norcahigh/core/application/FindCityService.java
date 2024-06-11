package br.ufes.inf.labes.norcahigh.core.application;

import br.ufes.inf.labes.norcahigh.core.domain.City;
import java.util.List;

public interface FindCityService {
    City findCity(String cityName);

    public List<City> findAll();

}
