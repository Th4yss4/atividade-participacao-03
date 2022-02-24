package questao1;

public class App {

  public static void printStudent(Student student) {
    System.out.println(student.getName() + ", " + student.getAge() + " anos");
  }

  public static void main(String[] args) throws Exception {
    StudentRepository studentRepo = new StudentRepository();
    ArrayList<Student> students = studentRepo.findAll();
    int ageSum = 0;

    studentRepo.add(new Student("João", 20));
    studentRepo.add(new Student("Maria", 21));
    studentRepo.add(new Student("José", 20));
    studentRepo.add(new Student("Pedro", 21));
    studentRepo.add(new Student("Ana", 24));

    ArrayList<Student> oldestStudents = studentRepo.findOldestStudents();
    ArrayList<Student> youngestStudents = studentRepo.findYoungestStudents();

    System.out.println("Aluno(s) mais velho(s):");
    oldestStudents.forEach(App::printStudent);

    System.out.println("\nAluno(s) mais novo(s):");
    youngestStudents.forEach(App::printStudent);

    for (Student student : students)
      ageSum += student.getAge();

    System.out.println("\nA média de idade é: " + ageSum / students.size());

  }
}
