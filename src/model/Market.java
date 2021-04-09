package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.NotTodayException;
import exceptions.TIException;

public class Market {
	
	private List<Document> doc;
	
	public Market() {
		setDoc(new ArrayList<>());
	}
	
	public void addDocument(DocumentType type, int numberId, int day) throws NotTodayException, TIException{
		
		int id = numberId/10;
		int penultime = numberId%10;
		int numId = penultime%2;
		
		int numDay = day%2;
		
		if(type==DocumentType.TI) {
		
		
		}
		
		if(numId==numDay) {
			
		}
		doc.add(new Document(type, numberId, day));
	}
	
	public List<Document> getDoc() {
		return doc;
	}

	public void setDoc(List<Document> doc) {
		this.doc = doc;
	}
	
}
