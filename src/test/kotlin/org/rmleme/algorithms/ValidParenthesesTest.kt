package org.rmleme.algorithms

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ValidParenthesesTest : StringSpec() {

    private val validParentheses = ValidParentheses()

    init {
        "Test 1" {
            validParentheses.isValid("()") shouldBe true
        }

        "Test 2" {
            validParentheses.isValid("()[]{}") shouldBe true
        }

        "Test 3" {
            validParentheses.isValid("(]") shouldBe false
        }

        "Test 4" {
            validParentheses.isValid("([])") shouldBe true
        }

        "Test 5" {
            validParentheses.isValid(")}") shouldBe false
        }
    }
}
