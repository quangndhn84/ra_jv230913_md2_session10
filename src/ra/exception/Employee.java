package ra.exception;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {

    private String id;
    //Phải là chuỗi có độ dài từ 10 đến 50 ký tự
    private String name;
    //Phải là số float có giá trị lớn hơn 0
    private float rate;
    //Phải là số nguyên, có giá trị nhỏ hơn năm 2006
    private int year;
    //Là kiểu date và có định dạng là dd/MM/yyyy
    private Date birthDate;

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã nhân viên:");
        this.id = scanner.nextLine();
        this.name = inputName(scanner);
        this.rate = inputRate(scanner);
        this.birthDate = inputBirthDate(scanner);

    }

    public String inputName(Scanner scanner) {
        System.out.println("Nhập vào tên nhân viên");
        do {
            String name = scanner.nextLine();
            if (name.length() >= 10 && name.length() <= 50) {
                return name;
            } else {
                System.err.println("Tên nhân viên có độ dài từ 10-50 ký tự, vui lòng nhập lại");
            }
        } while (true);
    }

    public float inputRate(Scanner scanner){
        System.out.println("Nhập vào hệ số lương:");
        do {
            //Bắt kiểu dữ liệu là float
            try {
                float rate = Float.parseFloat(scanner.nextLine());
                if (rate>0){
                    return rate;
                }else{
                    System.err.println("Giá trị hệ số lương lớn hơn 0, vui lòng nhập lại");
                }
            }catch (NumberFormatException ex){
                System.err.println("Hệ số lương có kiểu float, vui lòng nhập lại");
            }catch (Exception ex){
                System.err.println("Có lỗi xảy ra trong quá trình thực hiện, vui lòng nhập lại");
            }
        }while (true);
    }
    public Date inputBirthDate(Scanner scanner){
        System.out.println("Nhập vào ngày sinh của nhân viên:");
        do {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date birthDate = sdf.parse(scanner.nextLine());
            }catch (Exception ex){
                System.err.println("Định dạng ngày sinh là dd/MM/yyyy, vui lòng nhập lại");
            }
        }while (true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        emp.inputData(scanner);
    }

}
