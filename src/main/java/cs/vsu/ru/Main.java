package cs.vsu.ru;

import cs.vsu.ru.var2.User;
import cs.vsu.ru.var2.UserDevise;
import cs.vsu.ru.var2.devise.Devise;
import cs.vsu.ru.var2.devise.Phone;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan", "Ivanovich", 20, User.Gender.MALE);
        Devise phone = new Phone("Iphone 15", LocalDateTime.now(), 32, 128, "Сircle");
        UserDevise userDevise = new UserDevise(ivan, LocalDateTime.now());

        System.out.println(userDevise.rebootDevise());

        userDevise.setDevise(phone);

        System.out.println(userDevise.rebootDevise());
    }
}