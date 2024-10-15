package org.rmleme.algorithms

class BubbleSort {

    fun sort(input: List<Int>): List<Int> {
        val output = input.toMutableList()

        for (i in output.indices) {
            for (j in 0 until output.size - 1 - i) {
                if (output[j] > output[j + 1]) {
                    output[j] = output[j + 1].also { output[j + 1] = output[j] }
                }
            }
        }

        return output
    }
}
