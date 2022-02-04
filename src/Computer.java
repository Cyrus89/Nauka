import java.util.Objects;

abstract public class Computer {

    protected String name;
    protected int hdd;
    protected int ram;
    protected boolean state;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    protected int volumeLevel;

    public Computer(String name, int hdd, int ram) {
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        state = true;
    }

    public void switchOff(){
        state = false;
    }

    public abstract int volumeUp();

    public abstract int volumeDown();

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return hdd == computer.hdd && ram == computer.ram && state == computer.state && volumeLevel == computer.volumeLevel && Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hdd, ram, state, volumeLevel);
    }
}
