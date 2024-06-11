package br.ufes.inf.labes.norcahigh.core.domain;

import br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
public class Airplane extends PersistentObjectSupport implements Comparable<Airplane> {
    @Size
    @NotNull
    private String name;

    @Size
    @NotNull
    private String airplaneType;

    @Min(0)
    @Max(1000)
    @NotNull
    private long serialNumber;

    @Min(0)
    @Max(1000)
    @NotNull
    private long airplaneNumber;

    @Min(0)
    @Max(1000)
    @NotNull
    private int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getAirplaneNumber() {
        return airplaneNumber;
    }

    public void setAirplaneNumber(long airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Airplane o) {
        int cmp = name.compareTo(o.name);
        if (cmp != 0);
        return cmp;
    }
}
