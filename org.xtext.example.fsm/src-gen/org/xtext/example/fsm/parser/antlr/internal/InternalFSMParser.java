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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'{'", "'ownedState'", "','", "'}'", "'initial'", "'final'", "'State'", "'name'", "'outgoingTransition'", "'Transition'", "'input'", "'output'", "'target'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFSM.g"; }



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




    // $ANTLR start "entryRuleFSM"
    // InternalFSM.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalFSM.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalFSM.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalFSM.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' otherlv_2= '{' (otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_ownedState_5_0 = null;

        EObject lv_ownedState_7_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:77:2: ( ( () otherlv_1= 'FSM' otherlv_2= '{' (otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalFSM.g:78:2: ( () otherlv_1= 'FSM' otherlv_2= '{' (otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalFSM.g:78:2: ( () otherlv_1= 'FSM' otherlv_2= '{' (otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalFSM.g:79:3: () otherlv_1= 'FSM' otherlv_2= '{' (otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalFSM.g:79:3: ()
            // InternalFSM.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFSM.g:94:3: (otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFSM.g:95:4: otherlv_3= 'ownedState' otherlv_4= '{' ( (lv_ownedState_5_0= ruleState ) ) (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getOwnedStateKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalFSM.g:103:4: ( (lv_ownedState_5_0= ruleState ) )
                    // InternalFSM.g:104:5: (lv_ownedState_5_0= ruleState )
                    {
                    // InternalFSM.g:104:5: (lv_ownedState_5_0= ruleState )
                    // InternalFSM.g:105:6: lv_ownedState_5_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ownedState_5_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"ownedState",
                    							lv_ownedState_5_0,
                    							"org.xtext.example.fsm.FSM.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFSM.g:122:4: (otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFSM.g:123:5: otherlv_6= ',' ( (lv_ownedState_7_0= ruleState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFSMAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalFSM.g:127:5: ( (lv_ownedState_7_0= ruleState ) )
                    	    // InternalFSM.g:128:6: (lv_ownedState_7_0= ruleState )
                    	    {
                    	    // InternalFSM.g:128:6: (lv_ownedState_7_0= ruleState )
                    	    // InternalFSM.g:129:7: lv_ownedState_7_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ownedState_7_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFSMRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedState",
                    	    								lv_ownedState_7_0,
                    	    								"org.xtext.example.fsm.FSM.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalFSM.g:160:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFSM.g:160:46: (iv_ruleState= ruleState EOF )
            // InternalFSM.g:161:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFSM.g:167:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'State' otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token lv_final_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_outgoingTransition_8_0 = null;

        EObject lv_outgoingTransition_10_0 = null;



        	enterRule();

        try {
            // InternalFSM.g:173:2: ( ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'State' otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalFSM.g:174:2: ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'State' otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalFSM.g:174:2: ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'State' otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalFSM.g:175:3: ( (lv_initial_0_0= 'initial' ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'State' otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalFSM.g:175:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFSM.g:176:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalFSM.g:176:4: (lv_initial_0_0= 'initial' )
                    // InternalFSM.g:177:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalFSM.g:189:3: ( (lv_final_1_0= 'final' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFSM.g:190:4: (lv_final_1_0= 'final' )
                    {
                    // InternalFSM.g:190:4: (lv_final_1_0= 'final' )
                    // InternalFSM.g:191:5: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,17,FOLLOW_9); 

                    					newLeafNode(lv_final_1_0, grammarAccess.getStateAccess().getFinalFinalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFSM.g:211:3: (otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) )
            // InternalFSM.g:212:4: otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getNameKeyword_4_0());
            			
            // InternalFSM.g:216:4: ( (lv_name_5_0= RULE_ID ) )
            // InternalFSM.g:217:5: (lv_name_5_0= RULE_ID )
            {
            // InternalFSM.g:217:5: (lv_name_5_0= RULE_ID )
            // InternalFSM.g:218:6: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            						newLeafNode(lv_name_5_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStateRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_5_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            }

            // InternalFSM.g:235:3: (otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFSM.g:236:4: otherlv_6= 'outgoingTransition' otherlv_7= '{' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getOutgoingTransitionKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalFSM.g:244:4: ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    // InternalFSM.g:245:5: (lv_outgoingTransition_8_0= ruleTransition )
                    {
                    // InternalFSM.g:245:5: (lv_outgoingTransition_8_0= ruleTransition )
                    // InternalFSM.g:246:6: lv_outgoingTransition_8_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_outgoingTransition_8_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"outgoingTransition",
                    							lv_outgoingTransition_8_0,
                    							"org.xtext.example.fsm.FSM.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFSM.g:263:4: (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalFSM.g:264:5: otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalFSM.g:268:5: ( (lv_outgoingTransition_10_0= ruleTransition ) )
                    	    // InternalFSM.g:269:6: (lv_outgoingTransition_10_0= ruleTransition )
                    	    {
                    	    // InternalFSM.g:269:6: (lv_outgoingTransition_10_0= ruleTransition )
                    	    // InternalFSM.g:270:7: lv_outgoingTransition_10_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_outgoingTransition_10_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outgoingTransition",
                    	    								lv_outgoingTransition_10_0,
                    	    								"org.xtext.example.fsm.FSM.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFSM.g:301:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFSM.g:301:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFSM.g:302:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFSM.g:308:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) ) )? (otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_input_3_0=null;
        Token otherlv_4=null;
        Token lv_output_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalFSM.g:314:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) ) )? (otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalFSM.g:315:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) ) )? (otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalFSM.g:315:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) ) )? (otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalFSM.g:316:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) ) )? (otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFSM.g:324:3: (otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFSM.g:325:4: otherlv_2= 'input' ( (lv_input_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getInputKeyword_2_0());
                    			
                    // InternalFSM.g:329:4: ( (lv_input_3_0= RULE_STRING ) )
                    // InternalFSM.g:330:5: (lv_input_3_0= RULE_STRING )
                    {
                    // InternalFSM.g:330:5: (lv_input_3_0= RULE_STRING )
                    // InternalFSM.g:331:6: lv_input_3_0= RULE_STRING
                    {
                    lv_input_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_input_3_0, grammarAccess.getTransitionAccess().getInputSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"input",
                    							lv_input_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFSM.g:348:3: (otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFSM.g:349:4: otherlv_4= 'output' ( (lv_output_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getOutputKeyword_3_0());
                    			
                    // InternalFSM.g:353:4: ( (lv_output_5_0= RULE_STRING ) )
                    // InternalFSM.g:354:5: (lv_output_5_0= RULE_STRING )
                    {
                    // InternalFSM.g:354:5: (lv_output_5_0= RULE_STRING )
                    // InternalFSM.g:355:6: lv_output_5_0= RULE_STRING
                    {
                    lv_output_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_output_5_0, grammarAccess.getTransitionAccess().getOutputSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"output",
                    							lv_output_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_4());
            		
            // InternalFSM.g:376:3: ( (otherlv_7= RULE_ID ) )
            // InternalFSM.g:377:4: (otherlv_7= RULE_ID )
            {
            // InternalFSM.g:377:4: (otherlv_7= RULE_ID )
            // InternalFSM.g:378:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetStateCrossReference_5_0());
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}