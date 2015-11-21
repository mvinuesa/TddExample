package com.mario.tdd;

import org.junit.Assert;
import org.junit.Test;

import com.mario.tdd.PhoenixTeam;

/**
 * Test unitario de la clase {@link PhoenixTeam}
 */
public class PhoenixTeamTest 
{

	/**
	 * Test que prueba el constructor de la clase {@link PhoenixTeam}
	 */
	@Test
    public void contructorMustSetBugResolve()
    {
        PhoenixTeam phoenixTeam = new PhoenixTeam(3);
        
        Assert.assertEquals(3, phoenixTeam.getBugsResolved());
    }
}
