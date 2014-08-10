package com.avoodoo.store.document.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Frank Sprich - a|voodoo
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="document")
public class Document {
	
	@XmlElement(name="documenId")
    Long documentId;
        
    @XmlElement(name="pages")
    Integer pages;
        
    @XmlElement(name="attachment")
    List<Attachement> attachment;        
    
    @XmlElement(name="verdict")
    String verdict;
    
    @XmlElement(name="exceptionMessage")
    String exceptionMessage;

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public List<Attachement> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<Attachement> attachment) {
		this.attachment = attachment;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

    public String toString(){
    	String ind = "  -> ";
    	StringBuilder sb = new StringBuilder();
    	sb.append("\n");
    	sb.append(ind +"documentId: " +getDocumentId() +"\n");
    	sb.append(ind +"pages: " +getPages() +"\n");
    	sb.append(ind +"attachement: \n" +getAttachment() +"\n");
    	sb.append(ind +"verdict: " +getVerdict() +"\n");
    	sb.append(ind +"execeptionMessage: " +getExceptionMessage() +"\n");
    	return sb.toString();
    }
    
}
