class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        
        Map <Integer, Integer> map = new HashMap<>();
        boolean res = false;

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put (i, 1);
            }
        }

        System.out.println (map);

        for (int i : map.values()) {
            if (isPrime(i)) {
                return true;
            }   
        }

        return res;
    }

    public boolean isPrime (int n) {

        if (n == 1) return false;

        System.out.println ("n: " + n);
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}