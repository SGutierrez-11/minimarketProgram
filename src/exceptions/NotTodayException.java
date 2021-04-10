package exceptions;

@SuppressWarnings("serial")
public class NotTodayException extends Exception{

	private int day;
	private int currentId;
	public NotTodayException(int today, int idCurrent) {
		super("This person cannot enter the market today.");
		day = today;
		currentId=idCurrent;
	}
	public int getDay() {
		return day;
	}
	public int getCurrentId() {
		return currentId;
	}
	
}

