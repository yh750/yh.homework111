package day04;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        int []num=new int[8];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            num[i]=scan.nextInt();
        }
        output(num);
    }

    private static void output(int num[]) {
        int oddNum[];
        int evenNum[];
        int j=0,k=0;//j表示偶数下标，k用于奇数下标
        //int oddCount=0,evenCount=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                j++;
            }else{
                k++;
            }
        }
        oddNum=new int[k];
        evenNum=new int[j];
        j=k=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                evenNum[j]=num[i];
                j++;
            }else{
                oddNum[k]=num[i];
                k++;
            }
        }
        int l=0;
        if(j>k){//偶数比奇数多
            l=k;
        }else {
            l=j;
        }
        for(int i=0;i<l;i++){
            System.out.print(oddNum[i]+" "+evenNum[i]+" ");
        }for(int i=j;i<=k-1;i++){
            System.out.print(oddNum[i]+" ");
        }for(int i=k;i<=j-1;i++){
            System.out.print(evenNum[i]+" ");
        }
    }
}


