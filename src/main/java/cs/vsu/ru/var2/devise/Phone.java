package cs.vsu.ru.var2.devise;

import java.time.LocalDateTime;

public class Phone extends Devise {

    private String shape;

    public Phone(String name, LocalDateTime createData, Integer RAM, Integer memory, String shape) {
        super(name, createData, RAM, memory);
        this.shape = shape;
    }

    public Phone() {
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "shape='" + shape + '\'' +
                "} " + super.toString();
    }
}
