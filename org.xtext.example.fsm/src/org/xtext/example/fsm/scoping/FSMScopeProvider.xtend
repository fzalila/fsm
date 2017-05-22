/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.fsm.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import fsm.Transition
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.ArrayList
import fsm.State
import fsm.FSM
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.resource.EObjectDescription

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class FSMScopeProvider extends AbstractFSMScopeProvider {

	override getScope(EObject object, EReference ref) {
		println("xxx ")
		if (object instanceof Transition) {
			println("transition ")
			scope_Transition_target(object as Transition, ref)
		}
	}

	def scope_Transition_target(Transition transition, EReference reference) {
		println("ccccc ")
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var State s = transition.eContainer as State
		var FSM fsm = s.eContainer as FSM
		for (state : fsm.ownedState) {
			res.add(EObjectDescription.create(state.name, state))
		}
		println("res "+res)
		return new SimpleScope(IScope.NULLSCOPE, res)
	}
}