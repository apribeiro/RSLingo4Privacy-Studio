/*
 * generated by Xtext
 */
package rslingo.rslil4privacy;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RSLIL4PrivacyStandaloneSetup extends RSLIL4PrivacyStandaloneSetupGenerated{

	public static void doSetup() {
		new RSLIL4PrivacyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

