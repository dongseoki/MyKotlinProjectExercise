package leetcode

fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
}

fun threeSum(nums: IntArray): List<List<Int>> {

}

fun combi(arr:List<Int>, visited:MutableList<Boolean>, start:Int, end:Int){
    if (start == end){
        for (i in 0 until end){
            if (visited[i]){
                print("${arr[i]} ")
            }
        }
        println()
        return
    }
    visited[start] = true
    combi(arr, visited, start + 1, end)
    visited[start] = false
    combi(arr, visited, start + 1, end)
}