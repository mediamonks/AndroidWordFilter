package com.mediamonks.wordfilter

import org.junit.Assert.*
import org.junit.Test

class LanguageCheckerImplTest {

    private val checker = LanguageCheckerImpl()

    @Test
    fun `Test that bad language is detected`() {
        val input = "He is an asshole"
        assertTrue(checker.containsBadLanguage(input))
    }

    @Test
    fun `Test that input without bad language checks out ok`() {
        val input = "This is a perfectly safe message"
        assertFalse(checker.containsBadLanguage(input))
    }

    @Test
    fun `Test that input is checked by whole words`() {
        val input = "Who is that?"
        assertFalse(checker.containsBadLanguage(input))
    }

    @Test
    fun `Test that input is checked case insensitively`() {
        val input = "Who is that AhOle!"
        assertTrue(checker.containsBadLanguage(input))
    }
}
