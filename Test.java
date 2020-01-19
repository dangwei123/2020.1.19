class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        while(l<r){
            int mid=(l+r)>>>1;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}

class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int a=x;
        while(a>x/a){
            a=(a+x/a)>>>1;
        }
        return a;
    }
}

class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int l=0;
        int r=x>>>1;
        while(l<r){
            int mid=(l+r+1)>>>1;
            if(mid>x/mid){
                r=mid-1;
            }else{
                l=mid;
            }
        }
        return l;
    }
}

class Solution {
    public String toLowerCase(String str) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                sb.append((char)(c+32));
            }else{
                sb.append(c);
            }
            
        }
        return new String(sb);
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums,int l,int r){
        while(l<r){
            int tmp=nums[l];
            nums[l++]=nums[r];
            nums[r--]=tmp;
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            arr1[(c-'a')]++;
        }
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            arr2[(c-'a')]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]>arr2[i]){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int sum=0;
        while(num!=0){
            if(sum>Integer.MAX_VALUE/10||(sum==Integer.MAX_VALUE/10&&sum%10>8)){
                return false;
            }
            sum=sum*10+num%10;
            num/=10;
        }
        return sum==x;
    }
}