package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsDuplicate() {
        val nums = intArrayOf(1, 2, 3, 1)
        val output = true
        assertEquals(output, Solution().containsDuplicate(nums))
    }
}