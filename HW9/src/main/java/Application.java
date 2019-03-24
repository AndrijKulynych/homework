public class Application {
    public static void main(String[] args) {
        new User("Dima", 31, Sex.MALE);
        new User("Stepan", 23, Sex.MALE);
        new User("Lera", 18, Sex.FEMALE);
        new User("Nika", 29, Sex.FEMALE);
        System.out.println(" All users:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println(" All users: MALE");
        User.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("All users: FEMALE");
        User.getAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("*********************************************************");
        System.out.println("       all users: " + User.getHowManyUsers());
        System.out.println("  all users MALE: " + User.getHowManyUsers(Sex.MALE));
        System.out.println("all users FEMALE: " + User.getHowManyUsers(Sex.FEMALE));
        System.out.println("*****************************************************");
        System.out.println("       total age all users: " + User.getAllAgeUsers());
        System.out.println("  total age all users MALE: " + User.getAllAgeUsers(Sex.MALE));
        System.out.println("total age all users FEMALE: " + User.getAllAgeUsers(Sex.FEMALE));
        System.out.println("*************************************************************");
        System.out.println("      average age of all users: " + User.getAverageAgeOfAllUsers());
        System.out.println("  average age of all users MALE: " + User.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("average age of all users FEMALE: " + User.getAverageAgeOfAllUsers(Sex.FEMALE));
        System.out.println("**********************************************************************");
    }
}
