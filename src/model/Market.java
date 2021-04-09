package model;

import java.util.ArrayList;
import java.util.List;

public class Market {
	
	private List<Document> doc;
	
	public Market() {
		setDoc(new ArrayList<>());
	}
	
	public void addDocument(DocumentType type, int numberId) {
		doc.add(new Document(type, numberId));
	}
	
	
	public List<Document> getDoc() {
		return doc;
	}

	public void setDoc(List<Document> doc) {
		this.doc = doc;
	}
	
}
