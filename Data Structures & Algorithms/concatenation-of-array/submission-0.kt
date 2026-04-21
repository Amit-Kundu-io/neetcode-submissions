class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
         val ans = IntArray(2 * n)
        var num = 0 

        repeat(2){
            nums.forEachIndexed{indx,numx->
            ans[indx + num * n] = numx

        
            }
            num++
        }

        return ans

    }
}
