package src.com.test;
class InvalidUserIdException extends Exception
{
	String userId;
	public InvalidUserIdException(){}
	
	public InvalidUserIdException(String userId)
	{
		this.userId=userId;
	}
	public String getMessage()
	{
		return "user Id is :"+userId+"Invalid";
	}

	public String toString()
	{
		return "InvalidUserIdException :"+getMessage();
	}
}

class ConnectToServer
{
	public void connectToChat(String userId)
	{
		try{
			if(userId.equals("som"))
				System.out.println("You are welcome to som chatRoom");
			else{
				System.out.println("Sorry try again---with valid user Id");
			 	throw new InvalidUserIdException(userId);
				//throw new Exception("my ex");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

public class Test108
{
	public static void main(String args[])
	{
		ConnectToServer cts=new ConnectToServer();
		cts.connectToChat(args[0]);
	}
}