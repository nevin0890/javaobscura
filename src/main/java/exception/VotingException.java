package exception;

public class VotingException extends Exception {
    public VotingException(String NotEligible) {
        super(NotEligible);
    }
}
