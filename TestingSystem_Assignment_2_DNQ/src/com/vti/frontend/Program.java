package com.vti.frontend;

import com.vti.entity.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        // Tạo Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";
        // Tạo Position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = Position.PositionName.Dev;
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = Position.PositionName.PM;
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = Position.PositionName.Scrum_Master;
        // Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        // Tạo Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.userName = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDateTime.of(2025, 1, 11, 0, 0, 0);
        Group[] groupAcc1 = {group1, group2};
        acc1.groups = groupAcc1;
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.userName = "daonq2";
        acc2.fullName = "Dao Nguyen 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDateTime.of(2026, 1, 10, 0, 0, 0);
        acc2.groups = new Group[]{group3, group2};
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.userName = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.groups = new Group[]{group1, group3};
        acc3.createDate = LocalDateTime.of(2025, 1, 10, 0, 0, 0);

        // Category
        CategoryQuestion java = new CategoryQuestion();
        java.id = 1;
        java.name = "Java";

        CategoryQuestion sql = new CategoryQuestion();
        sql.id = 2;
        sql.name = "SQL";

        CategoryQuestion oop = new CategoryQuestion();
        oop.id = 3;
        oop.name = "OOP";

        // Question
        Question q1 = new Question();
        q1.id = 1;
        q1.content = "What is Java?";

        Question q2 = new Question();
        q2.id = 2;
        q2.content = "What is OOP?";

        Question q3 = new Question();
        q3.id = 3;
        q3.content = "Explain Inheritance";

        // ===== EXAM 1 =====
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "EX001";
        exam1.title = "Java Basic Exam";
        exam1.category = new CategoryQuestion[]{java};
        exam1.duration = 60;
        exam1.creator = acc1;
        exam1.createDate = LocalDateTime.of(2025, 6, 20, 0, 0, 0);
        exam1.question = new Question[]{q1, q2};

        // ===== EXAM 2 =====
        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = "EX002";
        exam2.title = "OOP Exam";
        exam2.category = new CategoryQuestion[]{oop};
        exam2.duration = 90;
        exam2.creator = acc2;
        exam2.createDate = LocalDateTime.of(2026, 1, 20, 0, 0, 0);
        exam2.question = new Question[]{q2, q3};

        // ===== EXAM 3 =====
        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code = "EX003";
        exam3.title = "SQL Exam";
        exam3.category = new CategoryQuestion[]{sql};
        exam3.duration = 45;
        exam3.creator = acc1;
        exam3.createDate = LocalDateTime.of(2025, 2, 10, 0, 0, 0);
        exam3.question = new Question[]{q1};

        // ===== EXAM 4 =====
        Exam exam4 = new Exam();
        exam4.id = 4;
        exam4.code = "EX004";
        exam4.title = "Java OOP Exam";
        exam4.category = new CategoryQuestion[]{java, oop};
        exam4.duration = 120;
        exam4.creator = acc2;
        exam4.createDate = LocalDateTime.of(2025, 3, 10, 0, 0, 0);
        exam4.question = new Question[]{q1, q2, q3};

        // ===== EXAM 5 =====
        Exam exam5 = new Exam();
        exam5.id = 5;
        exam5.code = "EX005";
        exam5.title = "Final Java Exam";
        exam5.category = new CategoryQuestion[]{java, sql, oop};
        exam5.duration = 150;
        exam5.creator = acc1;
        exam5.createDate = LocalDateTime.of(2025, 4, 10, 0, 0, 0);
        exam5.question = new Question[]{q1, q2, q3};

        // Array Exam
        Exam[] exams = {exam1, exam2, exam3, exam4, exam5};

        // Question 1:
        //Kiểm tra account thứ 2
        //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
        //"Nhân viên này chưa có phòng ban"
        //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
        System.out.println(" ---------Question 1 Check acc2:---------");
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + acc2.department.name);
        }

        //Question 2:
        //Kiểm tra account thứ 2
        //Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
        //Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
        //này là Java Fresher, C# Fresher"
        //Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
        //quan trọng, tham gia nhiều group"
        //Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
        //người hóng chuyện, tham gia tất cả các group"
        System.out.println(" ---------Question 2: Làm theo IF ---------");
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            int countGroup = acc2.groups.length;
            if (countGroup == 1 || countGroup == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (countGroup == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            }
            if (countGroup >= 4) {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }

        //Question 3:
        //Sử dụng toán tử ternary để làm Question 1
        System.out.println("---------Question 3: Sử dụng toán tử ternary để làm Question 1---------");
        System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban." : "Phòng của nhân viên này là: " + acc2.department.name);

        // Question 4:
        //Sử dụng toán tử ternary để làm yêu cầu sau:
        //Kiểm tra Position của account thứ 1
        //Nếu Position = Dev thì in ra text "Đây là Developer"
        //Nếu không phải thì in ra text "Người này không phải là Developer"
        System.out.println("---------Question 4: sử dụng Terry cho Position------");
        System.out.println(acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

        //Question 5:
        //Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
        //Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
        //Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
        //Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
        //Còn lại in ra "Nhóm có nhiều thành viên"
        System.out.println("---------Question 5: Số lượng acc trong nhóm 1--------- ");
        if (group1.accounts == null) {
            System.out.println("Group chưa có thành viên nào tham gia");
        } else {
            int coungAccInGroup = group1.accounts.length;
            switch (coungAccInGroup) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;
                default:
                    System.out.println("Nhóm có nhiều thành viên");
                    break;
            }
        }

        //Question 6:
        //Sử dụng switch case để làm lại Question 2
        System.out.println("---------Question 6: Check số lượng Group nhân viên tham gia: Switch Case --------- ");
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            switch (acc2.groups.length) {
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }

        //Question 7:
        //Sử dụng switch case để làm lại Question 4
        System.out.println("---------Question 7: Sử dụng switch case để làm lại Question 4--------- ");
        String positionName = acc1.position.name.toString();
        switch (positionName) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }

        //Question 8:
        //In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
        System.out.println("---------FOREACH Question 8:---------");
        Account[] accArray = {acc1, acc2, acc3};
        for (Account account : accArray) {
            System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName);
        }

        //Question 9:
        //In ra thông tin các phòng ban bao gồm: id và name
        System.out.println("---------Question 9: In thông tin phòng ban: ---------");
        Department[] depArray = {dep1, dep2, dep3};
        for (Department department : depArray) {
            System.out.println("DepID: " + department.id + " Name: " +
                    department.name);
        }

        //Question 10:
        //In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
        //họ theo định dạng như sau:
        //Thông tin account thứ 1 là:
        //Email: NguyenVanA@gmail.com
        //Full name: Nguyễn Văn A
        //Phòng ban: Sale
        //Thông tin account thứ 2 là:
        //Email: NguyenVanB@gmail.com
        //Full name: Nguyễn Văn B
        //Phòng ban: Marketting
        System.out.println("---------FOR Question 10: In thông tin account:---------");
        Account[] accArray1 = {acc1, acc2};
        for (int i = 0; i < accArray1.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray1[i].email);
            System.out.println("Full name: " + accArray1[i].fullName);
            System.out.println("Phòng ban: " + accArray1[i].department.name);
        }

        //Question 11:
        //In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
        //Thông tin department thứ 1 là:
        //Id: 1
        //Name: Sale
        //Thông tin department thứ 2 là:
        //Id: 2
        //Name: Marketing
        System.out.println(" ---------Question 11: Thông tin phòng ban:--------- ");
        Department[] depArray1 = {dep1, dep2, dep3};
        for (int i = 0; i < depArray1.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + depArray1[i].id);
            System.out.println("Name: " + depArray1[i].name);
        }

        //Question 12:
        //Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
        System.out.println("---------Question 12: Thông tin phòng ban:---------");
        Department[] depArray2 = {dep1, dep2, dep3};
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + depArray2[i].id);
            System.out.println("Name: " + depArray2[i].name);
        }

        //Question 13:
        //In ra thông tin tất cả các account ngoại trừ account thứ 2
        System.out.println("----------Question 13:In ra thông tin tất cả các account ngoại trừ account thứ 2: ------------ ");
        Account[] accArray2 = {acc1, acc2, acc3};
        for (int i = 0; i < accArray2.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accArray2[i].email);
                System.out.println("Full name: " + accArray2[i].fullName);
                System.out.println("Phòng ban: " + accArray2[i].department.name);
            }
        }

        //Question 14:
        //In ra thông tin tất cả các account có id < 4
        System.out.println("---------- Question 14: In ra thông tin tất cả các account có id < 4----------- ");
        Account[] accArray3 = {acc1, acc2, acc3};
        for (int j = 0; j < accArray3.length; j++) {
            if (accArray3[j].id < 4) {
                System.out.println("Thông tin account thứ " + (j + 1) + " là:");
                System.out.println("Email: " + accArray3[j].email);
                System.out.println("Full name: " + accArray3[j].fullName);
                System.out.println("Phòng ban: " + accArray3[j].department.name);
            }
        }

        //Question 15:
        //In ra các số chẵn nhỏ hơn hoặc bằng 20
        System.out.println("---------Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20-----------");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        // WHILE Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue
        // Question 16-10: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng
        System.out.println("---------FOR Question 16- 10: In thông tin account:--------- ");
        Account[] accArray4 = {acc1, acc2, acc3};
        int i = 0;
        while (i < accArray4.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accArray4[i].email);
            System.out.println("Full name: " + accArray4[i].fullName);
            System.out.println("Phòng ban: " + accArray4[i].department.name);
            i++;
        }

        //Question 16-11: In ra thông tin các phòng ban theo định dạng sau bao gồm: id và name
        System.out.println(" ---------Question 16-11: Thông tin phòng ban: --------- ");
        Department[] depArray3 = {dep1, dep2, dep3};
        int j = 0;
        while (j < depArray3.length) {
            System.out.println("Thông tin department thứ " + (j + 1) + " là:");
            System.out.println("Id: " + depArray3[j].id);
            System.out.println("Name: " + depArray3[j].name);
            j++;
        }

        //Question 16-12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
        System.out.println(" ---------Question 16-12: Thông tin phòng ban:---------");
        Department[] depArray4 = {dep1, dep2, dep3};
        int i1 = 0;
        while (i1 < 2) {
            System.out.println("Thông tin department thứ " + (i1 + 1) + " là:");
            System.out.println("Id: " + depArray4[i1].id);
            System.out.println("Name: " + depArray4[i1].name);
            i1++;
        }

        // Question 16-13: in ra thông tin tất cả các account ngoại trừ account thứ 2
        System.out.println("----------Question 16-13:In ra thông tin tất cả các account ngoại trừ account thứ 2: ------------ ");
        Account[] accArray5 = {acc1, acc2, acc3};
        int i2 = 0;
        while (i2 < accArray5.length) {
            if (i2 != 1) {
                System.out.println("Thông tin account thứ " + (i2 + 1) + " là:");
                System.out.println("Email: " + accArray5[i2].email);
                System.out.println("Full name: " + accArray5[i2].fullName);
                System.out.println("Phòng ban: " + accArray5[i2].department.name);
            }
            i2++;
        }

        // Question 16-14: In ra thông tin tất cả các account có id < 4
        System.out.println("---------- Question 16-14: In ra thông tin tất cả các account có id < 4----------- ");
        Account[] accArray6 = {acc1, acc2, acc3};
        int i3 = 0;
        while (i3 < accArray6.length) {
            if (accArray6[i3].id < 4) {
                System.out.println("Thông tin account thứ " + (i3 + 1) + " là:");
                System.out.println("Email: " + accArray6[i3].email);
                System.out.println("Full name: " + accArray6[i3].fullName);
                System.out.println("Phòng ban: " + accArray6[i3].department.name);
            }
            i3++;
        }

        // Question 16- 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
        System.out.println("---------Question 16- 15: In ra các số chẵn nhỏ hơn hoặc bằng 20-----------");
        int i4 = 1;
        while (i4 <= 20) {
            if (i4 % 2 == 0) {
                System.out.print(i4 + " ");
            }
            i4++;
        }

        //DO-WHILE Question 17: Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với lệnh break, continue
        // Question 17-10: In ra thông tin các account bao gồm: Email,FullName và tên phòng ban của họ theo định dạng
        System.out.println("---------FOR Question 17- 10: In thông tin account:---------");
        Account[] accArray7 = {acc1, acc2, acc3};
        int e = 0;
        do {
            System.out.println("Thông tin account thứ " + (e + 1) + " là:");
            System.out.println("Email: " + accArray7[e].email);
            System.out.println("Full name: " + accArray7[e].fullName);
            System.out.println("Phòng ban: " + accArray7[e].department.name);
            e++;
        } while (e < accArray7.length);

        // Question 17-11: In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau
        System.out.println("---------Question 17-11: Thông tin phòng ban:- --------");
        Department[] depArray5 = {dep1, dep2, dep3};
        int j2 = 0;
        do {
            System.out.println("Thông tin department thứ " + (j2 + 1) + " là:");
            System.out.println("Id: " + depArray5[j2].id);
            System.out.println("Name: " + depArray5[j2].name);
            j2++;
        } while (j2 < depArray5.length);

        //Question 17-12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
        System.out.println("---------Question 17-12: Thông tin phòng ban:---------");
        Department[] depArray6 = {dep1, dep2, dep3};
        int i5 = 0;
        do {
            System.out.println("Thông tin department thứ " + (i5 + 1) + " là:");
            System.out.println("Id: " + depArray6[i5].id);
            System.out.println("Name: " + depArray6[i5].name);
            i5++;
        } while (i5 < 2);

        //Question 17-13: in ra thông tin tất cả các account ngoại trừ account thứ 2
        System.out.println("----------Question 17-13:In ra thông tin tất cả các account ngoại trừ account thứ 2: ------------");
        Account[] accArray8 = {acc1, acc2, acc3};
        int i6 = 0;
        do {
            if (i6 != 1) {
                System.out.println("Thông tin account thứ " + (i6 +
                        1) + " là:");
                System.out.println("Email: " + accArray8[i6].email);
                System.out.println("Full name: " + accArray8[i6].fullName);
                System.out.println("Phòng ban: " + accArray8[i6].department.name);
            }
            i6++;
        } while (i6 < accArray8.length);

        // Question 17-14: In ra thông tin tất cả các account có id < 4
        System.out.println(" ---------- Question 17-14: In ra thông tin tất cả các account có id < 4 ----------- ");
        Account[] accArray9 = {acc1, acc2, acc3};
        int i7 = 0;
        do {
            if (accArray9[i7].id < 4) {
                System.out.println("Thông tin account thứ " + (i7 + 1) + " là:");
                System.out.println("Email: " + accArray9[i7].email);
                System.out.println("Full name: " + accArray9[i7].fullName);
                System.out.println("Phòng ban: " + accArray9[i7].department.name);
            }
            i7++;
        } while (i7 < accArray9.length);

        // Question 17- 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
        System.out.println("---------Question 17- 15: In ra các số chẵn nhỏ hơn hoặc bằng 20-----------");
        int i8 = 1;
        do {
            if (i8 % 2 == 0) {
                System.out.println(i8 + " ");
            }
            i8++;
        } while (i8 <= 20);

        //Exercise 2 (Optional): System out printf
        //Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
        System.out.println("------------Exercise 2 (Optional): System out printf------------");
        System.out.println("------------Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó------------");
        int a = 5;
        System.out.printf("%d%n", a);

        //Question 2:
        //Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        //ra số nguyên đó thành định dạng như sau: 100,000,000
        System.out.println("------------Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó ------------");
        int s = 100000000;
        System.out.printf(Locale.US, "%,d%n", s);

        //Question 3:
        //Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        //thực đó chỉ bao gồm 4 số đằng sau
        System.out.println("-------------Question 3:-------------");
        float c = 5.567098f;
        System.out.printf("%5.4f%n", c);

        //Question 4:
        //Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        //dạng như sau:
        //Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        //Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
        System.out.println("-------------Question 4:-------------");
        String q = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"" + q + "\" và tôi đang độc thân\n");

        //Question 5:
        //Lấy thời gian bây giờ và in ra theo định dạng sau:
        //24/04/2020 11h:16p:20s
        System.out.println("-------------Question 5:-------------");
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        //Question 6:
        //In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
        //table (giống trong Database)
        System.out.println("┌─────────────────────────┬──────────────────────┬─────────────────┐");
        System.out.println("│ EMAIL                   │ FULL NAME            │ DEPARTMENT      │");
        System.out.println("├─────────────────────────┼──────────────────────┼─────────────────┤");

        for (Account account : accArray) {
            System.out.printf(
                    "│ %-23s │ %-20s │ %-15s │%n",
                    account.email,
                    account.fullName,
                    account.department.name
            );
        }
        System.out.println("└─────────────────────────┴──────────────────────┴─────────────────┘");

        //Exercise 3 (Optional): Date Format
        //Question 1:
        //In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
        //dạng vietnamese

        System.out.println("-------------Exercise 3 (Optional): Date Format-------------");
        System.out.println("-------------Question 1:-------------");
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd 'tháng' MM 'năm' yyyy",
                        new Locale("vi", "VN"));
        String date1 = formatter.format(exam1.createDate);
        System.out.println(exam1.code + ": " + date1);

        //Question 2:
        //In ra thông tin: Exam đã tạo ngày nào theo định dạng
        //Năm – tháng – ngày – giờ – phút – giây
        System.out.println("-------------Question 2:-------------");
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("dd 'tháng' MM 'năm' yyyy - HH 'Giờ' mm 'Phút' ss 'giây'");

        Exam[] exams2 = { exam1, exam2 };

        for (Exam exam : exams2) {
            String date2 = formatter2.format(exam.createDate);
            System.out.println(exam.code + ": " + date2);
        }

        //Question 3:
        //Chỉ in ra năm của create date property trong Question 2
        System.out.println("-------------Question 3:-------------");
        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofPattern("'năm' yyyy");
        for (Exam exam : exams) {
            String date3 = formatter3.format(exam.createDate);
            System.out.println(exam.code + ": " + date3);
        }

        //Question 4:
        //Chỉ in ra tháng và năm của create date property trong Question 2
        System.out.println("-------------Question 4:-------------");
        DateTimeFormatter formatter4 =
                DateTimeFormatter.ofPattern("'tháng' MM 'năm' yyyy");
        for (Exam exam : exams) {
            String date4 = formatter4.format(exam.createDate);
            System.out.println(exam.code + ": " + date4);
        }

        //Question 5:
        //Chỉ in ra "MM-DD" của create date trong Question 2
        System.out.println("-------------Question 5:-------------");

        for (Exam exam : exams2) {
            String date5 = formatter4.format(exam.createDate);
            System.out.println(exam.code + ": " + date5);
        }

        //Exercise 4 (Optional): Random Number
        //Question 1:
        //In ngẫu nhiên ra 1 số nguyên
        System.out.println("-----------Question 1: In ngẫu nhiên ra 1 số nguyên-------------");
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("Số ngẫu nhiên: " + n);

        //Question 2:
        //In ngẫu nhiên ra 1 số thực
        System.out.println("--------------Question 2: In ngẫu nhiên ra 1 số thực----------------");
        float f = random.nextFloat();
        System.out.println("Số ngẫu nhiên: " + f);

        //Question 3:
        //Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
        //ra tên của 1 bạn
        System.out.println("--------------Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn----------------");

        String[] nameArr = { "Trường", "Tuấn Anh", "Vương", "Vân", "Ly" };
        int d = random.nextInt(nameArr.length);
        System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " + nameArr[d]);

        //Question 4:
        //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
        System.out.println("--------------Question 4:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995----------------");

        // Ngày bắt đầu và kết thúc
        LocalDate startDate = LocalDate.of(1995, 7, 24);
        LocalDate endDate   = LocalDate.of(1995, 12, 20);

        // Tính số ngày giữa 2 mốc
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        // Random số ngày
        Random r = new Random();
        long randomDays = r.nextInt((int) daysBetween + 1);

        // Ngày ngẫu nhiên
        LocalDate randomDate = startDate.plusDays(randomDays);

        System.out.println("Tính số ngày giữa 2 mốc: " + daysBetween);
        System.out.println("Random số ngày: " + randomDays);
        System.out.println("Ngày ngẫu nhiên: " + randomDate);

        //Question 5:
        //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
        System.out.println("--------------Question 5:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây----------------");
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);

        long daysBetween5 = ChronoUnit.DAYS.between(oneYearAgo, today);

        Random random5 = new Random();
        long randomDays5 = random5.nextInt((int) daysBetween5 + 1);

        LocalDate randomDate5 = oneYearAgo.plusDays(randomDays5);

        System.out.println("Ngày ngẫu nhiên trong 1 năm gần đây: " + randomDate5);

        //Question 6:
        //Lấy ngẫu nhiên 1 ngày trong quá khứ
        // Ngày bắt đầu và kết thúc
        System.out.println("--------------Question 6:Lấy ngẫu nhiên 1 ngày trong quá khứ:----------------");
        LocalDate startDate6 = LocalDate.of(1930, 7, 24);
        LocalDate endDate6   = LocalDate.now();

        // Tính số ngày giữa 2 mốc
        long daysBetween6 = ChronoUnit.DAYS.between(startDate6, endDate6);

        // Random số ngày
        Random u = new Random();
        long randomDays6 = u.nextInt((int) daysBetween6 + 1);

        // Ngày ngẫu nhiên
        LocalDate randomDate6 = startDate6.plusDays(randomDays6);

        System.out.println("Tính số ngày giữa 2 mốc: " + daysBetween6);
        System.out.println("Random số ngày: " + randomDays6);
        System.out.println("Lấy ngẫu nhiên 1 ngày trong quá khứ: " + randomDate6);

        //Question 7:
        //Lấy ngẫu nhiên 1 số có 3 chữ số
        System.out.println("--------------Question 7:Lấy ngẫu nhiên 1 số có 3 chữ số:----------------");

        int z = random.nextInt(999 - 100 + 1) + 100; // Công thức: (số max - số min + 1) + số min
        System.out.println(z);

        //Exercise 5: Input from console
        System.out.println("--------------QExercise 5: Input from console:----------------");
        //question1();
        //question2();
        //question3();
        //question4();
        //question5();
        //question6();
        //question7();
        //question8();
        //question9();
        //question10();
        //question11();
        //Exercise6_question1();
        //Exercise6_question2();
        Exercise6_question3();
    }
    private static void question1() {
        System.out.println("--------------Question 1:Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 3 số nguyên");
        System.out.println("Nhập vào số 1: ");
        int o = sc.nextInt();
        System.out.println("Nhập vào số 2: ");
        int k = sc.nextInt();
        System.out.println("Nhập vào số 3: ");
        int m = sc.nextInt();
        System.out.println("Bạn vừa nhập vào các số: " + o + " " + k + " " + m);
    }

    private static void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình-------------------");
        System.out.println("Mời bạn nhập vào 2 số thực");
        System.out.println("Nhập vào số 1: ");
        float f1 = sc.nextFloat();
        System.out.println("Nhập vào số 2: ");
        float f2 = sc.nextFloat();
        System.out.println("Bạn vừa nhập vào các số: " + f1 + " " + f2);
    }

    private static void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Question 3: Viết lệnh cho phép người dùng nhập họ và tên----------------");
        System.out.println("Mời bạn nhập vào Họ: ");
        String s1 = sc.next();
        System.out.println("Mời bạn nhập vào Tên: ");
        String s2 = sc.next();
        System.out.println("Fullname của bạn là:" + s1 + " " + s2);
    }

    private static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ----------------");

        System.out.println("Mời bạn nhập vào năm sinh: ");
        int year = sc.nextInt();
        System.out.println("Mời bạn nhập vào tháng sinh: ");
        int month = sc.nextInt();
        System.out.println("Mời bạn nhập vào ngày sinh: ");
        int day = sc.nextInt();
        LocalDate dateBirth = LocalDate.of(year, month, day);
        System.out.println("Ngày sinh của bạn là: " + dateBirth);
    }

    private static void question5() {
        System.out.println("-------------Question 5: Viết lệnh cho phép người dùng tạo account (viết thành method)\n" +
                "Đối với property Position, Người dùng nhập vào 1 2 3 4 và vào\n" +
                "chương trình sẽ chuyển thành Position.Dev, Position.Test,\n" +
                "Position.ScrumMaster, Position.PM----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin account cân tạo: ");

        Account acc = new Account();
        System.out.println("Nhập ID: ");

        acc.id = sc.nextInt();
        System.out.println("Nhập email: ");
        acc.email = sc.next();
        System.out.println("Nhập userName: ");
        acc.userName = sc.next();
        System.out.println("Nhập fullName: ");
        acc.fullName = sc.nextLine();
        System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");

        int posNum = sc.nextInt();
        switch (posNum) {
            case 1:
                Position pos1 = new Position();
                pos1.name = Position.PositionName.Dev;
                acc.position = pos1;
                break;
            case 2:
                Position pos2 = new Position();
                pos2.name = Position.PositionName.Test;
                acc.position = pos2;
                break;
            case 3:
                Position pos3 = new Position();
                pos3.name = Position.PositionName.Scrum_Master;
                acc.position = pos3;
                break;
            case 4:
                Position pos4 = new Position();
                pos4.name = Position.PositionName.PM;
                acc.position = pos4;
                break;
        }
        System.out.println("Thông tin Acc vừa nhập, ID: " + acc.id +
                " Email: " + acc.email +
                " UserName: " + acc.userName +
                " FullName: " + acc.fullName +
                " Position: " + acc.position.name);
    }

    private static void question6() {

        System.out.println("-------------Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)-------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin Department cân tạo: ");

        Department dep = new Department();
        System.out.println("Nhập ID: ");
        dep.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Name: ");
        dep.name = sc.nextLine();
        System.out.println("Thông tin Department vừa nhập, ID: " + dep.id + " Name: " + dep.name);
    }

    private static void question7() {
        System.out.println("-------------Question 7: Nhập số chẵn từ console-------------");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hãy nhập vào 1 số chẵn: ");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Bạm vừa nhập vào:" + a + " là số chẵn");
                return;
            } else {
                System.out.println("Nhập sai, đây không phải là số chẵn");
            }
        }
    }

    private static void question8() {
        System.out.println("-------------Question 8: Viết chương trình thực hiện theo flow-------------");

        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department");

            choose = sc.nextInt();
            if (choose == 1 || choose == 2) {
                switch (choose) {
                    case 1:
                        question5();
                        break;
                    case 2:
                        question7();
                        break;
                }
                return;
            } else {
                System.out.println("Nhập lại: ");
            }
        }
    }

    private static void question9() {
        System.out.println("-------------Question 9: Viết method cho phép người dùng thêm group vào account theo flow sau:\n" +
                "Bước 1:\n" +
                "In ra tên các usernames của user cho người dùng xem\n" +
                "Bước 2:\n" +
                "Yêu cầu người dùng nhập vào username của account\n" +
                "Bước 3:\n" +
                "In ra tên các group cho người dùng xem\n" +
                "Bước 4:\n" +
                "Yêu cầu người dùng nhập vào tên của group\n" +
                "Bước 5:\n" +
                "Dựa vào username và tên của group người dùng vừa chọn, hãy\n" +
                "thêm account vào group đó .-------------");
        Scanner sc = new Scanner(System.in);
        // Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing_System";
        group1.createDate = LocalDateTime.of(2021, 1, 1,0,0,0);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        group2.createDate = LocalDateTime.of(2020, 2, 1,0,0,0);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDateTime.of(2019, 9, 23,0,0,0);

        // Tạo Account

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.userName = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.createDate = LocalDateTime.now();
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.userName = "daonq2";
        acc2.fullName = "Dao Nguyen 2";
        acc2.createDate = LocalDateTime.of(2021, 03, 17,0,0,0);
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.userName = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.createDate = LocalDateTime.now();

        Account[] accArray = { acc1, acc2, acc3 };
        Group[] groupArray = { group1, group2, group3 };
        System.out.println("Danh sách User đang có trên hệ thống: ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(accArray[i].userName);
        }
        System.out.println("Nhập vào UserName của account: ");
        String userName = sc.next();
        System.out.println("Danh sách Group đang có trên hệ thống: ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(groupArray[i].name);
        }
        System.out.println("Nhập vào tên Group cần thêm: ");
        String groupName = sc.next();
        int indexGroup = -1;
        for (int i = 0; i < groupArray.length; i++) {
            if (groupArray[i].name.equals(groupName)) {
                indexGroup = i;
            }
        }
        int indexAccount = -1;
        for (int j = 0; j < accArray.length; j++) {
            if (accArray[j].userName.equals(userName)) {
                indexAccount = j;
            }
        }
        if (indexAccount < 0 || indexGroup < 0) {
            System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account hoặc group này trên hệ thống");

        } else {
            for (int j = 0; j < accArray.length; j++) {
                if (accArray[j].userName.equals(userName)) {
                    Group[] gpAdd = { groupArray[indexGroup] };
                    accArray[j].groups = gpAdd;
                    System.out.println( "Bạn vừa Add group: " + accArray[indexAccount].groups[0].name +
                                        " cho Account: " + accArray[indexAccount].userName);
                }
            }
        }
    }

    private static void question10() {
        System.out.println("-------------Question 8: Viết chương trình thực hiện theo flow-------------");

        Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department, 3.Add Group vào Account");
            choose = sc.nextInt();
            if (choose == 1 || choose == 2 || choose == 3) {
                switch (choose) {
                    case 1:
                        question5();
                        break;
                    case 2:
                        question7();
                        break;
                    case 3:
                        question9();
                        break;
                }
                System.out.println("Bạn có muốn tiếp tục không, hãy chọn Menu, Chọn 0 để thoát chương trình!");
                int ak = sc.nextInt();
                if (ak == 0) {
                    System.out.println("Bye!!!");
                    return;
                }
            } else {
                System.out.println("Nhập lại: ");
            }
        }
    }

    private static void question11() {
        System.out.println("-------------Bổ sung thêm vào bước 2 của Question 8 như sau:\n" +
                "Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account\n" +
                "vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:\n" +
                "Bước 1:\n" +
                "In ra tên các usernames của user cho người dùng xem\n" +
                "6\n" +
                "Bước 2:\n" +
                "Yêu cầu người dùng nhập vào username của account\n" +
                "Bước 3:\n" +
                "Sau đó chương trình sẽ chọn ngẫu nhiên 1 group\n" +
                "Bước 4:\n" +
                "Thêm account vào group chương trình vừa chọn ngẫu nhiên-------------");

                Scanner sc = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department, 3.Add Group vào Account, 4. Thêm Account vào 1 nhóm ngẫu nhiên");

            choose = sc.nextInt();
            if (choose == 1 || choose == 2 || choose == 3 || choose == 4) {

                switch (choose) {
                    case 1:
                        question5();
                        break;
                    case 2:
                        question7();
                        break;
                    case 3:
                        question9();
                        break;
                    case 4:
                        addAccountToRandomGroup();
                        break;
                }
                System.out.println("Bạn có muốn tiếp tục không, hãy chọn Menu, Chọn 0 để thoát chương trình!");
                int ak = sc.nextInt();
                if (ak == 0) {
                    System.out.println("Bye!!!");
                    return;
                }
            } else {
                System.out.println("Nhập lại: ");

            }
        }
    }
    private static void addAccountToRandomGroup() {
        Scanner sc = new Scanner(System.in);
// Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing_System";
        group1.createDate = LocalDateTime.of(2021,10,1,0,0,0);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        group2.createDate = LocalDateTime.of(2020, 2, 1,0,0,0);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDateTime.of(2019, 9, 23,0,0,0);

// Tạo Account

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.userName = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.createDate = LocalDateTime.now();
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.userName = "daonq2";
        acc2.fullName = "Dao Nguyen 2";
        acc2.createDate = LocalDateTime.of(2021, 03, 17,0,0,0);
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.userName = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.createDate = LocalDateTime.now();
        Account[] accArray = { acc1, acc2, acc3 };
        Group[] groupArray = { group1, group2, group3 };
        System.out.println("Danh sách User đang có trên hệ thống: ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(accArray[i].userName);
        }
        System.out.println("Nhập vào UserName của account: ");
        String userName = sc.nextLine();
        System.out.println("Danh sách Group đang có trên hệ thống: ");
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(groupArray[i].name);
        }

        Random random = new Random();
        int indexGroup = random.nextInt(2);
        int indexAccount = -1;
        for (int j = 0; j < accArray.length; j++) {
            if (accArray[j].userName.equals(userName)) {
                indexAccount = j;
            }
        }
        if (indexAccount < 0) {
            System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account này trên hệ thống");

        } else {
            for (int j = 0; j < accArray.length; j++) {
                if (accArray[j].userName.equals(userName)) {
                    Group[] gpAdd = { groupArray[indexGroup] };
                    accArray[j].groups = gpAdd;
                    System.out.println("Bạn vừa Add group: " + accArray[indexAccount].groups[0].name + " cho Account: " + accArray[indexAccount].userName);
                }
            }
        }
    }

    private static void Exercise6_question1() {
        System.out.println("-------------Exercise 6_Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10-------------");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    private static void Exercise6_question2() {
        System.out.println("-------------Exercise 6_Question 2: Tạo method để in thông tin các account-------------");
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.userName = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.createDate = LocalDateTime.now();
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.userName = "daonq2";

        acc2.fullName = "Dao Nguyen 2";
        acc2.createDate = LocalDateTime.of(2021, 03, 17,0,0,0);
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.userName = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.createDate = LocalDateTime.now();
        printAccount(acc1);
        printAccount(acc2);
        printAccount(acc3);
    }
    private static void printAccount(Account account) {
        System.out.println( "ID: " + account.id +
                            " Email: " + account.email +
                            " Username: " + account.userName +
                            " FullName: " + account.fullName +
                            " CreareDate: " + account.createDate);
    }

    private static void Exercise6_question3() {
        System.out.println("-------------Exercise 6_Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10-------------");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

}
