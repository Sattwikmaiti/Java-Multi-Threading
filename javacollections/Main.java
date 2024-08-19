
public class Main {

    public static void main(String[] args) {

        // List<Student> arr = new ArrayList<>();
        // arr.add(new Student("John", 20, "New York"));
        // arr.add(new Student("Doe", 21, "California"));
        // arr.add(new Student("PAn", 32, "Hello"));

        // arr.set(2, new Student("Ho", 4, "s"));
        // for (Student s : arr) {
        //     System.out.println(s.getName() + " age " + s.getAge());
        // }

    //     Stack<Student> stk=new Stack<>();
    //     stk.push(new Student("Holl",3,"Tt"));
    //     stk.push(new Student("Holfl",3,"Tt"));
    //     stk.push(new Student("Holl",3,"Tt"));
    //     Student tp=stk.peek();
    //     System.out.println(tp);
    //     stk.pop();

        

    //   while(!stk.isEmpty())
    //     {
    //         Student s=stk.pop();
    //         System.out.println(s.getName());
    //     }

        
    }

}

class Student {

    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
