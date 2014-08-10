package com.avoodoo.store.document.resource;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.core.Application;

import org.apache.commons.logging.Log;

public class RestApplication extends Application {
	
	@Inject
	private Log log;
	
	private static boolean printed = false;
	
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public RestApplication(){
		classes.add(StoreDocumentRS.class);
		classes.add(ProduceJsonRS.class);
	}
	
	@Override
	public Set<Class<?>> getClasses(){
		if(!printed){
			String ind = "  ";
			StringBuilder sb = new StringBuilder();
			sb.append("\n\n");
			sb.append(ind +"StoreDocumentRS: http://<host>:<port>/<app-name>" +StoreDocumentRS.resourcePath +"\n");
			sb.append(ind +"ProduceJsonRS:   http://<host>:<port>/<app-name>" +ProduceJsonRS.resourcePath +"\n");
			log.info(sb.toString());
			printed = true;
		}
		return classes;
	}
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}

}
