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

	private static final int THREE_BUGS_RESOLVED = 3;

	public Object[] illegalNbOfBugs() {
		return $(-10, -1);
	}

	/**
	 * Test que prueba el constructor de la clase {@link PhoenixTeam}
	 */
	@Test
	public void contructorMustSetBugResolve() {
		PhoenixTeam phoenixTeam = new PhoenixTeam(THREE_BUGS_RESOLVED);

		Assert.assertEquals(THREE_BUGS_RESOLVED + " se han pasado al constructor pero solo "
				+ phoenixTeam.getBugsResolved() + " fuerons devueltos", THREE_BUGS_RESOLVED,
				phoenixTeam.getBugsResolved());
	}

	/**
	 * Test que prueba valores invalidos del constructor
	 * @param illegalNbOfBugs
	 */
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illegalNbOfBugs")
	public void constructorShouldThrowExceptionForIllegalBugsNb(int illegalNbOfBugs) {
		new PhoenixTeam(illegalNbOfBugs);
	}
}
