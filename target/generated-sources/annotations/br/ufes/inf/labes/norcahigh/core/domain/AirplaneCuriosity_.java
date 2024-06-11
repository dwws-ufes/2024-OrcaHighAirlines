package br.ufes.inf.labes.norcahigh.core.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(AirplaneCuriosity.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class AirplaneCuriosity_ extends br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport_ {

	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity#airplane
	 **/
	public static volatile SingularAttribute<AirplaneCuriosity, Airplane> airplane;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity#name
	 **/
	public static volatile SingularAttribute<AirplaneCuriosity, String> name;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity#description
	 **/
	public static volatile SingularAttribute<AirplaneCuriosity, String> description;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity#event
	 **/
	public static volatile SingularAttribute<AirplaneCuriosity, String> event;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity
	 **/
	public static volatile EntityType<AirplaneCuriosity> class_;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.AirplaneCuriosity#eventDate
	 **/
	public static volatile SingularAttribute<AirplaneCuriosity, LocalDate> eventDate;

	public static final String AIRPLANE = "airplane";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String EVENT = "event";
	public static final String EVENT_DATE = "eventDate";

}

