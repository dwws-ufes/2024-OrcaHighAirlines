package br.ufes.inf.labes.norcahigh.core.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Airplane.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Airplane_ extends br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport_ {

	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airplane#serialNumber
	 **/
	public static volatile SingularAttribute<Airplane, Long> serialNumber;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airplane#airplaneNumber
	 **/
	public static volatile SingularAttribute<Airplane, Long> airplaneNumber;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airplane#airplaneType
	 **/
	public static volatile SingularAttribute<Airplane, String> airplaneType;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airplane#name
	 **/
	public static volatile SingularAttribute<Airplane, String> name;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airplane
	 **/
	public static volatile EntityType<Airplane> class_;
	
	/**
	 * @see br.ufes.inf.labes.norcahigh.core.domain.Airplane#capacity
	 **/
	public static volatile SingularAttribute<Airplane, Integer> capacity;

	public static final String SERIAL_NUMBER = "serialNumber";
	public static final String AIRPLANE_NUMBER = "airplaneNumber";
	public static final String AIRPLANE_TYPE = "airplaneType";
	public static final String NAME = "name";
	public static final String CAPACITY = "capacity";

}

