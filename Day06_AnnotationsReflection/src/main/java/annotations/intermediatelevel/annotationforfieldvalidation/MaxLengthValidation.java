package annotations.intermediatelevel.annotationforfieldvalidation;

public class MaxLengthValidation {
    public static void main(String[] args) {
        try {
            // Valid username
            User user1 = new User("Rakesh");
            System.out.println("User1 created: " + user1);

            // Invalid username
            User user2 = new User("rakesh_long_username");
            System.out.println("User2 created: " + user2);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
