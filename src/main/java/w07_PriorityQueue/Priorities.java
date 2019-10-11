package w07_PriorityQueue;

import java.util.*;

class Priorities {
    //couldn't get it to work correctly by myself, found a solution on Discussions and modified
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName).
                        thenComparing(Student::getToken));

        List<Student> students = new ArrayList<>();
        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int token = in.nextInt();

                Student student = new Student(token, name, cgpa);
                studentPriorityQueue.add(student);
            } else if (event.equals("SERVED")) {
                /*Student served = */
                studentPriorityQueue.poll();
            }
            in.close();
        }
//        Student served = studentPriorityQueue.poll();
//        if (served == null) {
//            return students;
//        } else {
//            while (served != null) {
//                students.add(served);
//                served = studentPriorityQueue.poll();
//            }
//        return students;
        while (!studentPriorityQueue.isEmpty()) {
            students.add(studentPriorityQueue.poll());
        }
        return students;
    }
}
