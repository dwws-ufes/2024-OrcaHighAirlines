package br.ufes.inf.labes.norcahigh.core.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Airport.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Airport_ extends br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport_ {

	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airport#city
	 **/
	public static volatile SingularAttribute<Airport, City> city;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airport#latitude
	 **/
	public static volatile SingularAttribute<Airport, Long> latitude;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airport#name
	 **/
	public static volatile SingularAttribute<Airport, String> name;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airport
	 **/
	public static volatile EntityType<Airport> class_;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airport#longitude
	 **/
	public static volatile SingularAttribute<Airport, Long> longitude;

	public static final String CITY = "city";
	public static final String LATITUDE = "latitude";
	public static final String NAME = "name";
	public static final String LONGITUDE = "longitude";

}

