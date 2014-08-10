package com.avoodoo.store.document.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "attachment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Attachement {
	
	@XmlElement(name = "type")
	private String type;
	
	@XmlElement(name = "data")
	private String data;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
    public String toString(){
    	String ind = "  ---> ";
    	StringBuilder sb = new StringBuilder();
    	sb.append("\n");
    	sb.append(ind +"type: " +getType()+"\n");
    	sb.append(ind +"data: ** data could be encoded in Base64 **\n");
    	return sb.toString();
    }
}
