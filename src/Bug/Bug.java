package Bug;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    private String bugDescription;
    // private String UserEmail;
    private BugReporter bugReporter;
    private int priority;
    private boolean status = true;

    public String getBugDescription() {
        return this.bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Opis zbyt mały");
        } else {
            this.bugDescription = bugDescription;
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
        return this.priority;
    }

    public void setPriority(int priority) throws IllegalBugPriorityException {
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
//            System.out.println("Priorytet powinien być w przedziale 1 do 5");
            throw new IllegalBugPriorityException("Priorytet powinien być w przedziale 1 do 5");
        }

    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        notifyStatusChange();
    }

    public Bug(String bugDescription, BugReporter bugReporter, int priority, boolean status) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.priority = priority;
        this.status = status;
    }

//    public void getAllBugInfo() {
//        System.out.println("Info o błędzie: \nOpis: " + this.BugDescription + "\nEmail reportera: " + this.UserEmail + "\nPriorytet błędu: " + this.Priority + "\nStatus błedu: " + this.Status);
//    }

//    public void getReporterInfo() {
//        System.out.println("Osoba zgłaszająca błąd: " + this.UserEmail);
//    }

    public void getBugStatus() {
        if (this.status) {
            System.out.println("Status Buga: Otwarty");
        } else {
            System.out.println("Status Buga: Zamknięty");
        }

    }

    public void getBugPriority() {
        System.out.println("Prio błędu to: " + this.priority);
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status się zmienił");

    }

    @Override
    public String toString() {
        return "Bug{" +
                "BugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", Priority=" + priority +
                ", Status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priority == bug.priority && status == bug.status && Objects.equals(bugDescription, bug.bugDescription) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugReporter, priority, status);
    }


    @Override
    public int compareTo(Bug b) {
        Collator collator = Collator.getInstance((new Locale("pl", "PL"))); //Your locale here
        collator.setStrength(Collator.PRIMARY);
        int i = collator.compare(getBugDescription(), b.getBugDescription());
        return i;
//        return this.getBugDescription().compareTo(b.getBugDescription());
    }
}