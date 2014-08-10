package com.avoodoo.store.document.util;

import java.util.ArrayList;
import java.util.List;

import com.avoodoo.store.document.model.Attachement;
import com.avoodoo.store.document.model.Document;


public class DocCreator {

	public Document createDummyDocument(int i){
		Document doc = new Document();
		doc.setDocumentId(42L);
		doc.setPages(6);
		doc.setVerdict("OK");
		
		List<Attachement> attachments = new ArrayList<Attachement>();
		
		Attachement at = new Attachement();	
		at.setType("application/pdf");
		at.setData("dummy data");
		attachments.add(at);
		
		Attachement at1 = new Attachement();	
		at1.setType("image/jpeg");
		at1.setData("dummy image data");
		attachments.add(at1);
		
		doc.setAttachment(attachments);
		return doc;
	}
	
}
