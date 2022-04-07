package javacodechecker;

        import java.security.SecureRandom;
        import java.util.Random;

public class AvoidUsingPredictableRandomValuesComplientCode {
    //uses Secure random insted of random
    //Declare secure random outside the method
    static final SecureRandom secureRandom = new SecureRandom();
    String randommethod(){

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES/no-detect
        int randomValue = secureRandom.nextInt(); 

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES/no-detect
        SecureRandom secureRandom = new SecureRandom();
    }
}
