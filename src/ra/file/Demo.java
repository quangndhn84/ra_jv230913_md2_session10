package ra.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 25);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 28);
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        //Ghi dữ liệu ra file
        Demo.writeDataToFile(listStudents);
        //Đọc dữ liệu
        Demo.readDataFromFile();


    }
    public static void writeDataToFile(List<Student> listStudent){
        //Ghi dữ liệu 1 danh sách các sinh viên ra file demo.txt
        //1. Khởi tạo đối tượng file làm việc với file demo.txt
        //URL: tương đối và tuyệt đối
        File file = new File("demo.txt");
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            //2. Khởi tạo đối tượng FileOutputStream
            fos = new FileOutputStream(file);
            //3. Khởi tạo đối tượng ObjectOutputStream để ghi file kiểu object
            oos = new ObjectOutputStream(fos);
            //4. Ghi dữ liệu ra file theo object - writeObject(obj)
            oos.writeObject(listStudent);
            //5. Đẩy dữ liệu từ stream xuống file
            oos.flush();
            //6. Đóng file
            oos.close();
            fos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void readDataFromFile(){
        //Đọc dữ liệu từ file và in ra màn hình
        //1. Khởi tạo đối tượng file
        File file = new File("demo.txt");

        FileInputStream fis;
        ObjectInputStream ois;
        try {
            //2. Khởi tạo đối tượng FileInputStream để làm việc với file
            fis = new FileInputStream(file);
            //3. Khởi tạo đối tượng ObjectInputStream để đọc file theo kiểu object
            ois = new ObjectInputStream(fis);
            //4. Đọc dữ liệu từ file và lưu ra danh sách - readObject()
            List<Student> listStudentRead = (List<Student>) ois.readObject();
            //5. Đóng kết nối
            ois.close();
            fis.close();
            //6. In dữ liệu ra màn hiình
            listStudentRead.forEach(student -> System.out.println(student));
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
