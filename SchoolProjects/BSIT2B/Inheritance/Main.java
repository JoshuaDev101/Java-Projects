
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Nick", 67);
        p1.displayPerson();


        System.out.println("========================================================================================");
        Boy b1 = new Boy("Joshua", 19, "Tralalelort TralaGAY", 67);
        b1.DihsplayBoy();
        System.out.println("========================================================================================");
        Student s1 = new Student("Joshua", 19,"Tralalelort TralaGAY" , 67, "BSIT", 2);
        s1.dihsplayStudent();
    }
}

class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }
    String getName(){
        return name;
    }

    void displayPerson() {
        System.out.println("");
        System.out.println("Class Person");
        System.out.println("name:" + name);
        System.out.println("age: " + age);
    }

}

class Boy extends Person {

    private String gunName;
    private int killCount;

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public int getKillCount() {
        return killCount;
    }

    public void setKillCount(int killcount) {
        this.killCount = killcount;
    }

    public Boy(String name, int Age, String gunName, int killCount) {
        super(name, Age);
        this.gunName = gunName;
        this.killCount = killCount;
    }

    void DihsplayBoy() {
        System.out.println("");
        System.out.println("Boy extends Person");
        System.out.println("Name: " + getName());
        System.out.println("Kills: " + killCount);
        System.out.println("Gun used: " + gunName);
        System.out.println("age: " + getAge() + " yors eld");

    }

}

class Student extends Boy {

    private String section;
    private int year;
    String getSection(){
        return section;
    }
    int getYear(){
        return year;
    }
    
    public Student(String name, int age, String gunName,int killCount, String section, int year) {
        super(name, age, gunName,killCount);
        this.section = section;
        this.year = year;
    }

    void dihsplayStudent() {
        System.out.println("");
        System.out.println("Student extends Boy");
        System.out.println("name: " + getName());
        System.out.println("age: " + getAge());
        System.out.println("Kills: " + getKillCount());
        System.out.println("Gun used: " + getGunName());
        System.out.println("section: " + section);
        System.out.println("year: " + year);
    }
}
