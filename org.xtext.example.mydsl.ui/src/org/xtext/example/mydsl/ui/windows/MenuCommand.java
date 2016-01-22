package org.xtext.example.mydsl.ui.windows;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

public interface MenuCommand {

	/**
	 * Executes the associated command using the project
	 * and/or file passed as arguments.
	 * 
	 * @param project the source project
	 * @param file the source file used for the generation
	 */
	public void execute(IProject project, IFile file);
	
}
