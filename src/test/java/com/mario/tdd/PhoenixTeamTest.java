package com.mario.tdd;

import org.junit.Assert;
import org.junit.Test;

import com.mario.tdd.PhoenixTeam;

/**
 * Test unitario de la clase {@link PhoenixTeam}
 */
public class PhoenixTeamTest {

	private static final int THREE_BUGS_RESOLVED = 3;

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
}
