package org.eclipse.xtext.example.fowlerdsl.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.xtext.example.fowlerdsl.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String HelloWorldFile_Label;
	public static String HelloWorldFile_Description;
	public static String HelloWorldProject_Label;
	public static String HelloWorldProject_Description;
	public static String SimpleStatemachineExample_Label;
	public static String SimpleStatemachineExample_Description;
	public static String SimpleStatemachineExampleWithFile_Label;
	public static String SimpleStatemachineExampleWithFile_Description;
	public static String MrsGrantsSecretCompartments_Label;
	public static String MrsGrantsSecretCompartments_Description;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
