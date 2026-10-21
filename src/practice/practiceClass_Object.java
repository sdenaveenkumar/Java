package practice;
class Student {
    public String name;
    public int classes;
    public char section;

    public Student(String name, int classes, char section){
        this.name = name;
        this.classes = classes;
        this.section = section;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int classes) {
        this.name = name;
        this.classes = classes;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }



    public void setSection(char section) {
        this.section = section;
    }

    public char getSection() {
        return  section;
    }

    //method

    public void printName() {
        System.out.println(name);
    }
    public void printClass() {
        System.out.println(classes);
    }

    public void printSection(){
        System.out.println(section);
    }

}

public class practiceClass_Object {
    static void main() {
        Student s1 = new Student("naveen kumar");
        s1.setClasses(9);
        s1.setSection('A');

        //calling function

        s1.printName();
        s1.printClass();
        s1.printSection();
    }
}
