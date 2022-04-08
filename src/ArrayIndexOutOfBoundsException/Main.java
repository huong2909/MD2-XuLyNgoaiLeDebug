package ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhập chỉ số của phần tử");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị phần tử có chỉ số "+x+ " là "+arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Vượt quá giới hạn của mảng");
        }
    }
}
