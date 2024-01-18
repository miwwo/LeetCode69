class Solution {
    public int mySqrt(int x) { //example 25
        if(x <= 1) return x;
        int start = 1;
        int end = x/2; //12

        while(start < end) {
            // start is not always moving and hence we can get stuck in infinite loop with mid calculation
            // Adding 1 to mid everytime to ensure we always move the mid
            int mid = (start + (end-start)/2) + 1;  //1) mid = (1 + 11) / 2 = 6

            // use division instead of multiplication to avoid overflow
            int div = x/mid; //div = 25/6 = 4
            if(div == mid) return mid; // found the square root
            if(div > mid) start = mid; // if (4>6) false   if true -> move the left then start = 6
            else end = mid-1; // if (4<6) end = 6 - 1 = 5
        }

        return start;
    }
}