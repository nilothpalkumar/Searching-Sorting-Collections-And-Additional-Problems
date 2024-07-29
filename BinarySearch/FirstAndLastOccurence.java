package BinarySearch;

public class FirstAndLastOccurence
{
        public static int first(int arr[], int low, int high, int key, int arrLength)
        {
            if (high >= low) {
                int mid = (high + low) / 2;
                if ((mid == 0 || key > arr[mid - 1])
                        && arr[mid] == key)
                    return mid;
                else if (key > arr[mid])
                    return first(arr, (mid + 1), high, key, arrLength);
                else
                    return first(arr, low, (mid - 1), key, arrLength);
            }
            return -1;
        }


        public static int last(int arr[], int low, int high,
                               int key, int arrLength)
        {
            if (high >= low) {
                int mid = (high + low) / 2;
                if ((mid == arrLength - 1 || key < arr[mid + 1])
                        && arr[mid] == key)
                    return mid;
                else if (key < arr[mid])
                    return last(arr, low, (mid - 1), key, arrLength);
                else
                    return last(arr, (mid + 1), high, key, arrLength);
            }
            return -1;
        }

        public static void main(String[] args)
        {

            int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
            int arrLength = arr.length;
            int key = 8;
            System.out.println("First Occurrence = "  + first(arr, 0, arrLength - 1, key, arrLength));
            System.out.println("Last Occurrence = "  + last(arr, 0, arrLength - 1, key, arrLength));
        }

}
