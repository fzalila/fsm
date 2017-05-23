package org.xtext.example.fsm;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.SyntheticLinkingSupport;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;

import fsm.FSM;
import fsm.FsmPackage;
import fsm.State;
import fsm.Transition;

public class FSMDerivedStateComputer implements IDerivedStateComputer {

	@Inject
	SyntheticLinkingSupport sls;

	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!resource.getContents().isEmpty() && preLinkingPhase) {
			FSM fsm = (FSM) resource.getContents().get(0);
			for (State s : fsm.getOwnedState()) {
				System.out.println("start state " + s);
				for (Transition t : s.getOutgoingTransition()) {
					List<INode> nodes = NodeModelUtils.findNodesForFeature(t, FsmPackage.Literals.TRANSITION__TARGET);
					if (!nodes.isEmpty()) {
						String text = nodes.get(0).getText().trim();
						System.out.println("text0 " + text);
						for (State s_cible : fsm.getOwnedState()) {
							if (s_cible.getName().equals(text)) {
								System.out.println("s_cible " + s_cible);
								s_cible.getIncomingTransition().add(t);
								System.out.println("s_cible.getIncomingTransition() " + s_cible.getIncomingTransition());
							}
						}
						}
					}
				System.out.println("finish state " + s);
				}
			}
		}
	

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {

	}

}
