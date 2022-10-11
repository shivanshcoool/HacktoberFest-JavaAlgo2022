/*
Problem Statement :- Find out the Largest Sum Contiguous Subarray
N = 5
Arr[] = {1,2,3,-2,5}
Output: 9
*/
class ArrayQuestion8 {
    public int requiredFunction(int[] a) {
        int checker =a[0];
        int maxValue = a[0];
        for(int i=1;i<a.length;i++){
            checker = Math.max(a[i], checker + a[i]);
            maxValue = Math.max(maxValue, checker);
        }
     return maxValue;
    }
}
class RequiredClassForArray8{
    public static void main(String[] args){
        int[] arr = {1,-2,3,-6,5,-2,4,3,-10};
        ArrayQuestion8 newObject = new ArrayQuestion8();
        int finalAnswer = newObject.requiredFunction(arr);
        System.out.println(finalAnswer);
    }
}