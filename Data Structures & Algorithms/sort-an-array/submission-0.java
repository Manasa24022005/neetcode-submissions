class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
    
         mergesort(nums,0,n-1);
        return nums;
        
        
    }
    public void mergesort(int[] nums,int low,int high){


        
        
        if(low>=high){
            return;
        }

        int mid=(low+high)/2;

        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
      

    }
    public void merge(int[] nums,int low,int mid,int high){
       int[] arr = new int[high-low+1];

        int left=low;
        int right=mid+1;
        int i=0;

        while(left<=mid && right<=high){

            if(nums[left]<=nums[right]){
                arr[i]=nums[left];
                left++;
            }
            else{
                arr[i]=nums[right];
                right++;
            }
            i++;


        }


        while(left<=mid){
            arr[i]=nums[left];
            left++;
            i++;

        }
        while(right<=high){
            arr[i]=nums[right];
            right++;
            i++;
        }

        for(int k=0;k<arr.length;k++){
            nums[k+low]=arr[k];
        }




    }


    }

