/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.fsm.serializer;

import com.google.inject.Inject;
import fsm.FSM;
import fsm.FsmPackage;
import fsm.State;
import fsm.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.fsm.services.FSMGrammarAccess;

@SuppressWarnings("all")
public class FSMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FSMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FsmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FsmPackage.FSM:
				sequence_FSM(context, (FSM) semanticObject); 
				return; 
			case FsmPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case FsmPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FSM returns FSM
	 *
	 * Constraint:
	 *     (ownedState+=State ownedState+=State*)?
	 */
	protected void sequence_FSM(ISerializationContext context, FSM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (initial?='initial' final?='final' name=ID? (outgoingTransition+=Transition outgoingTransition+=Transition*)?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (input=STRING? output=STRING? target=[State|ID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
