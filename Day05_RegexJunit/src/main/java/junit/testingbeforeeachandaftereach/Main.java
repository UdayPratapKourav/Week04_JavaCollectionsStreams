package junit.testingbeforeeachandaftereach;

public class Main {
        public static void main(String[] args) {
            DatabaseConnection dbConnection = new DatabaseConnection();

            dbConnection.connect();
            System.out.println("Is database connected? " + dbConnection.isConnected());

            dbConnection.disconnect();
            System.out.println("Is database connected? " + dbConnection.isConnected());
        }
    }


