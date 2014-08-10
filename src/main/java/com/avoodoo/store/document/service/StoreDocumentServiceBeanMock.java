package com.avoodoo.store.document.service;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.Log;

import com.avoodoo.store.document.model.Document;

@Named
@RequestScoped
@Alternative
public class StoreDocumentServiceBeanMock implements StoreDocumentService {

	@Inject
	private Log log;
	
	@Override
	public Long storeToDB(Document doc) {
		log.info("A T T E N T I O N - you are running a mock service!");
		return 42L;
	}

}
