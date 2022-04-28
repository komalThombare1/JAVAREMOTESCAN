package javacodechecker;

import java.security.SecureRandom;
import java.util.Random;

public class AvoidUsingPredictableRandomValues {
    String randommethod(){
        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES
         Random r = new Random();
        return Long.toHexString(r.nextLong());
         Random r1 = new Random();

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES/no-detect
       class SecureRandomGenerator{
           
        static final SecureRandom secureRandom = new SecureRandom();
           public int generateSecureKey()
           {
               return secureRandom.nextInt();
           }
    }
}
