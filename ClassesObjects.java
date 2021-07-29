package practice;

class Employee{
    public String name, address;
    public int year;
    public Employee(String n, int y,  String add){
        name = n;
        year = y;
        address = add;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getAddress(){
        return address;
    }
}

class Emp{
    public static void main(String[] args){
        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee e2 = new Employee("Sam", 2000,  "68d- WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreet");
        System.out.println("Name,Year of joining,Address");
        System.out.println(e1.getName()+" "+e1.getYear()+" "+e1.getAddress());
        System.out.println(e2.getName()+" "+e2.getYear()+" "+e2.getAddress());
        System.out.println(e3.getName()+" "+e3.getYear()+" "+e3.getAddress());
    }
}
