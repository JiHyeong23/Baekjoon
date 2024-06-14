class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 > len2) {
            return 1;
        } else if (len1 == len2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int arr : arr1) {
                sum1 += arr;
            }
            for (int arr : arr2) {
                sum2 += arr;
            }
            if (sum1 > sum2) {return 1;}
            else if (sum1 == sum2) {return 0;}
            else {return -1;}
        }
        return -1;
    }
}