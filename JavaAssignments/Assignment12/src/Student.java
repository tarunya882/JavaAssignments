import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
public class Student {
    private int id;
    private  String name;
    private int age;
    private  String gender;
    private  String engDepartment;
    private int yearOfEnrollment;
    private double perTillDate;
    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getDept(){
        return engDepartment;
    }
    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }
    public double getPerTillDate(){
        return perTillDate;
    }
}
