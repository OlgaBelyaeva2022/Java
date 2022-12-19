// 1. Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
// 2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
// 3. Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
// 4. Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
// 5. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
// 6. WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
// 7. Обработка исключений проводится внутри метода.
// 8. Метод возвращает true, если значения верны или false в другом случае.

package Seminar3;

import Seminar3.custom_exceptions.WrongLoginException;
import Seminar3.custom_exceptions.WrongPasswordException;

public class Task1 {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(control("uhuFfhdu_1234444444444444444", "1_23A", "1_23A"));

    }

    public static boolean control(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
        boolean loginConfirm = false;
        boolean passwordConfirm = false;
        boolean passwordCheck = password.matches("^[a-zA-Z0-9_]+$");
        try {
            if (login.length() < 20 && onlyLatinAlphabet) {
                loginConfirm = true;
            } else {
                throw new WrongLoginException("Wrong Login");
            }
            if (password.length() < 20 && passwordCheck && password.equals(confirmPassword)) {
                passwordConfirm = true;
            } else {
                throw new WrongPasswordException("Wrong Password");
            }
        } catch (WrongLoginException exception) {
            System.out.println("Wrong login");
            throw new WrongLoginException("Wrong login", exception);
        } catch (WrongPasswordException exception) {
            System.out.println("Wrong password");
            throw new WrongPasswordException("Wrong password", exception);
        }
        return (loginConfirm && passwordConfirm);
    }
}
