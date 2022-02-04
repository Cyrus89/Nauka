import java.util.Objects;

public class PC extends Computer {


    private boolean powerSupply;

    public PC(String name, int hdd, int ram, boolean powerSupply) {
        super(name, hdd, ram);
//        powerSupply = false;
    }




    @Override
    public void switchOn() {
        if (powerSupply) {
            super.switchOn();
            System.out.println("PC włączony");
        }
        else
//            super.switchOff();
            System.out.println("PC nie podłączony do prądu");

    }

    @Override
    public int volumeUp() {
        volumeLevel +=2;
        if (volumeLevel >= 0 && volumeLevel <= 100){
            return volumeLevel;
        }
        else {
            return  100;
        }
           }

    @Override
    public int volumeDown() {
        volumeLevel -=2;
        if (volumeLevel > 0 ){
            return volumeLevel;
        }
        else {
            return 0;
        }
    }


    public void setPowerSupply(boolean newPowerSupply) {

        powerSupply = newPowerSupply;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                ", powerSupply=" + powerSupply +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PC pc = (PC) o;
        return powerSupply == pc.powerSupply;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerSupply);
    }
}
