package org.xtext.example.fsm;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;
import fsm.Transition;
import fsm.FSM;
import fsm.State;

public class FSMLinker extends LazyLinker {
	@Override
	protected EObject createProxy(EObject obj, INode node, EReference eRef) {
//		System.out.println("obj "+(obj));
//		System.out.println("target "+((Transition)obj).getTarget());
//		System.out.println("econ "+((Transition)obj).eContainer());
//		System.out.println("node "+node.getText());
		System.out.println("ref "+eRef);
			
			State s = (State) ((Transition)obj).eContainer();
			FSM fsm = (FSM) s.eContainer();
			for (State  state : fsm.getOwnedState())
				if(state.getName().equals(node.getText())){
					System.out.println("state "+state);
					return state;
				}

		return super.createProxy(obj, node, eRef);
	}
}
