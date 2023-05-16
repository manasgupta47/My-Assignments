class SearchArray {
    public boolean searchArray(int[] arr, int toCheckValue) {
        boolean a = false;
        for(int i:arr){
            if(i==toCheckValue){
                a=true;
                break;
            }
        }
        return a;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int valueToCheck = 2;
        SearchArray a1q7=new SearchArray();
        System.out.println(a1q7.searchArray(arr,valueToCheck));
    }  }
