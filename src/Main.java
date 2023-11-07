import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {




        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Ban");
        apartment1.setAddress("Batken");
        apartment1.setPrice(30000);

        Apartment apartment2 = new Apartment();
        apartment2.setTitle("Ak ordo");
        apartment2.setAddress("Chon kara");
        apartment2.setPrice(30000);

        Apartment [] apartments = {apartment1,apartment2};














        Student student1 = new Student();
        student1.setFullName("Zaripbek Kursanov");
        student1.setPhoneNumber(0700402002);
        student1.setAddress("Batken");
        student1.setBankAccount(20000);
        Student student2 = new Student();
        student2.setFullName("Asan Kursanov");
        student2.setPhoneNumber(0700402002);
        student2.setAddress("Batken");
        student2.setBankAccount(20000);
        Student student3 = new Student();
        student3.setFullName("Bakir Kursanov");
        student3.setPhoneNumber(0700402002);
        student3.setAddress("Batken");
        student3.setBankAccount(20000);
        Student student4 = new Student();
        student4.setFullName("Marat Kursanov");
        student4.setPhoneNumber(0700402002);
        student4.setAddress("Chon kara");
        student4.setBankAccount(20000);
        Student student5 = new Student();
        student5.setFullName("Dastan Kursanov");
        student5.setPhoneNumber(0700402002);
        student5.setAddress("Chon kara");
        student5.setBankAccount(20000);
        Student student6 = new Student();
        student6.setFullName("Kylymbek Kursanov");
        student6.setPhoneNumber(0700402002);
        student6.setAddress("Chon kara");
        student6.setBankAccount(20000);
        Student [] arrayStudentsFromPay = {student1,student2,student3,student4,student5,student6};













        method(student1,student2,student3,student4,student5,student6);


        Apartment apartment = new Apartment();
        apartment.methodPay(arrayStudentsFromPay);





    }



    public static void method ( Student  student1,Student student2, Student student3,Student student4,Student student5, Student student6 ){

        System.out.println("Write apartment:");
        System.out.println("(Batken || Chon kara)");
        String soz = scanner.nextLine();
        Student [] studentsInBatken = {student1,student2,student3};
        Student [] studentsInChonKara = {student4,student5,student6};

        if (studentsInBatken [0].getAddress().equals(soz) && studentsInBatken [1].getAddress().equals(soz) && studentsInBatken [2].getAddress().equals(soz) ){
            System.out.println("Students life in  Batken:");
            for (Student  b : studentsInBatken) {
                System.out.println(b);
            }
        } else if (studentsInChonKara [0].getAddress().equals(soz) && studentsInChonKara [1].getAddress().equals(soz) && studentsInChonKara [2].getAddress().equals(soz)) {
            System.out.println("Students life in Chon Kara:");
            for (Student ch: studentsInChonKara) {

                System.out.println(ch);
            }
        }else System.err.println("error");


    }










    }




