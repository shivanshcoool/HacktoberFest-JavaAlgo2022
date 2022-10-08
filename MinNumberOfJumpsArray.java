/* 
Problem Statement :- Minimum number of jumps required to reach at the end of Array
https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1#
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
*/
class ArrayQuestion10 {
    int jumpRequiredFunction(int[] arr){
        int totalJump = 0;
        int i=0;
        while(i< arr.length-1){
            if(arr[i] != 0){
                i =i + arr[i];
                totalJump++;
            }
            else{
                totalJump = -1;
                break;
            }
        }
        return totalJump;
    }
}
class RequiredClassForArray10{
    public static void main(String[] args){
        //int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        //int[] arr = {7, 4, 1, 3, 2, 6, 2, 1, 7, 8, 2 };
        //int[] arr = {1,4,3,2,5,7};
        int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        ArrayQuestion10 newObject = new ArrayQuestion10();
        int finalAnswer = newObject.jumpRequiredFunction(arr);
        System.out.println(finalAnswer);
    }
}