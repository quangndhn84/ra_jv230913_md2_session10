package ra.exception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number1, number2, div;
//        try {
//            System.out.println("Nhập vào số thứ nhất:");
//            number1 = Integer.parseInt(scanner.nextLine());
//            System.out.println("Nhập vào số thứ hai:");
//            number2 = Integer.parseInt(scanner.nextLine());
//            div = number1 / number2;
//        } catch (NumberFormatException ex) {
//            //Xử lý lỗi của người lập trình
//            System.out.println("Dữ liệu đầu vào không phải là số");
//            div = 0;
//        } catch (ArithmeticException ex) {
//            System.out.println("Không thể chia cho 0");
//            div = 0;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            div = 0;
//        } finally {
//            System.out.println("Kết thúc quá trình tính toán");
//        }
//        System.out.println("Kết quả phép chia: " + div);

        divTwoNumber(10,0);

    }

    public static int divTwoNumber(int number1, int number2) throws ArithmeticException, NumberFormatException{
//        if (number2==0){
//            throw new ArithmeticException("Lỗi chia cho 0");
//        }
        int div = number1/number2;
        return div;
    }
}
