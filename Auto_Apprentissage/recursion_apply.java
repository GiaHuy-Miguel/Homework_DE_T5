package Auto_Apprentissage;

import java.util.Arrays;

class back_tracking {

    public void nhi_phan(int m, int[] n) {
        for (int i = 0; i < m; i++) {
            int key = 1;
            int j = i - 1;
            n[i] = 1;
            if (j >= 0) {
                n[i] = 1;
                n[j] = 0;
            }
            System.out.println(Arrays.toString(n));
        }
        if (m>0) nhi_phan(m-1, n);
    }
}


public class recursion_apply {
    public static void main(String[] args) {
        int[] n = {0, 0, 0};

        back_tracking test = new back_tracking();
        test.nhi_phan(3, n);
    }
}

