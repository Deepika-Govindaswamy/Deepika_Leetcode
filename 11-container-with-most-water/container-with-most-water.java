class Solution {
    public int maxArea(int[] height) {
        int s = 0, e = height.length -1;
        int vol = -1;

        while (s < e) {

            int h = Math.min (height[s], height[e]);
            int w = Math.abs (e - s);
            vol = Math.max (vol, h * w);
            
            if (height[s] < height[e]) {
                s++;
            }
            else{
                e--;
            }
        }

        return vol;
    }
}