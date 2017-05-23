/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.fsm.tests

import com.google.inject.Inject
import fsm.FSM
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.EPackage
import fsm.FsmPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import java.nio.charset.StandardCharsets

@RunWith(XtextRunner)
@InjectWith(FSMInjectorProvider)
class FSMParsingTest {
	@Inject
	ParseHelper<FSM> parseHelper
	
	@Inject extension ValidationTestHelper h
	
	@Test
	def void loadModel() {
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, FsmPackage::eINSTANCE)
		val result = parseHelper.parse('''
			FSM{
				ownedState
				{ 
					initial final State { name s1  outgoingTransition {Transition {
						input "did" output "aa" target s2     
					}   
						
					}},
					initial final State { name s2 }       
				}      
			}           
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		println(result.validate)
		println('''
		«FOR s : result.ownedState»
			«s.name»: 
			«FOR t : s.outgoingTransition»
				«t.target.name»
			«ENDFOR»
			«s.name»: «s.incomingTransition»
		«ENDFOR»
		''')
		
		val RS2 = new ResourceSetImpl
		val r2 = RS2.createResource(URI.createURI("dummy.xmi"))
		r2.contents.add(result)
		val baos = new ByteArrayOutputStream
		r2.save(baos, null)
		println(new String(baos.toByteArray, StandardCharsets.UTF_8))
	}
}
