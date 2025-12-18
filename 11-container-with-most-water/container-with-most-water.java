class Solution {
    public int maxArea(int[] height) {
        int s = 0, e = height.length -1;
        int vol = -1;

        while (s < e) {

            int h = Math.min (height[s], height[e]);

            System.out.println ("h: " + h);

            int w = Math.abs (e - s);

            System.out.println ("w: " + w);

            vol = Math.max (vol, h * w);

            System.out.println ("vol: " + vol);

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