package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.NotTodayException;
import exceptions.TIException;

public class Market {
	
	private List<Document> doc;
	
	public Market() {
		doc = new ArrayList<>();
	}
	
	public boolean addDocument(String type, int numberId, int day) throws NotTodayException, TIException{
		
		int id = numberId/10;
		int penultime = id%10;
		int numId = penultime%2;
		
		int numDay = day%2;
		
		boolean process = false;
		
		if(type.equals("TI")) {
			
			System.out.println("No se agregó por TI");
			throw new TIException("TI");
			
		}else if(numId==numDay) {
			
			System.out.println("No se agregó por el día");			
			throw new NotTodayException(day, penultime);
			
		}else {
			
			System.out.println("El cliente si ha podido ingresar..! ");
			doc.add(new Document(type, numberId, day));
			process = true;
			
		}
		
		System.out.println("Salí de los IF");
		return process;
	}
	
	public List<Document> getDoc() {
		return doc;
	}

	public void setDoc(List<Document> doc) {
		this.doc = doc;
	}
	
}
