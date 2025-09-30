public class Employee {
    private String name;
    private String department;
    private String dateOfEntry;
    private String rg;
    private double salary;

    public void receivesRaise( double raise ) {
        salary = salary + raise;
    }

    public double calculatesYearlyIncome() {
        return salary * 12;
    }

    public void showsData() {
        System.out.println( "Employee's name: " + getName() );
        System.out.println( "Employee's department: " + getDepartment() );
        System.out.println( "Employee's date of entry: " + getDateOfEntry() );
        System.out.println( "Employee's RG: " + getRg() );
        System.out.println( "Employee's salary: " + getSalary() );
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public String getRg() {
        return rg;
    }

    public double getSalary() {
        return salary;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setDepartment( String department ) {
        this.department = department;
    }

    public void setDateOfEntry( String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public void setRg( String rg ) {
        this.rg = rg;
    }

    public void setSalary( double salary ) {
        this.salary = salary;
    }

    public static void main (String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setName( "Roberto da Silva Salve" );
        employee1.setDepartment( "Support" );
        employee1.setDateOfEntry( "21/12/2022 ");
        employee1.setRg( "012.345.678-90" );
        employee1.setSalary( 1950 );

        employee2.setName( "Amanda Rhondon" );
        employee2.setDepartment( "R&D" );
        employee2.setDateOfEntry( "16/07/2019 ");
        employee2.setRg( "098.765.432-10" );
        employee2.setSalary( 4500 );

        System.out.println( employee1.getName() + "'s salary before raise: " + employee1.getSalary() );
        employee1.receivesRaise( 1000 );
        System.out.println( employee1.getName() + "'s salary after raise: " + employee1.getSalary() );

        System.out.println( employee1.getName() + "'s yearly salary: " + employee1.calculatesYearlyIncome() );
        System.out.println( employee2.getName() + "'s yearly salary: " + employee2.calculatesYearlyIncome() );

        System.out.println();

        System.out.println( "Employee 1 info:" ); employee1.showsData();
        System.out.println( "Employee 2 info:" ); employee2.showsData();
    }
}