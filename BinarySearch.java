/*Its just a binarysearch function it was implemented using pseudocode*/
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class BinarySearch
{
	int bin_search(int A[], int left, int right,  int k)
	{
		// Your code here
        if(left<=right){//checking for boundary conditions
            int mid=(left+right)/2;//finding middle element
            if(A[mid]==k){
                return mid;//if inteneded target element found i should return
            }
            else if(A[mid]>k){//if element is less than A[mid] i should check only from left to middle-1
                return bin_search(A,left,mid-1,k);
            }
            else{//if element is greater than A[mid] i should check only from middle+1 to right
                return bin_search(A,mid+1,right,k);
            }
        }
        return -1;//if element not found i should return -1
	}
}
