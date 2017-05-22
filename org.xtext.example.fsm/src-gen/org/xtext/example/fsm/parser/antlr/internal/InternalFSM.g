/*
 * generated by Xtext 2.11.0
 */
grammar InternalFSM;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.fsm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.fsm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.fsm.services.FSMGrammarAccess;

}

@parser::members {

 	private FSMGrammarAccess grammarAccess;

    public InternalFSMParser(TokenStream input, FSMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FSM";
   	}

   	@Override
   	protected FSMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFSM
entryRuleFSM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFSMRule()); }
	iv_ruleFSM=ruleFSM
	{ $current=$iv_ruleFSM.current; }
	EOF;

// Rule FSM
ruleFSM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFSMAccess().getFSMAction_0(),
					$current);
			}
		)
		otherlv_1='FSM'
		{
			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='ownedState'
			{
				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getOwnedStateKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_0());
					}
					lv_ownedState_5_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFSMRule());
						}
						add(
							$current,
							"ownedState",
							lv_ownedState_5_0,
							"org.xtext.example.fsm.FSM.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getFSMAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_3_1_0());
						}
						lv_ownedState_7_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFSMRule());
							}
							add(
								$current,
								"ownedState",
								lv_ownedState_7_0,
								"org.xtext.example.fsm.FSM.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_initial_0_0='initial'
				{
					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed($current, "initial", true, "initial");
				}
			)
		)
		(
			(
				lv_final_1_0='final'
				{
					newLeafNode(lv_final_1_0, grammarAccess.getStateAccess().getFinalFinalKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed($current, "final", true, "final");
				}
			)
		)
		otherlv_2='State'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='name'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getNameKeyword_4_0());
			}
			(
				(
					lv_name_5_0=RULE_ID
					{
						newLeafNode(lv_name_5_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_6='outgoingTransition'
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getOutgoingTransitionKeyword_5_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0());
					}
					lv_outgoingTransition_8_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"outgoingTransition",
							lv_outgoingTransition_8_0,
							"org.xtext.example.fsm.FSM.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0());
						}
						lv_outgoingTransition_10_0=ruleTransition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStateRule());
							}
							add(
								$current,
								"outgoingTransition",
								lv_outgoingTransition_10_0,
								"org.xtext.example.fsm.FSM.Transition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='input'
			{
				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getInputKeyword_2_0());
			}
			(
				(
					lv_input_3_0=RULE_STRING
					{
						newLeafNode(lv_input_3_0, grammarAccess.getTransitionAccess().getInputSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed(
							$current,
							"input",
							lv_input_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_4='output'
			{
				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getOutputKeyword_3_0());
			}
			(
				(
					lv_output_5_0=RULE_STRING
					{
						newLeafNode(lv_output_5_0, grammarAccess.getTransitionAccess().getOutputSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
						setWithLastConsumed(
							$current,
							"output",
							lv_output_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_6='target'
		{
			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetStateCrossReference_5_0());
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
