package com.avoodoo.store.document.util;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Resources {

	@Produces
	@PersistenceContext
	private EntityManager em;
	

	@Produces
	public Log getLog(InjectionPoint ip){
		return LogFactory.getLog(ip.getMember().getDeclaringClass());
	}
	
}
