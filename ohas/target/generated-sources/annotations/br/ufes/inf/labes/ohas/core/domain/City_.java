package br.ufes.inf.labes.ohas.core.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(City.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class City_ extends br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport_ {

	
	/**
	 * @see br.ufes.inf.labes.ohas.core.domain.City#country
	 **/
	public static volatile SingularAttribute<City, String> country;
	
	/**
	 * @see br.ufes.inf.labes.ohas.core.domain.City#name
	 **/
	public static volatile SingularAttribute<City, String> name;
	
	/**
	 * @see br.ufes.inf.labes.ohas.core.domain.City#state
	 **/
	public static volatile SingularAttribute<City, String> state;
	
	/**
	 * @see br.ufes.inf.labes.ohas.core.domain.City
	 **/
	public static volatile EntityType<City> class_;

	public static final String COUNTRY = "country";
	public static final String NAME = "name";
	public static final String STATE = "state";

}

