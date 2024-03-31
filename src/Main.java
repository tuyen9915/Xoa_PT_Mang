import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int[] mang =  {3,5,9,8,2,3,0,0,0,0,0,0,0};
        System.out.print("Mảng đã có: ");
     for (int in : mang) {
         System.out.print(in + ", " );
     }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa: ");
        int nhap = sc.nextInt();
        boolean check = false;
        for (int i = 0 ; i < mang.length ; i++){
            if(mang[i] == nhap){
                check = true;
            }

        }
        if(!check){
         System.out.println("Số cần xóa không có trong mảng");
        }
        int k=0;
        int mang1[] = new int[mang.length - 1];
        for (int a = 0; a < mang.length; a++){
            if (mang[a] != nhap){
                mang1[k]  =  mang[a];
                k ++;
            }
        }

        System.out.println();
        System.out.print("Mảng sau khi đã xóa phần tử " + nhap + " là: " );
        for (int in : mang1) {
            System.out.print(in + ", " );
        }

    }
}