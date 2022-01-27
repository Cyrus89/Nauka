package Bug;

import java.util.*;

public class DemoApp {
    public DemoApp() {
    }

    public static void main(String[] args) {
//        Bug bug1 = new Bug("Error 404", "abc@wp.pl", 1, true);
//        bug1.setPriority(6);
//        bug1.getAllBugInfo();
//    Bug bug2 = new Bug("Error 23", "zxy@op.pl", 3, false);
//        System.out.println(bug2);

//        BugReporter bugReporter = new BugReporter("abc@wp.pl","Tomek", "K.");
//        Bug bug = new Bug("Error 404",bugReporter,3, true);
//
//        System.out.println(bug);
//
//        bug.setStatus(false);
//        System.out.println(bug);


        BugReporter bugReporter1 = new BugReporter("1abc@wp.pl", "Tomek", "Kra");
        BugReporter bugReporter2 = new BugReporter("2abcd@wp.pl", "Aga", "Kra");
        BugReporter bugReporter3 = new BugReporter("3abce@wp.pl", "Aga", "Pol");
        BugReporter bugReporter4 = new BugReporter("4abcf@wp.pl", "Jacol", "Ryj");
        BugReporter bugReporter5 = new BugReporter("5abcg@wp.pl", "Marcelo", "Silva");

        Bug bug1 = new Bug("pierwszy", bugReporter1 ,3, true);
        Bug bug2 = new Bug("drugi", bugReporter2 ,1, true);
        Bug bug3 = new Bug("trzeci", bugReporter3 ,2, true);
        Bug bug4 = new Bug("czwarty", bugReporter4 ,5, true);
        Bug bug5 = new Bug("piaty", bugReporter5 ,3, true);
        Bug bug6 = new Bug("piaty", bugReporter5 ,3, true);

        List<Bug> bugs = new ArrayList<>();
        bugs.add(bug1);
        bugs.add(bug2);
        bugs.add(bug3);
        bugs.add(bug4);
        bugs.add(bug5);
        bugs.add(bug6);

//        for(Bug bugsList : bugs){
//            System.out.println(bugsList);
//        }

        Set<Bug> uniqueBugs = new HashSet<>(bugs);
//
//        for (Bug uniqueBugsList : uniqueBugs){
//            System.out.println(uniqueBugsList);
//        }

        Set<Bug> uniqueTreeBugs = new TreeSet<>(uniqueBugs);

        for (Bug uniqueTreeBugsList : uniqueTreeBugs){
            System.out.println(uniqueTreeBugsList.getBugDescription());
        }

    }


}