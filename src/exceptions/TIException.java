package exceptions;

@SuppressWarnings("serial")
public class TIException extends Exception{
	
	private String typeDenied;
	
	public TIException(String deniedType) {
		super("This person cannot enter the market");
		typeDenied=deniedType;
	}

	public String getTypeDenied() {
		return typeDenied;
	}

	
}
