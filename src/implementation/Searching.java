package implementation;

public class Searching{
    private int[] arr;

    public Searching(int[] arr) {
        this.arr = arr;
    }

    public boolean binarySearch(int searchElement, int low, int high){
        if(low > high){
            return false;
        }
        int mid = (low + high) / 2;

        if(searchElement == arr[mid]){
            return true;
        }
        else if(searchElement < arr[mid]){
            return binarySearch(searchElement, low, mid - 1);
        }
        else {
            return binarySearch(searchElement, mid+1, high);
        }
    }
}
