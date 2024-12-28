class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List <Integer> res = new ArrayList<>();
        int val = 1;

        int index = search (nums2, 0, nums2.length - 1, nums1[0]);
        if (index != -1){
            res.add(nums1[0]);
        }

        while (val < nums1.length){
            if (nums1[val] == nums1[val-1]){  
                val++; 
                continue;
            }
            System.out.println(val); 
            index = search (nums2, 0, nums2.length - 1, nums1[val]);
            if (index != -1){
                res.add(nums1[val]);
            }
            val++;
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    public int search (int[] arr, int start, int end, int target){

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}