package exercises4_2;

public class TestMain {
    public static void main(String[] args) {

        Person person = new Person("Azizbek", "Toshkent");
        System.out.println(person);
        person.setAddress("Fargona");
        System.out.println("Updated address: " + person.getAddress());

        Student student = new Student("Vali", "Buxoro", "Computer Science", 2, 2500.0);
        System.out.println(student);
        student.setProgram("Software Engineering");
        student.setYear(3);
        student.setFee(3000.0);
        System.out.println("Updated Student: " + student);

        Staff staff = new Staff("Hasan", "Farg‘ona", "TATU", 5000.0);
        System.out.println(staff);
        staff.setSchool("INHA University");
        staff.setPay(5500.0);
        System.out.println("Updated Staff: " + staff);
    }
}
