package com.mario.tdd;

import static junitparams.JUnitParamsRunner.$;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * Test unitario de la clase {@link PhoenixTeam}
 */
@RunWith(JUnitParamsRunner.class)
public class PhoenixTeamTest {

	public Object[] illegalNbOfBugs() {
		return $(-10, -1);
	}

	public Object[] nbOfBugsResolved() {
		return $(0, 2, 40, 5000);
	}

	/**
	 * Test que prueba el constructor de la clase {@link PhoenixTeam} con
	 * valores validos
	 */
	@Test
	@Parameters(method = "nbOfBugsResolved")
	public void contructorMustSetBugsResolved(int nbOfBugsResolved) {
		PhoenixTeam phoenixTeam = new PhoenixTeam(nbOfBugsResolved);

		Assert.assertEquals(nbOfBugsResolved + " se han pasado al constructor pero solo "
				+ phoenixTeam.getBugsResolved() + " fuerons devueltos", nbOfBugsResolved,
				phoenixTeam.getBugsResolved());
	}

	/**
	 * Test que prueba valores invalidos del constructor
	 * 
	 * @param illegalNbOfBugs
	 */
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illegalNbOfBugs")
	public void constructorShouldThrowExceptionForIllegalBugsNb(int illegalNbOfBugs) {
		new PhoenixTeam(illegalNbOfBugs);
	}
}
