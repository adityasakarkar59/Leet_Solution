class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                    .mapToInt(lst -> 
                        Arrays.stream(lst).sum()
                    )
                    .max().getAsInt();
    }
}









// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int max = 0;
        
//         for (int[] customer : accounts) {
//             int curr = 0;
//             for (int bank : customer) {
//                 curr += bank;
//             }
//             if (curr > max) {
//                 max = curr;
//             }
//         }
        
//         return max;
//     }
// }