package src.com.jlc2015;

public class Lab1213 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		String nm = "";
		try {
			StudentService serv = new StudentService();
			//serv.getNameBySid(null);
			//serv.getNameBySid("");
			//serv.getNameBySid("JLC-099");
			serv.getNameBySid("JLC-088");
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//throw new ClassNotFoundException();
	}
}


class StudentService {

	String getNameBySid(String sid) {
		if (sid == null) {
			throw new NullPointerException();
			// throw new NullPointerException("HellowordEx");
		} else if (sid.isEmpty()) {
			// EmptySidException ex = null;
			// throw ex;
			throw new EmptySidException();
		} else if (sid.equalsIgnoreCase("JLC-099")) {
			return "India";
		} else {
			throw new StudentNotFoundException(sid);
		}
		
		// return "Japan";
	}
}

class EmptySidException extends RuntimeException {

}

class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String sid) {
		super(sid);
	}

	@Override
	public synchronized Throwable getCause() {
		return super.getCause();
	}
}