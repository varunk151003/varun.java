abstract class Salary {

    int id;
    String name;
    int salary;


    abstract void getSalary();

    static String  companyName(){
        return "KCG";
    }

    String dept(){
        return getClass().getName();
    }

    protected int getTotalWorkingDays(int days){
        return days;
    }

    void getProfile(){
        System.out.println("Enter the Id :"+id);
        System.out.println("Enter the Name :"+name);
        System.out.println("Enter the Department :"+dept());
        System.out.println("Enter the Working company :"+companyName());
        System.out.println("Enter the No.of Working days :"+getTotalWorkingDays(30));
        getSalary();
    }
}

class DepartmentStaff extends Salary{
    

    void getSalary(){
        salary = getTotalWorkingDays(30)*1000;
        System.out.println("The total Salary of the Department staff is : "+salary);
    }

    DepartmentStaff(int id, String name){
        super.id=id;
        super.name=name;
    }

}

class NonTechnicalStaff extends Salary{
    

    void getSalary(){
        salary = getTotalWorkingDays(27)*2500;
        System.out.println("The total Salary of the Department staff is : "+salary);
    }
    
    NonTechnicalStaff(int id, String name){
        super.id=id;
        super.name=name;
    }
    
        
}

class Admin extends Salary{
    

    void getSalary(){
        salary = getTotalWorkingDays(30)*3000;
        System.out.println("The total Salary of the Department staff is : "+salary);
    }
    
    Admin(int id, String name){
        super.id=id;
        super.name=name;
    }
    
        
}
class Company{
    public static void main(String args[]){
        Salary s1 = new DepartmentStaff(1002,"David");
        Salary s2 = new NonTechnicalStaff(1004,"Roger");
        Salary s3 = new Admin(1005,"Rakesh");
        s1.getProfile();
        System.out.println();
        s2.getProfile();
        System.out.println();
        s3.getProfile();
        System.out.println();
    }

}
