class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("---------------------------");
    }
}
