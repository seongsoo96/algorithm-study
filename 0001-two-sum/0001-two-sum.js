/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var twoSum = function(nums, target) {
    // for(let i=0; i<nums.length; i++) {
    //     for(let j=i+1; j<nums.length; j++) {
    //         if(nums[i] + nums[j] == target) {
    //             return [i, j];
    //         }
    //     }
    // }
    
    const map = {}
    for (let index = 0; index < nums.length; index++) {
      const element = nums[index]
      const complement = target - element
      if (map[complement] !== undefined) {
        return [map[complement], index]
      } else {
        map[element] = index
      }
    }
    return []
};