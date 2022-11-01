package Lab12;

public class Lab12 {

	public static void main(String[] args) {

		UserService service = new UserService();
		//service.clearList();

		try {
			service.registerUser("A", "AAA");
            service.registerUser("A", "BBB");
			service.registerUser("C", "CCC");

		} catch (DuplicatetException e) {
			e.message();
		}

		System.out.println(service.loginUser("A", "AAA").toString());
		System.out.println(service.loginUser("C", "CCC").toString());
	}
}
