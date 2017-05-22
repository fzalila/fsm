/*
 * generated by Xtext 2.11.0
 */
grammar InternalFSM;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.fsm.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.fsm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.fsm.services.FSMGrammarAccess;

}
@parser::members {
	private FSMGrammarAccess grammarAccess;

	public void setGrammarAccess(FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFSM
entryRuleFSM
:
{ before(grammarAccess.getFSMRule()); }
	 ruleFSM
{ after(grammarAccess.getFSMRule()); } 
	 EOF 
;

// Rule FSM
ruleFSM 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFSMAccess().getGroup()); }
		(rule__FSM__Group__0)
		{ after(grammarAccess.getFSMAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__0__Impl
	rule__FSM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getFSMAction_0()); }
	()
	{ after(grammarAccess.getFSMAccess().getFSMAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__1__Impl
	rule__FSM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getFSMKeyword_1()); }
	'FSM'
	{ after(grammarAccess.getFSMAccess().getFSMKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__2__Impl
	rule__FSM__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__3__Impl
	rule__FSM__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getGroup_3()); }
	(rule__FSM__Group_3__0)?
	{ after(grammarAccess.getFSMAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FSM__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3__0__Impl
	rule__FSM__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getOwnedStateKeyword_3_0()); }
	'ownedState'
	{ after(grammarAccess.getFSMAccess().getOwnedStateKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3__1__Impl
	rule__FSM__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_1()); }
	'{'
	{ after(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3__2__Impl
	rule__FSM__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getOwnedStateAssignment_3_2()); }
	(rule__FSM__OwnedStateAssignment_3_2)
	{ after(grammarAccess.getFSMAccess().getOwnedStateAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3__3__Impl
	rule__FSM__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getGroup_3_3()); }
	(rule__FSM__Group_3_3__0)*
	{ after(grammarAccess.getFSMAccess().getGroup_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_3_4()); }
	'}'
	{ after(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FSM__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3_3__0__Impl
	rule__FSM__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getCommaKeyword_3_3_0()); }
	','
	{ after(grammarAccess.getFSMAccess().getCommaKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FSM__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFSMAccess().getOwnedStateAssignment_3_3_1()); }
	(rule__FSM__OwnedStateAssignment_3_3_1)
	{ after(grammarAccess.getFSMAccess().getOwnedStateAssignment_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getInitialAssignment_0()); }
	(rule__State__InitialAssignment_0)?
	{ after(grammarAccess.getStateAccess().getInitialAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getFinalAssignment_1()); }
	(rule__State__FinalAssignment_1)?
	{ after(grammarAccess.getStateAccess().getFinalAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_2()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
	rule__State__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_4()); }
	(rule__State__Group_4__0)
	{ after(grammarAccess.getStateAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__5__Impl
	rule__State__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_5()); }
	(rule__State__Group_5__0)?
	{ after(grammarAccess.getStateAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__0__Impl
	rule__State__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameKeyword_4_0()); }
	'name'
	{ after(grammarAccess.getStateAccess().getNameKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_4_1()); }
	(rule__State__NameAssignment_4_1)
	{ after(grammarAccess.getStateAccess().getNameAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__0__Impl
	rule__State__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutgoingTransitionKeyword_5_0()); }
	'outgoingTransition'
	{ after(grammarAccess.getStateAccess().getOutgoingTransitionKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__1__Impl
	rule__State__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__2__Impl
	rule__State__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_2()); }
	(rule__State__OutgoingTransitionAssignment_5_2)
	{ after(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__3__Impl
	rule__State__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_5_3()); }
	(rule__State__Group_5_3__0)*
	{ after(grammarAccess.getStateAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5_3__0__Impl
	rule__State__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_3_1()); }
	(rule__State__OutgoingTransitionAssignment_5_3_1)
	{ after(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
	'Transition'
	{ after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_2()); }
	(rule__Transition__Group_2__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_3()); }
	(rule__Transition__Group_3__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTargetKeyword_4()); }
	'target'
	{ after(grammarAccess.getTransitionAccess().getTargetKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTargetAssignment_5()); }
	(rule__Transition__TargetAssignment_5)
	{ after(grammarAccess.getTransitionAccess().getTargetAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_2__0__Impl
	rule__Transition__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getInputKeyword_2_0()); }
	'input'
	{ after(grammarAccess.getTransitionAccess().getInputKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getInputAssignment_2_1()); }
	(rule__Transition__InputAssignment_2_1)
	{ after(grammarAccess.getTransitionAccess().getInputAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_3__0__Impl
	rule__Transition__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getOutputKeyword_3_0()); }
	'output'
	{ after(grammarAccess.getTransitionAccess().getOutputKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getOutputAssignment_3_1()); }
	(rule__Transition__OutputAssignment_3_1)
	{ after(grammarAccess.getTransitionAccess().getOutputAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FSM__OwnedStateAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_0()); }
		ruleState
		{ after(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FSM__OwnedStateAssignment_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_3_1_0()); }
		ruleState
		{ after(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__InitialAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
		(
			{ before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
			'initial'
			{ after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
		)
		{ after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__FinalAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getFinalFinalKeyword_1_0()); }
		(
			{ before(grammarAccess.getStateAccess().getFinalFinalKeyword_1_0()); }
			'final'
			{ after(grammarAccess.getStateAccess().getFinalFinalKeyword_1_0()); }
		)
		{ after(grammarAccess.getStateAccess().getFinalFinalKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutgoingTransitionAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0()); }
		ruleTransition
		{ after(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutgoingTransitionAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0()); }
		ruleTransition
		{ after(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__InputAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getInputSTRINGTerminalRuleCall_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTransitionAccess().getInputSTRINGTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__OutputAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getOutputSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTransitionAccess().getOutputSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TargetAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_5_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
