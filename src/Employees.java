public class Employees {
    private String name;
    private String surname;
    private String JobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employees(String name,String surname,String JobTitle,String email,String phoneNumber,int salary,int age){
        this.name = name;
        this.surname = surname;
        this.JobTitle = JobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void info(){
        System.out.println(
                name + " " + surname + "\n"
                + "Age: " + age + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Email: " + email + "\n"
                + "Job Title: " + JobTitle + "\n"
                + "Salary: " + salary + "\n");
    }
}
