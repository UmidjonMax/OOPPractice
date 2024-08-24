public class Main {
    public static void main(String[] args) {
        Person person = new Person("Elbek", "Quvasoy 55");
        System.out.println(person.toString());

        Student student = new Student("Axmad", "Yangiyo'l", "Python", 4, 7091000);
        System.out.println(student.toString());

        Staff staff = new Staff("Sherdil", "Sariosiyo", "TATU", 2000);
        System.out.println(staff.toString());
    }
}