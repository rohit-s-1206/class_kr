public class Student {
  private String name;
  private int id;
  private String email;
  private String program;

  public Student(String name, int id, String email, String program) {
    this.name = name;
    this.id = id;
    this.email = email;
    this.program = program;
  }

  public void registerForClass(Class course) {
    // add the student to the class's roster
  }

  public void provideFeedback(Instructor instructor, Class course, String content) {
    // add the feedback to the instructor's record
  }

  public Record getRecord() {
    // retrieve the student's record
  }
}

public class Class {
  private String name;
  private String number;
  private Instructor instructor;
  private List<Student> roster;
  private Schedule schedule;

  public Class(String name, String number, Instructor instructor, Schedule schedule) {
    this.name = name;
    this.number = number;
    this.instructor = instructor;
    this.schedule = schedule;
    roster = new ArrayList<>();
  }

  public void addStudent(Student student) {
    roster.add(student);
  }

  public void removeStudent(Student student) {
    roster.remove(student);
  }

  public List<Student> getRoster() {
    return roster;
  }

  public Schedule getSchedule() {
    return schedule;
  }
}

public class Enrollment {
  private Student student;
  private Class course;
  private Date date;

  public Enrollment(Student student, Class course, Date date) {
    this.student = student;
    this.course = course;
    this.date = date;
  }

  public Student getStudent() {
    return student;
  }

  public Class getCourse() {
    return course;
  }

  public Date getDate() {
    return date;
  }
}

public class Feedback {
  private Student student;
  private Instructor instructor;
  private Class course;
  private String content;
  private Date date;

  public Feedback(Student student, Instructor instructor, Class course, String content, Date date) {
    this.student = student;
    this.instructor = instructor;
    this.course = course;
    this.content = content;
    this.date = date;
  }

  public Student getStudent() {
    return student;
  }
