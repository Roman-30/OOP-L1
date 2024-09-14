package cs.vsu.ru.var2.devise;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Computer extends Devise {
    private List<String> ports;

    public Computer(String name, LocalDateTime createData, Integer RAM, Integer memory, List<String> ports) {
        super(name, createData, RAM, memory);
        this.ports = ports;
    }

    public void addPort(String port) {
        if (Objects.isNull(ports)) {
            ports = new ArrayList<>();
            ports.add(port);
        } else {
            ports.add(port);
        }
    }

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ports=" + ports +
                "} " + super.toString();
    }
}
