class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        
        Map <Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put (i, 1);
            }
        }

        for (int i : map.values()) {
            if (isPrime(i)) {
                return true;
            }   
        }

        return false;
    }

    public boolean isPrime (int n) {

        if (n == 1) return false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}