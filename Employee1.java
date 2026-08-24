class Employee{
    int id;
    String name;
    double salary;

    Employee (int id, String name , double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("ID : "+ id+ " , Name : "+name+" , Salary: "+ salary);
    }
}

public class Employee1{
    public static void main(String args[]){
        Employee e1 = new Employee(101 , "Aritra Pal" , 70000 );
        Employee e2 = new Employee(102 , "Pranjal Roy" , 60000 );
        System.out.println("Employee with a higher salary is : ");
        if(e1.salary > e2.salary){
            e1.display();
        } else{
            e2.display();
        }
    }
}