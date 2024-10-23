package org.rmleme.algorithms

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SortingTest : StringSpec() {

    private val unsortedList = listOf(19, 5, 58, 7, 8, 17, 79, 45, 41, 97)
    private val sortedLIst = listOf(5, 7, 8, 17, 19, 41, 45, 58, 79, 97)

    init {
        "Test Bubble Sort" {
            BubbleSort().sort(unsortedList) shouldBe sortedLIst
        }

        "Test Merge Sort" {
            MergeSort().sort(unsortedList) shouldBe sortedLIst
        }
    }
}
