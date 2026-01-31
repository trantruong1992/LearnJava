package com.vti.frontend;

import com.vti.entity.Account;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Exercise1_Question1();
        //Exercise1_Question2();
        //Exercise1_Question3();
        //Exercise1_Question4();
        //Exercise2_Question1();
        //Exercise3_Question1();
        //Exercise3_Question2();
        //Exercise3_Question3();
    }
    public static void Exercise1_Question1(){
        System.out.println("Exercise 1 (Optional): Datatype Casting\n" +
                "Question 1:\n" +
                "Khai báo 2 số lương có kiểu dữ liệu là float.\n" +
                "Khởi tạo Lương của Account 1 là 5240.5 $\n" +
                "Khởi tạo Lương của Account 2 là 10970.055$\n" +
                "Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra\n" +
                "Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó \n" +
                "-----------------------------------------------------------------------");
        float Salary1;
        float Salary2;
        Salary1 = (float) 5240.5;
        Salary2 = (float) 10970.055;
        System.out.println("Salary1: " + Salary1 + "|| Salary2: " + Salary2);
        int roundSalary1 = (int) Salary1;
        int roundSalary2 = (int) Salary2;
        System.out.println("roundSalary1: " + roundSalary1 + " || roundSalary2: " + roundSalary2);
    }

    public static void Exercise1_Question2(){
        System.out.println("Exercise 1 (Optional): Datatype Casting\n" +
                "Question 2:\n" +
                "Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm\n" +
                "có số 0 ở đầu cho đủ 5 chữ số) \n" +
                "-----------------------------------------------------------------------");
        int min = 0;
        int max = 99999;
        int a = (int) (Math.random() * max) + min;
        while (a < 10000) {
            a = a * 10;
        }
        System.out.println("Số ngẫu nhiên: " + a);
    }

    public static void Exercise1_Question3(){
        System.out.println("Exercise 1 (Optional): Datatype Casting\n" +
                "Question 3:\n" +
                "Lấy 2 số cuối của số ở Question 2 và in ra.\n" +
                "Gợi ý:\n" +
                "Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối\n" +
                "Cách 2: chia lấy dư số đó cho 100 \n" +
                "-----------------------------------------------------------------------");
        int min = 0;
        int max = 99999;
        int a = (int) (Math.random() * max) + min;
        while (a < 10000) {
            a = a * 10;
        }
        System.out.printf("===Question2======\n");
        System.out.println("Số ngẫu nhiên: " + a);
        System.out.println("======Question3=======");
        String b = String.valueOf(a);
        System.out.println("Hai số cuối: " + b.substring(3));
    }

    public static void Exercise1_Question4(){
        System.out.println("Exercise 1 (Optional): Datatype Casting\n" +
                "Question 4:\n" +
                "Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng \n" +
                "-----------------------------------------------------------------------");
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = scanner.nextInt();
        do {
            System.out.println("Nhập b = ");

            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Vui lòng nhập b khác 0 !");
            }
        } while (b == 0);
        scanner.close();
        System.out.println("Thương: " + (float) a / (float) b);
    }

    public static void Exercise2_Question1(){
        System.out.println("Exercise 2 (Optional): Default value\n" +
                "Question 1:\n" +
                "Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi\n" +
                "tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):\n" +
                "• Email: \"Email 1\"\n" +
                "• Username: \"User name 1\"\n" +
                "• FullName: \"Full name 1\"\n" +
                "• CreateDate: now \n" +
                "-----------------------------------------------------------------------");
        System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");
            Account[] accArray = new Account[5];
        for (int i = 0; i < accArray.length; i++) {
            Account acc = new Account();
            acc.email = "Email " + i;
            acc.userName = "User name " + i;
            acc.fullName = "Full name " + i;
            acc.createDate = LocalDateTime.now();
            accArray[i] = acc;
            System.out.println(
                    "Thông tin Account " + i +
                    " Email: " + accArray[i].email +
                    " UserName: " + accArray[i].userName +
                    " FullName: " + accArray[i].fullName +
                    " CreateDate: " + accArray[i].createDate);
        }
    }

    public static void Exercise3_Question1(){
        System.out.println("Exercise 3(Optional): Boxing & Unboxing\n" +
                "Question 1:\n" +
                "Khởi tạo lương có datatype là Integer có giá trị bằng 5000.\n" +
                "Sau đó convert lương ra float và hiển thị lương lên màn hình (với số\n" +
                "float có 2 số sau dấu thập phân) \n" +
                "-----------------------------------------------------------------------");
        Integer salary = 5000;
        System.out.printf("%2.2f", (float) salary);
    }

    public static void Exercise3_Question2(){
        System.out.println("Exercise 3(Optional): Boxing & Unboxing\n" +
                "Question 2:\n" +
                "Khai báo 1 String có value = \"1234567\"\n" +
                "Hãy convert String đó ra số int \n" +
                "-----------------------------------------------------------------------");
        String s = "1234567";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    public static void Exercise3_Question3(){
        System.out.println("Exercise 3(Optional): Boxing & Unboxing\n" +
                "Question 2:\n" +
                "Khai báo 1 String có value = \"1234567\"\n" +
                "Hãy convert String đó ra số int \n" +
                "-----------------------------------------------------------------------");
        Integer i = 1234567;
        int i1 = i.intValue();
        System.out.println(i1);
    }

    public static void Exercise4_Question1(){
        System.out.println("Exercise 3(Optional): Boxing & Unboxing\n" +
                "Question 2:\n" +
                "Khai báo 1 String có value = \"1234567\"\n" +
                "Hãy convert String đó ra số int \n" +
                "-----------------------------------------------------------------------");
        String s1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        s1 = scanner.nextLine();

// Xóa khoảng trắng đầu & cuối
        s1 = s1.trim();

        if (s1.isEmpty()) {
            System.out.println("Số từ: 0");
        } else {
            // Tách theo 1 hoặc nhiều khoảng trắng
            String[] words = s1.split("\\s+");
            System.out.println("Số từ: " + words.length);
        }

        scanner.close();
    }

}
