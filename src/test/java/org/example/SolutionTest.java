package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestConsecutiveTest() {
        Solution solution = new Solution();
        assertEquals(4, solution.longestConsecutive(new int[]{100,4,200,1,3,2}));
        assertEquals(9, solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

}