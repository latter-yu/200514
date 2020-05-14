import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntroduction {
    static class Student {
        public String name;
        public int age;
        public String grade;
        public String school;

        public Student(String name, int age, String grade, String school) {
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.school = school;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", grade='" + grade + '\'' +
                    ", school='" + school + '\'' +
                    '}';
        }
    }

    public static class TestMap {
        public static void main(String[] args) {
            Student s1 = new Student("淘气", 20, "优", "第一大学");
            Student s2 = new Student("笑笑", 30, "良", "第二大学");
            Student s3 = new Student("李华", 40, "及格", "倒一大学");

            Map<String, Student> studentMap = new HashMap<>();
            studentMap.put(s1.name, s1);
            studentMap.put(s2.name, s2);
            studentMap.put(s3.name, s3);

            // 当前键值对 name -> student. 给定姓名就可以查找到对应的学生信息
            String name = "淘气";

            Student student = studentMap.get(name);
            System.out.println(student);

            Student s4 = new Student("淘气", 100, "大一", "社会大学");
            studentMap.put(s4.name, s4);

            Student student2 = studentMap.get(name);
            System.out.println(student2);

            // 遍历一个 Map
            // Entry：条目. 也就是键值对.
            for (HashMap.Entry<String, Student> entry : studentMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            //迭代器遍历
            Iterator<Map.Entry<String, Student>> iterator = studentMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Student> entry = iterator.next();
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // 如果想按照其他映射来查找, 例如按年龄, 就需要其他的 Map
//        Map<Integer, Student> studentMap2 = new HashMap<>();
//        studentMap2.put(s1.age, s1);
//        studentMap2.put(s2.age, s2);
//        studentMap2.put(s3.age, s3);
//
//        Student student2 = studentMap2.get(20);
//        System.out.println(student2);
        }
    }
}
