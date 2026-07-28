class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int , Int>()

        nums.forEachIndexed{indx,value->

        val comp = target - value;
        if(map.containsKey(comp)) return intArrayOf(map[comp]!! , indx)

        map[value] = indx

        }
        return intArrayOf()

    }
}
