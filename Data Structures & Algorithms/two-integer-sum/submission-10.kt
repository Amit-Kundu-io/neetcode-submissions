class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int , Int>()

        nums.forEachIndexed{indx,value->

        val comp = target - value;
        if(map.containsKey(comp)) return intArrayOf(map[comp] ?: 0, indx)

        map[value] = indx

        }
        return intArrayOf()

    }
}
