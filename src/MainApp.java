public class MainApp {
    public static void main(String[] args){

    PC officeComputer = new PC("HP Pavilion", 512, 32, false);

    officeComputer.setPowerSupply(true);

    officeComputer.switchOn();
        System.out.println(officeComputer.state);

officeComputer.setVolumeLevel(90);
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());

//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());

    }


}
