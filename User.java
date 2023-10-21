package my_project;

public class User {
    public static void main(String[] args) {
        // Create a User object
        User user = new User();

        // Access and print user properties
        System.out.println("User ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }

	String getEmail() {
		// TODO Auto-generated method stub
		return "venky@gmail.com";
	}

	String getUsername() {
		// TODO Auto-generated method stub
		return "Venky";
	}

	String getId() {
		// TODO Auto-generated method stub
		return "505";
	}
}
