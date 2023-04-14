package com.mediamonks.wordfilter

interface LanguageChecker {
    fun containsBadLanguage(input: String): Boolean
}

class LanguageCheckerImpl : LanguageChecker {

    private val badWords = badLanguage.split("\n")

    override fun containsBadLanguage(input: String): Boolean {
        for (badWord in badWords) {
            if (input.contains(badWord, ignoreCase = true)) {
                val regex = """(?i)\b$badWord\b""".toRegex()
                if (regex.containsMatchIn(input)) {
                    return true
                }
            }
        }
        return false
    }
}
