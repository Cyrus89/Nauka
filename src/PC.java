public class PC extends Computer {


    private boolean powerSupply;

    public PC(String name, int hdd, int ram, boolean powerSupply) {
        super(name, hdd, ram);
        powerSupply = false;
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


}
