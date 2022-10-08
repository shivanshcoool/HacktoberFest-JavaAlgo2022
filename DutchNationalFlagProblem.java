/* **************************************
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Two Approaches :- Using two Loops and storing values in new Array [Sorted] but complexity will be O(n^2)
                  Second Approach will take O(N) but have use 4 seperate loops.
                  It is also known Dutch National flag Problem.
                  https://users.monash.edu/~lloyd/tildeAlgDS/Sort/Flag/
******************************************/
class ArrayQuestion4 {
    public void requiredArrayFunction(int[] arr) {
        int countZero = 0, countOne=0,countTwo=0;
        for (int values : arr) {
            if (values == 0) {
                countZero++;                      
            }
            else if(values == 1){
                countOne++;
            }
            else{
                countTwo++;
            }   
        }
        int i=0;
        while(countZero>0){
            arr[i++]=0;
            --countZero;
        }
        while(countOne>0){
            arr[i++]=1;
            countOne--;
        }
        while(countTwo>0){
            arr[i++]=2;
            countTwo--;
        }
    }
}

class RequiredClassForArray4 {
    public static void main(String[] args) {
        ArrayQuestion4 newObject = new ArrayQuestion4();
        int[] arr = { 0, 2, 1, 2, 0 };
        newObject.requiredArrayFunction(arr);
        for (int values : arr) {
            System.out.print(values + " ");
        }
    }
}