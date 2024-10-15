package org.rmleme.algorithms

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BubbleSortTest : StringSpec() {

    private val bubbleSort = BubbleSort()

    init {
        "Test" {
            bubbleSort.sort(listOf(3, 2, 1)) shouldBe listOf(1, 2, 3)
        }
    }
}
