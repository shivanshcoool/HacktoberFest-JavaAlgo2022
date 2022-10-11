/*
Problem Statement : Minimize the Heights II
https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output: 5
*/
class ArrayQuestion9{
    int requiredFunctionOne(int[] arr, int k){
        int minAnswer=0;
        int minAnswer2=0;
        minAnswer = arr[arr.length-2] - arr[arr.length-1] + 2* k;
        for(int i=0;i<arr.length;i++){
            if(arr[i]/k > 1){
                arr[i] -= k;
            }
            else{
                arr[i] += k;
            }
        }
        int max = arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j] > max){
                max= arr[j];
            }
        }
        int min =arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j] < min){
                min= arr[j];
            }
        }
        minAnswer2 = max - min;
        if( minAnswer > minAnswer2){
            return minAnswer2;
        } 
        else{
            return minAnswer;
        }
    }
    void merge(int[] sortedArray, int begin, int mid, int end){
        int firstArraySize = mid - begin + 1;
        int secondArraySize = end - mid;
        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[secondArraySize];

        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = sortedArray[begin + i];
        }
        for (int j = 0; j < secondArraySize; j++) {
            secondArray[j] = sortedArray[j + mid + 1];
        }

        int firstVariable = 0;
        int secondVariable = 0;
        int finalArrayIndex = begin;
        while (firstVariable < firstArraySize && secondVariable < secondArraySize) {
            if (firstArray[firstVariable] > secondArray[secondVariable]) {
                sortedArray[finalArrayIndex] = secondArray[secondVariable];
                secondVariable++;
                finalArrayIndex++;
            } else {
                sortedArray[finalArrayIndex] = firstArray[firstVariable];
                firstVariable++;
                finalArrayIndex++;
            }
        }
        while (firstVariable < firstArraySize) {
            sortedArray[finalArrayIndex] = firstArray[firstVariable];
            firstVariable++;
            finalArrayIndex++;
        }
        while (secondVariable < secondArraySize) {
            sortedArray[finalArrayIndex] = secondArray[secondVariable];
            secondVariable++;
            finalArrayIndex++;
        }
    }
    void mergeSort(int[] arr, int begin, int end){
        if(begin < end){
            int mid = (begin + end)/2;
            mergeSort(arr,begin,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,begin,mid,end);
        }
    }
    
}
class RequiredClassForArray9{
    public static void main(String[] args){
        int[] arr = {2,6,3,4,7,2,10,3,2,1};
        int k=5;
        ArrayQuestion9 newObject = new ArrayQuestion9();
        int totalLength = arr.length; 
        newObject.mergeSort(arr, 0 , totalLength-1);
        int min = newObject.requiredFunctionOne(arr,k);
        System.out.println(min);
    }
}