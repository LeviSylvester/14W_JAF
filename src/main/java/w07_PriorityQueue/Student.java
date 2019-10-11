package w07_PriorityQueue;

class Student {
    private int token;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
//        super();
        this.token = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getToken() {
        return this.token;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }
}