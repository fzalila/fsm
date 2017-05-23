package org.geneauto.xtext.toxmi.popup.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.mapping.ModelStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.xtext.example.fsm.ui.internal.FsmActivator;

import com.google.inject.Injector;

public class XTextToXmiAction implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;
	
	/**
	 * Constructor for Action1.
	 */
	public XTextToXmiAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IFile file = getFile();

	    
		Injector injector = FsmActivator.getInstance().getInjector("org.xtext.example.fsm.FSM");
		XtextResourceSetProvider provider = injector.getInstance(XtextResourceSetProvider.class);
		ResourceSet resourceSet = provider.get(file.getProject()); 

		URI xtextURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		XtextResource xtextResource = (XtextResource) resourceSet.getResource(xtextURI, true);;

	    if (xtextResource != null){
		    Map<String,Boolean> options = new HashMap<String,Boolean>();
		    options.put(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		    try {
				xtextResource.load(options);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    Resource xmiResource = new XMIResourceFactoryImpl().createResource(xtextURI.trimFileExtension().appendFileExtension("xmi"));
		    xmiResource.getContents().add(xtextResource.getContents().get(0));

		    EcoreUtil.resolveAll(resourceSet);
		    try {
				xmiResource.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }else{
	    	ModelStatus sts = new ModelStatus(IStatus.ERROR, "org.eclipse.xtext.toXmi", "http://fsm", "Impossible to load the selected file for xmi conversion.\n" +
	    			"Maybe this file is not an XText instance ? Status");
	    	ErrorDialog.openError(shell, "Error", "Impossible to load the selected file for xmi conversion.\n" +
	    			"Maybe this file is not an XText instance ?", sts);
	    }
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
	
	private IFile getFile() {  
	    return (IFile)  
	        ((IStructuredSelection)selection)  
	            .getFirstElement();  
	 }
	protected static XtextResource getFiacreXtextResource(IFile file) {
		Injector injector = FsmActivator.getInstance().getInjector("org.xtext.example.fsm.FSM");
		XtextResourceSetProvider provider = injector.getInstance(XtextResourceSetProvider.class);
		ResourceSet resourceSet = provider.get(file.getProject()); 

		URI xtextURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		return (XtextResource) resourceSet.getResource(xtextURI, true);

	}

}
