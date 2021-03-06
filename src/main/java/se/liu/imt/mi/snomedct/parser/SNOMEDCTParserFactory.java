/**
 * 
 */
package se.liu.imt.mi.snomedct.parser;

import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.io.OWLParserFactory;
import org.semanticweb.owlapi.model.OWLOntologyManager;

/**
 * @author Daniel Karlsson, Linköping University, daniel.karlsson@liu.se
 *
 */
public class SNOMEDCTParserFactory implements OWLParserFactory {

	/* (non-Javadoc)
	 * @see org.semanticweb.owlapi.io.OWLParserFactory#createParser(org.semanticweb.owlapi.model.OWLOntologyManager)
	 */
	@Override
	public OWLParser createParser(OWLOntologyManager arg0) {
		return new SNOMEDCTOWLParser();
	}

}
