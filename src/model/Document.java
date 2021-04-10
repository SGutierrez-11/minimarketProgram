package model;

public class Document {
	
	private int numberId;
	private String type;
	private int day;
	
	public Document(String type, int numberId, int day) {
		
		this.type=type;
		this.numberId=numberId;
		this.day=day;
		
	}

	public int getNumberId() {
		return numberId;
	}

	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	
}
