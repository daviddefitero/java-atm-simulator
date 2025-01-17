public class User {
    private static int id;
    private static String name;
    private static String surname;
    private static String email;
    private static String password;

    private static float balance;
    private static float interestRate;
    private static float interest;
    private static float totalBalance;
    private static float withdrawalLimit;

    private static Object[] transactions;

    private User(int id, String name, String surname, String email, String password, float balance, float interestRate, float interest, float totalBalance, float withdrawalLimit) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.balance = 1000;
        this.interestRate = 0.01f;
        this.interest = 0;
        this.totalBalance = 0;
        this.withdrawalLimit = 200;
        this.transactions = new Object[10];
    }

    public static void createUser(int id, String name, String surname, String email, String password, float balance, float interestRate, float interest, float totalBalance, float withdrawalLimit, Object[] objects) {
        User user = new User(id, name, surname, email, password, balance, interestRate, interest, totalBalance, withdrawalLimit);
    }

    public static int getId(){
        return id;
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

    public static float getBalance() {
        return balance;
    }

    public static float getInterestRate() {
        return interestRate;
    }

    public static float getInterest() {
        return interest;
    }

    public static float getTotalBalance() {
        return totalBalance;
    }

    public static float getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public static Object[] getTransactions() {
        return transactions;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static void setSurname(String surname) {
        User.surname = surname;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static void setPassword(String password) {
        User.password = password;
    }


    public static void setWithdrawalLimit(float withdrawalLimit) {
        User.withdrawalLimit = withdrawalLimit;
    }

    public static float addBalance(float amount) {
        balance += amount;
        return balance;
    }

    public static float removeBalance(float amount) {
        balance -= amount;
        return balance;
    }

    public static String getTime() {
        return java.time.LocalDateTime.now().toString();
    }

    public static void addTransaction(String type, float amount) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = getTime() + " " + type + " " + amount;
                break;
            }
        }
    }

}
