package com.mario.tdd;

import org.junit.Assert;
import org.junit.Test;

import com.mario.tdd.PhoenixTeam;

/**
 * Unit test for simple App.
 */
public class PhoenixTeamTest 
{
    /**
     * Rigourous Test :-)
     *
     */
	@Test
    public void contructorMustSetBugResolve()
    {
        PhoenixTeam phoenixTeam = new PhoenixTeam(3);
        
        Assert.assertEquals(3, phoenixTeam.getBugResolved());
    }
}
