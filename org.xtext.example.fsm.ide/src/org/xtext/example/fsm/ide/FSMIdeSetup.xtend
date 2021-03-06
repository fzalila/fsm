/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.fsm.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.fsm.FSMRuntimeModule
import org.xtext.example.fsm.FSMStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class FSMIdeSetup extends FSMStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FSMRuntimeModule, new FSMIdeModule))
	}
	
}
