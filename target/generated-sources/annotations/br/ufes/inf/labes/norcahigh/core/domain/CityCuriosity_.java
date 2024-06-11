package br.ufes.inf.labes.norcahigh.core.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(CityCuriosity.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class CityCuriosity_ extends br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport_ {

	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity#city
	 **/
	public static volatile SingularAttribute<CityCuriosity, City> city;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity#name
	 **/
	public static volatile SingularAttribute<CityCuriosity, String> name;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity#description
	 **/
	public static volatile SingularAttribute<CityCuriosity, String> description;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity#event
	 **/
	public static volatile SingularAttribute<CityCuriosity, String> event;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity
	 **/
	public static volatile EntityType<CityCuriosity> class_;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.CityCuriosity#eventDate
	 **/
	public static volatile SingularAttribute<CityCuriosity, LocalDate> eventDate;

	public static final String CITY = "city";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String EVENT = "event";
	public static final String EVENT_DATE = "eventDate";

}

