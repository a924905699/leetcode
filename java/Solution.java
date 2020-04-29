interface MountainArray {
    public int get(int index);
    public int length();
 }
 class  MountainArrayimpl implements  MountainArray{
    private int[] arr;
    private int size;

     public MountainArrayimpl(int[] arr) {
         this.arr = arr;
         this.size=this.arr.length;
     }

     @Override
     public int get(int index) {
         return this.arr[index];
     }

     @Override
     public int length() {
         return size;
     }
 }

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int size=mountainArr.length();
        int mountaintop=findMoutainTop(mountainArr,0,size-1);
        int res=findSortArr(mountainArr,0,mountaintop,target);
        if(res!=-1){
            return res;
        }
        return findInverseArr(mountainArr,mountaintop+1,size-1,target);
    }

    public int findInverseArr(MountainArray mountainArr, int l, int r, int target) {
        while (l<r){
            int mid=l+(r-l)/2;
            if(mountainArr.get(mid)>target){
                l=mid+1;
            }
            else {
                r=mid;
            }
        }
        if(mountainArr.get(l)==target) return l;
         return -1;
    }
    public int findSortArr(MountainArray mountainArr, int l, int r, int target) {
        while (l<r){
            int mid=l+(r-l)/2;
            if(mountainArr.get(mid)<target){
                l=mid+1;
            }
            else {
                r=mid;
            }
        }
        if(mountainArr.get(l)==target) {
            return l;
        }
          return -1;
    }

    public int findMoutainTop(MountainArray mountainArr, int l, int r) {
        while (l<r){
            int mid=l+(r-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l=mid+1;
            }else {
                r=mid;
            }
        }
        return l;
    }
}
class Main{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        MountainArray mountainArray = new MountainArrayimpl(arr);
        Solution solution = new Solution();
        int res = solution.findInMountainArray(target, mountainArray);
        System.out.println(res);

     }
}