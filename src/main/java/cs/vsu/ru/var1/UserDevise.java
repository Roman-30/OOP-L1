package cs.vsu.ru.var1;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserDevise {

    private User user;

    private Devise devise;

    private LocalDateTime purchaseDate;

    public UserDevise(User user, Devise devise, LocalDateTime purchaseDate) {
        this.user = user;
        this.devise = devise;
        this.purchaseDate = purchaseDate;
    }

    public UserDevise(User user, LocalDateTime purchaseDate) {
        this(user, null, purchaseDate);
    }

    public void sellDevise(Devise devise) {
        this.setDevise(devise);
    }

    public Devise sellDevise() {
        Devise devise = this.devise;
        this.devise = null;
        return devise;
    }

    // Другие методы....

    public String rebootDevise() {
        if (Objects.isNull(devise)) {
            return "Утройстова нет!";
        }
        return this.devise.reboot();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "UserDevise{" +
                "user=" + user +
                ", devise=" + devise +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
