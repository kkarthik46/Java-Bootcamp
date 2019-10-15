class InvalidAgeException extends Exception{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class Age{
	void agever(int age) throws InvalidAgeException
	{
		if(age>18)
			System.out.println("user is eligible to vote");
		else
			throw new InvalidAgeException("invalid age");
	}	
}
public class Demo{
	public static void main(String[] args) throws InvalidAgeException {
		Age age=new Age();
		age.agever(19);
	}
}
