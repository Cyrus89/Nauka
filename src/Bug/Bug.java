package Bug;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    private String BugDescription;
   // private String UserEmail;
    private BugReporter bugReporter;
    private int Priority;
    private boolean Status = true;

    public String getBugDescription() {
        return this.BugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Opis zbyt mały");
        } else {
            this.BugDescription = bugDescription;
        }

    }

//    public String getUserEmail() {
//        return this.UserEmail;
//    }

//    public void setUserEmail(String userEmail) {
//        if (userEmail.contains("@")) {
//            this.UserEmail = userEmail;
//        } else {
//            System.out.println("Nieprawidłowy email");
//        }
//
//    }

    public int getPriority() {
        return this.Priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 5) {
            this.Priority = priority;
        } else {
            System.out.println("Priorytet powinien być w przedziale 1 do 5");
        }

    }

    public boolean isStatus() {
        return this.Status;
    }

    public void setStatus(boolean status) {
        this.Status = status;
        notifyStatusChange();
    }

    public Bug(String BugDescription, BugReporter bugReporter, int Priority, boolean Status) {
        this.BugDescription = BugDescription;
        this.bugReporter = bugReporter;
        this.Priority = Priority;
        this.Status = Status;
    }

//    public void getAllBugInfo() {
//        System.out.println("Info o błędzie: \nOpis: " + this.BugDescription + "\nEmail reportera: " + this.UserEmail + "\nPriorytet błędu: " + this.Priority + "\nStatus błedu: " + this.Status);
//    }

//    public void getReporterInfo() {
//        System.out.println("Osoba zgłaszająca błąd: " + this.UserEmail);
//    }

    public void getBugStatus() {
        if (this.Status) {
            System.out.println("Status Buga: Otwarty");
        } else {
            System.out.println("Status Buga: Zamknięty");
        }

    }

    public void getBugPriority() {
        System.out.println("Prio błędu to: " + this.Priority);
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void notifyStatusChange(){
        System.out.println("Status się zmienił");

    }

    @Override
    public String toString() {
        return "Bug{" +
                "BugDescription='" + BugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", Priority=" + Priority +
                ", Status=" + Status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return Priority == bug.Priority && Status == bug.Status && Objects.equals(BugDescription, bug.BugDescription) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BugDescription, bugReporter, Priority, Status);
    }




    @Override
    public int compareTo(Bug b) {
        return this.getBugDescription().compareTo(b.getBugDescription());
    }
}