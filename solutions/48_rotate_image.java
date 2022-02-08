// https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        int L = matrix.length;
        if(L == 1)
            return;
        int half = (L+1)/2;
        int layer = 0;
        while(layer < half)
        {
            int R = layer, C = layer;
            while(C < L - layer - 1)
            {
                int old = matrix[R][C];
                for(int i = 0; i < 4; i++)
                {
                    int new_R = C, new_C = L - 1 - R;
                    int temp = matrix[new_R][new_C];
                    matrix[new_R][new_C] = old;
                    old = temp;
                    R = new_R;
                    C = new_C;
                }
                C++;
            }
            layer++;
        }
    }
}
