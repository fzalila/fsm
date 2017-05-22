/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.fsm.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.fsm.ide.contentassist.antlr.internal.InternalFSMParser;
import org.xtext.example.fsm.services.FSMGrammarAccess;

public class FSMParser extends AbstractContentAssistParser {

	@Inject
	private FSMGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFSMParser createParser() {
		InternalFSMParser result = new InternalFSMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFSMAccess().getGroup(), "rule__FSM__Group__0");
					put(grammarAccess.getFSMAccess().getGroup_3(), "rule__FSM__Group_3__0");
					put(grammarAccess.getFSMAccess().getGroup_3_3(), "rule__FSM__Group_3_3__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
					put(grammarAccess.getStateAccess().getGroup_5(), "rule__State__Group_5__0");
					put(grammarAccess.getStateAccess().getGroup_5_3(), "rule__State__Group_5_3__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_2(), "rule__Transition__Group_2__0");
					put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
					put(grammarAccess.getFSMAccess().getOwnedStateAssignment_3_2(), "rule__FSM__OwnedStateAssignment_3_2");
					put(grammarAccess.getFSMAccess().getOwnedStateAssignment_3_3_1(), "rule__FSM__OwnedStateAssignment_3_3_1");
					put(grammarAccess.getStateAccess().getInitialAssignment_0(), "rule__State__InitialAssignment_0");
					put(grammarAccess.getStateAccess().getFinalAssignment_1(), "rule__State__FinalAssignment_1");
					put(grammarAccess.getStateAccess().getNameAssignment_4_1(), "rule__State__NameAssignment_4_1");
					put(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_2(), "rule__State__OutgoingTransitionAssignment_5_2");
					put(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_3_1(), "rule__State__OutgoingTransitionAssignment_5_3_1");
					put(grammarAccess.getTransitionAccess().getInputAssignment_2_1(), "rule__Transition__InputAssignment_2_1");
					put(grammarAccess.getTransitionAccess().getOutputAssignment_3_1(), "rule__Transition__OutputAssignment_3_1");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_5(), "rule__Transition__TargetAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FSMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
