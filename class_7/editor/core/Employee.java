public class Employee {
    protected java.util.Date hireDay;
}

class Manager extends Employee {
    public void printHireDay (Manager p) {
        System.out.println("mHireDay: " + (p.hireDay).toString());
    }	

    // ok! The class is Manager, and the object reference type is also Manager
    public void printHireDay (Employee p) {
        System.out.println("eHireDay: " + p.hireDay.toString());
    }
}
