/*
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractOpenCypherValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage.eINSTANCE);
		return result;
	}
	
}
