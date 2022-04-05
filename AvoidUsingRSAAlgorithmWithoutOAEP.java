package javacodechecker;

public class AvoidUsingRSAAlgorithmWithoutOAEP {

    public void me(){

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_RSA_ALGORITHM_WITHOUT_OAEP
        Cipher cipher = Cipher.getInstance("RSA/NONE/NoPadding");

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_RSA_ALGORITHM_WITHOUT_OAEP
        Cipher rsa = javax.crypto.Cipher.getInstance("RSA/NONE/NoPadding");

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_RSA_ALGORITHM_WITHOUT_OAEP/no-detect
        Cipher cip = Cipher.getInstance("RSA/ECB/OAEPWithMD5AndMGF1Padding");
    }
}