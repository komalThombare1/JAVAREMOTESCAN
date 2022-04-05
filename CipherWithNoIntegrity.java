package javacodechecker;

public class CipherWithNoIntegrity {
	public void md () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY
    Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
	c.init(Cipher.ENCRYPT_MODE, k, iv);
	byte[] cipherText = c.doFinal(plainText);
	}
	public void md1 () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY
    Cipher c = Cipher.getInstance("AES/OFB/PKCS5Padding");
	c.init(Cipher.ENCRYPT_MODE, k, iv);
	byte[] cipherText = c.doFinal(plainText);
	}
	public void md2 () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY
    Cipher c = Cipher.getInstance("DESede/ECB/PKCS5Padding");
	c.init(Cipher.ENCRYPT_MODE, k, iv);
	byte[] cipherText = c.doFinal(plainText);
	}
	public void md3 () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY
    Cipher c = Cipher.getInstance("DESede/CTR/PKCS5Padding");
	c.init(Cipher.ENCRYPT_MODE, k, iv);
	byte[] cipherText = c.doFinal(plainText);
	}
	public void md4 () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY/no-detect
		Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
		c.init(Cipher.ENCRYPT_MODE, k, iv);
		byte[] cipherText = c.doFinal(plainText);
		}
	public void md5 () {
		// EMB-ISSUE: CodeIssueNames.CIPHER_WITH_NO_INTEGRITY/no-detect
    Cipher c = Cipher.getInstance("DESede/GCM/PKCS5Padding");
	c.init(Cipher.ENCRYPT_MODE, k, iv);
	byte[] cipherText = c.doFinal(plainText);
	}
}
