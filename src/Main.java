public class Main {
    public static void main(String[] args) {
        try {
            CredentialsValidator.validateCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Логин  и пароль введены верно.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}