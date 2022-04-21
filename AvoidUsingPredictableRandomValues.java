package javacodechecker;

import java.security.SecureRandom;
import java.util.Random;

public class AvoidUsingPredictableRandomValues {
    String randommethod(){
        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES
        SecureRandom secureRandom = new SecureRandom();
        return Long.toHexString(r.nextLong());

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES/no-detect
        Random r = new Random();
        
    }
}
