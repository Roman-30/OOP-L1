package cs.vsu.ru.var1;

import java.time.LocalDateTime;

public class Devise {
    private String name;
    private LocalDateTime createData;
    private Integer RAM;
    private Integer memory;

    private DeviseType type;

    public Devise(String name, LocalDateTime createData, Integer RAM, Integer memory, DeviseType type) {
        this.name = name;
        this.createData = createData;
        this.RAM = RAM;
        this.memory = memory;
        this.type = type;
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

    public DeviseType getType() {
        return type;
    }

    public void setType(DeviseType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Devise{" +
                "name='" + name + '\'' +
                ", createData=" + createData +
                ", RAM=" + RAM +
                ", memory=" + memory +
                ", type=" + type +
                '}';
    }

    public enum DeviseType {
        PHONE,
        COMPUTE
    }
 }
