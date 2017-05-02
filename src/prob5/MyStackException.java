package prob5;

public class MyStackException extends ArrayIndexOutOfBoundsException {

	private static final long serialVersionUID = 1L;
	
	public MyStackException(){
		super("stack is empty");
	}
	public MyStackException(String message){
		super(message);
	}

	

}
