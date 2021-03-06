/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.fsm.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.fsm.ui.internal.FsmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FSMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FsmActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FsmActivator.getInstance().getInjector(FsmActivator.ORG_XTEXT_EXAMPLE_FSM_FSM);
	}
	
}
