package com.avoodoo.store.document.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;

import com.avoodoo.store.document.model.Document;
import com.avoodoo.store.document.service.StoreDocumentService;

@Path(StoreDocumentRS.resourcePath)
@Named
@RequestScoped
public class StoreDocumentRS {
	
	
	public static final String resourcePath = "/store/document";

	@Inject
	private StoreDocumentService service;
	
	@Inject
	private Log log;
	
	@GET
	@Path("/ping")
	@Produces(MediaType.APPLICATION_JSON)
	public String ping(){
		return "... I'm alive and productive!";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Long store(Document doc){
		log.info("\n\n...try to store document to DB " +doc +"\n");
		return service.storeToDB(doc);
	}
}
