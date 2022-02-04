package Bug;

public class IllegalBugPriorityException extends RuntimeException{

    public IllegalBugPriorityException() {
    }

    public IllegalBugPriorityException(String message) {
        super(message);
    }
}
