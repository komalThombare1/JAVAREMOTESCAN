package javacodechecker;

public class ComparisionOfObjectReferencesInsteadOfObjectContents {
	String str1 = new String("Hello");
	String str2 = new String("Hello");
	public void compare() {
		// EMB-ISSUE: CodeIssueNames.COMPARISION_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS
		if (str1 == str2) {
			logger.info("str1 == str2");
		}
		
		String name = "manasi";
		String myname = "mansi";
		compareName(name, myname);
	}
	
	
	public void compareName(String name,String myname) {
		// EMB-ISSUE: CodeIssueNames.COMPARISION_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS
		if(name == myname) {
			logger.info("name == myname");		
			}
	}
	
	public void compareInMethods() {
		String strs1 = new String("Hey");
		String strs2 = new String("Hey");
		// EMB-ISSUE: CodeIssueNames.COMPARISION_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS
		if(strs1 == strs2) {
			logger.info("strs1 == strs2");		
			}
	}
	
	public void compareInsideMethods() {
		String st = new String("Hey");
		String st1 = new String("Hey");
		// EMB-ISSUE: CodeIssueNames.COMPARISION_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS
		if(st1 == st || st1 != st) {
			logger.info("sts1 == sts");		
			}
	}
	

	public void compares() {
		// EMB-ISSUE: CodeIssueNames.COMPARISION_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS/no-detect
		if (str1.equals(str2)) {
			logger.info("str1 equals str2");
		}
	}

}
