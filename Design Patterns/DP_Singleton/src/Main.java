public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.setId(1);
        logger1.setName("Karan");
        logger1.setPass("Karan@123");

        logger2.setId(2);
        logger2.setName("Dipesh");
        logger2.setPass("Dipesh@123");

        System.out.println("Currently logged in use is: " + logger1.getName() + " and he's password is: " + logger1.getPass());
        System.out.println("Currently logged in use is: " + logger2.getName() + " and he's password is: " + logger2.getPass());
        System.out.println(logger1);
        System.out.println(logger2);
    }
}