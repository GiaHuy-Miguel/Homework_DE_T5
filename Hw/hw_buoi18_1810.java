package Hw;

class LinearSearch_ {
    public int search;
    public int[] num;
    public String result;

    public LinearSearch_(int search, int[] num){
        this.search = search;
        this.num = num;
    }

    public String Search() {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                result = "the index of number is " + Integer.toString(i);
                break;
            } else {
                result = "requirement cannot be found";
            }
        }
        return result;
    }
}

public class hw_buoi18_1810 {
    public static void main(String[] args) {
        int[] num = {12, 124, 135, 213, 15, 18, 19, 20, 34, 25};
        LinearSearch_ lns = new LinearSearch_(18, num);
        System.out.println(lns.Search());
    }
}
