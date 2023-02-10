public class Recursion {
    public static void main(String[] args) {
        int result = reiteracion(10);
        System.out.println("result = " + result);

        int result2 = sum(5,10);
    }

    static int reiteracion(int a){
        if (a > 0){
            return a + reiteracion(a - 1);
        }else {
            return 0;
        }
    }

    static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end - 1);
        }else{
            return 0;
        }
    }
}
