package exceptions;

import model.DocumentType;

public class TIException extends Exception{
	
	private DocumentType typeDenied;
	private DocumentType currentType;
	
	public TIException(DocumentType deniedType,DocumentType typeCurrent) {
		super("This person cannot enter the market");
		typeDenied=deniedType;
		currentType = typeCurrent;
	}

	public DocumentType getTypeDenied() {
		return typeDenied;
	}

	public DocumentType getCurrentType() {
		return currentType;
	}
	
}
