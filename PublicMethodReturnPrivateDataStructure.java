package javacodechecker;

public class PublicMethodReturnPrivateDataStructure {
	private static final String[] flower = {"rose,lotus"};
	private String[] color = {"black","green"};
	private int[] arr= {1,2,3};
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE
	public String[] getColor() {
	return color;
	}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE
		public String[] getColorss() {	
		return this.color;
		}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE/no-detect
	public String[] getColors() {
	return Arrays.copyOf(color);
	}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE
	public int[] getArr() {
		return arr;
	}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE
		public int[] getArrs() {
			return this.arr;
		}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE/no-detect
	public int[] getArry() {
		return Arrays.copyOf(arr);
	}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE/no-detect
	public String[] getFlower() {
		return flower;
	}
}

