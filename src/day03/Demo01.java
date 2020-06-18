package day03;

public class Demo01 {
    public static void main(String[] args) {
        test();
        test1();
    }

    //打印等腰三角形
    public static void test() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //计算100以内质数的和
    public static void test1() {
        int sum = 0;
        int j;
        for (int i = 2; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
                if(j==i){
                    sum+=i;
                }
        }
        System.out.println(sum);
    }
}

