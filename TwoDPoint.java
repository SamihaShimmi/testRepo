/*
Developed by Samiha
Start Date : 01/28/2021
*/
package Shimmi;

// this class accpets two x and y corordinates and generates 2D point using that x and y value
public class TwoDPoint
{ void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 
  TwoDPoint change 2
    // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
    public int x, y, m, n;
    public TwoDPoint(int x, int y)
    {
            this.x = y;
			
            this.y = x;
    }
}
line 3 added in another file
