public class Main {
    public static void main(String[] args) {

        Employees[] employeesArray = new Employees[5];

        employeesArray[0] = new Employees("Andriy","Nikolayev","Chief","andriynikolayev44@gmail.com","3248297533",3200,24);
        employeesArray[1] = new Employees("Lesego","Cabdiraxmaan","Programmer","lablaAalbla@gmail.com","3295762367",2100,35);
        employeesArray[2] = new Employees("Sol","Goodman","Lawyer","someEmail@gmail.com","3295678955", 5000,43);
        employeesArray[3] = new Employees("Mandla","Sibonakaliso","Secyrity tester","forstaf@gmail.com","3251547288",1800,19);
        employeesArray[4] = new Employees("Volker","Leonhard","Marketer","midORfeed@gmail.com","3288263859",4400,58);

        ageFilter(40,employeesArray);
        salaryFilter(0, 6000, employeesArray);

    }

    public static void ageFilter (int age, Employees[] arrEmployees){
        for (int i = 0; i < arrEmployees.length; i++) {
            if (arrEmployees[i].getAge() >= age){
                arrEmployees[i].info();
            }
        }
    }
    public static void salaryFilter (int minSalary, int maxSalary, Employees[] arrEmployees){
        for (int i = 0; i < arrEmployees.length; i++) {
            if (arrEmployees[i].getSalary() >= minSalary && arrEmployees[i].getSalary() <= maxSalary ){
                arrEmployees[i].info();
            }
        }
    }
}
