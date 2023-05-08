public class CredentialsValidator {
    public static void validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || password == null || confirmPassword == null) {
            throw new IllegalArgumentException("логин, пароль и его подтверждение не должны быть null.");
        }

        if (login.length() > 20) {
            throw new WrongLoginException("Длина логина не должна превышать 20 символов.");
        }

        if (!login.matches("^[a-zA-Z0-9_]*$")) {
            throw new WrongLoginException("логин может содержать только латинские буквы, цифры и символы.");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть не больше 20 символов.");
        }

        if (!password.matches("^[a-zA-Z0-9_]*$")) {
            throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и символы.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и его подтверждение должны совпадать.");
        }
    }
}
