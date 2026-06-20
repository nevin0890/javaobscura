package exception;

public class ThrowsException {
    public static void main(String[] args) throws VotingException {
        int age  =17;
        System.out.println("voting eligibility");
        if (age>=18){
            System.out.println("Eligible to vote");

        }
        else {
          throw  new VotingException("Not Eligible");

        }
    }
}
