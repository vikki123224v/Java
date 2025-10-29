public class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return this.age+""+this.name;
    }
    public static void main(String[] args) {
        Student s1 = new Student(20, "vikki");
        Student s2 = new Student(22, "john");

Student[] s=new Student[2];
s[0]=s1;
s[1]=s2;
        System.out.println(s1.age + " " + s1.name);
        System.out.println(s2.age + " " + s2.name);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].age + " " + s[i].name);
        }
        
    }
}