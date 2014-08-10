package com.avoodoo.store.document.service;

import com.avoodoo.store.document.model.Document;

public class StoreDocumentServiceBean implements StoreDocumentService {

	@Override
	public Long storeToDB(Document doc) {
		// JDBC implementation to store document into DB tbd.
		return 23L;
	}

}
