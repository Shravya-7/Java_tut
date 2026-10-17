import java.io.File;
import java.util.Scanner;
class Student{
    private String name;
    private int rollnum;
    private int age;
    public Student(String name, int rollnum, int age){
        this.name = name;
        this.rollnum = rollnum;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public int getrollNum(){
        return rollnum;
    }
    public int getage(){
        return age;
    }
    public boolean hasSameAge(Student other){
        return this.age == other.getage();
    }
    public boolean isTwin(Student other){
        boolean hasSameAge = this.hasSameAge(other);
        boolean hasSameroll = (this.rollnum == other.getrollNum());
        return hasSameAge && hasSameroll;
    }
}

public class Twindetector{
    public static void main(String[] args)throws Exception{        
        Student[] students = new Student[500];
        int count = 0;
        Scanner sc = new Scanner(new File("student.txt"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.isBlank()) continue;
            String[] parts = line.split(",");
            String name = parts[0];
            int rollnum = Integer.parseInt(parts[1]);
            int age = Integer.parseInt(parts[2]);
            students[count] = new Student(name, rollnum, age);
            count++;                  
        }
        sc.close();
        System.out.println("Total entries : "+ count);
        System.out.println("============Pairs detected===========");    
        int pairs = 0;
        for(int i=0; i<count; i++){
            for(int j=i+1; j<count; j++){
                if(students[i].isTwin(students[j])){
                    pairs++;
                    System.out.println("Pair: "+pairs+" Name: "+students[i].getname()+","+students[j].getname()); 
                    System.out.println("                 Rollnum: "+students[i].getrollNum()+","+students[j].getrollNum());
                    System.out.println("                 Age: "+students[i].getage()+","+students[j].getage());
                }

            }
        }
        System.out.println("Total number of pairs are: "+pairs);
    }
}