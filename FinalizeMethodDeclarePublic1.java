package javacodechecker;
import java.applet.Applet;

public class FinalizeMethodDeclarePublic1 extends Applet {
	// EMB-ISSUE: CodeIssueNames.FINALIZE_METHOD_DECLARE_PUBLIC/no-detect
	protected void finalize() throws Throwable {

	    try {

	        close();

	    } catch(Exception e) {

	    }

	    finally {

	        super.finalize();


	    }
	} 
}
