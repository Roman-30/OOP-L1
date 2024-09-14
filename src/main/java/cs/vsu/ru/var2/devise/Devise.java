package cs.vsu.ru.var2.devise;

import java.time.LocalDateTime;

public class Devise {
    private String name;
    private LocalDateTime createData;
    private Integer RAM;
    private Integer memory;


    public Devise(String name, LocalDateTime createData, Integer RAM, Integer memory) {
        this.name = name;
        this.createData = createData;
        this.RAM = RAM;
        this.memory = memory;
    }

    public Devise() {
    }

    public String reboot() {
        return "Устройство было перезагружено!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateData() {
        return createData;
    }

    public void setCreateData(LocalDateTime createData) {
        this.createData = createData;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Devise{" +
                "name='" + name + '\'' +
                ", createData=" + createData +
                ", RAM=" + RAM +
                ", memory=" + memory +
                '}';
    }
}
