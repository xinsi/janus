package de.mslab.matching;

import de.mslab.ciphers.LED128;
import de.mslab.ciphers.helpers.LEDHelper;
import de.mslab.rendering.DifferentialRenderer;
import de.mslab.rendering.LEDStateRenderer;
import de.mslab.rendering.MatchingDifferentialRenderer;

public class LED128MatchingTest extends AbstractMatcherTest { 
	
	public void setUp() {
		xmlPathname = "results/xml/LED128_41_48.xml";
		pdfPathname = "results/matching/LED128_41_48.pdf";
		cipher = new LED128();
		counter = new LEDHelper();
		
		super.setUp();
		
		matchingContext.matchingFromRound = 9;
		
		DifferentialRenderer differentialRenderer = new MatchingDifferentialRenderer();
		int cellSize = 10;
		differentialRenderer.setStateRenderer(new LEDStateRenderer(cellSize));
		renderer.setDifferentialRenderer(differentialRenderer);
	}
	
}
