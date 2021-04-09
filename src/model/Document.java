package model;

public class Document {
	
	private int numberId;
	private DocumentType type;
	private int day;
	
	public Document(DocumentType type, int numberId, int day) {
		
		this.type=type;
		this.numberId=numberId;
		
	}

	public int getNumberId() {
		return numberId;
	}

	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}

	public DocumentType getType() {
		return type;
	}

	public void setType(DocumentType type) {
		this.type = type;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	
}
