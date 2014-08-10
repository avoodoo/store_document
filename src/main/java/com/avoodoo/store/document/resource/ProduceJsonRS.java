package com.avoodoo.store.document.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;

import com.avoodoo.store.document.model.Document;
import com.avoodoo.store.document.util.DocCreator;

@Path(ProduceJsonRS.resourcePath)
@Named
@RequestScoped
public class ProduceJsonRS {
	
	public static final String resourcePath = "/store/produce";
	
	@Inject
	private Log log;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Document produce(){
		log.info("REST call to create a document");
		return new DocCreator().createDummyDocument(1);
	}
}
