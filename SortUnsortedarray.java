import java.util.Arrays;

import java.util.*;
public class SortUnsortedarray {

    // public static int findUnsortedSubarray(int[] nums) {
    //     int a[]=nums;
    //     return findUnsortedSubarrayhelper(nums,getsortarray(a));
    // }

    // public static int[] getsortarray(int[] nums){
    //     int ans[]=new int [nums.length];
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length;i++){
    //         ans[i]=nums[i];
    //     }
    //     return ans;
    // }


    public static int findUnsortedSubarray(int[] nums) {
        int arr1[]=nums.clone();
        
        Arrays.sort(arr1);
        for(int l:arr1){
            System.out.print(l+" ");
        }  System.out.println();
        int i=0;
        int j=nums.length-1;

        for(int l:nums){
            System.out.print(l+" ");
        }
      
      
        System.out.println();
        while(i<nums.length){
            if(nums[i]==arr1[i]){
                i++;
            }
            else{
                break;
            }
        }
        while(j>0){
            if(nums[j]==arr1[j]){
                j--;
            }
            else{
                break;
            }
        }
        System.out.println(i+" "+j);
        if(i>j)
            return 0;
        else{
            return j-i+1;
        }
    }


    public static void main(String[] args) {
        int nums[]={1,3,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
