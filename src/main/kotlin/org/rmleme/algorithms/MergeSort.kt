package org.rmleme.algorithms

class MergeSort {

    fun sort(input: List<Int>): List<Int> {
        if (input.size == 1) {
            return input
        }

        val middle = input.size / 2
        val leftSubList = buildList { addAll(input.subList(0, middle)) }
        val rightSubList = buildList { addAll(input.subList(middle, input.size)) }

        val sortedLeftSubList = sort(leftSubList)
        val sortedRightSubList = sort(rightSubList)

        return merge(sortedLeftSubList, sortedRightSubList)
    }

    private fun merge(leftSubList: List<Int>, rightSubList: List<Int>): List<Int> {
        val output = mutableListOf<Int>()
        var i = 0
        var j = 0

        while (i < leftSubList.size && j < rightSubList.size) {
            if (leftSubList[i] < rightSubList[j]) {
                output.add(leftSubList[i++])
            } else {
                output.add(rightSubList[j++])
            }
        }
        while (i < leftSubList.size) {
            output.add(leftSubList[i++])
        }
        while (j < rightSubList.size) {
            output.add(rightSubList[j++])
        }

        return output
    }
}
