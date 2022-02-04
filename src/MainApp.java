import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args){

//    PC officeComputer = new PC("HP Pavilion", 512, 32, false);
//
//    officeComputer.setPowerSupply(true);
//
//    officeComputer.switchOn();
//        System.out.println(officeComputer.state);
//
//officeComputer.setVolumeLevel(90);
//        System.out.println(officeComputer.volumeUp());

        List<Computer> computers = new ArrayList<>();
        computers.add(new PC("PRO 1",500, 128, true));
        computers.add(new PC("PRO 2",500, 128, true));
        computers.add(new PC("PRO 3",256, 128, true));
        computers.add(new PC("PRO 4",500, 128, true));
        computers.add(new PC("BBB",500, 128, true));
        computers.add(new PC("AAA",256, 256, true));
        computers.add(new PC("PRO 3",500, 128, true));

//        long count = computers.stream()
//                .filter(i -> i.getRam() > 128)
//                .count();
//
//        System.out.println(count);

//        computers.stream()
//                .map(s -> s.getName())
////                .collect(Collectors.toList());
//                .forEach(System.out::println);
//
//        System.out.println(collect);

//        Optional<Computer> max = computers.stream()
//                .max(Comparator.comparingInt(Computer::getRam));
//
//        System.out.println(max.get());

//        List<Computer> collect = computers.stream()
//                .filter(computer -> computer.getHdd() < 500)
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

//        computers.stream()
//                .sorted(Comparator.comparing(Computer::getName).thenComparingInt(Computer::getHdd))
//                .forEach(System.out::println);

    }


}
