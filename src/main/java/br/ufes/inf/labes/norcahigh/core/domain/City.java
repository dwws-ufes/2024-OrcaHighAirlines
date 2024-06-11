package br.ufes.inf.labes.norcahigh.core.domain;

import br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class City extends PersistentObjectSupport implements Comparable<City> {

    @Size
    @NotNull
    private String name;

    @Size
    @NotNull
    private String state;

    @Size
    @NotNull
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int compareTo(City o) {
        int cmp = name.compareTo(o.name);
        if (cmp != 0);
        return cmp;
    }
}
