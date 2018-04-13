package com.javafortesters.Hoofdstuk007;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ConditionalOperators {
    @Test
    public void conditionalOperatorsExplored(){
        assertTrue( true && true);
        assertTrue( true || false);
        assertTrue( false || true);

        assertFalse( false || false);
        assertFalse( false && true);
    }
}
