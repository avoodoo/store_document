package com.avoodoo.store.document.service;

import com.avoodoo.store.document.model.Document;

public interface StoreDocumentService {
	
	public abstract Long storeToDB(Document doc);

}
