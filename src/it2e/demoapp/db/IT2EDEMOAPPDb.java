package it2e.demoapp.db;

import java.util.Scanner;


public class IT2EDEMOAPPDb {
    
     public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print(" First Name: ");
        String fname = sc.next();
        
        System.out.print(" Last Name: ");
        String lname = sc.next();
        
        System.out.print("Email: ");
        String email = sc.next();
        
        System.out.print("Position: ");
        String position = sc.next();
        
         System.out.println("Status: ");
         String status = sc.next();

        String sql = "INSERT INTO tbl_employee (e_fname, e_lname, e_email, e_position, e_status) VALUES (?, ?, ?, ?, ?)";
        conf.addRecord(sql, fname, lname, email, position, status);


    }

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1.  ADD");
        System.out.println("2.  VIEW");
        System.out.println("3.  UPDATE");
        System.out.println("4.  DELTE");
        System.out.println("5.  EXII");
        
        System.out.println("Enter Action: ");
        int action = sc.nextInt();
        
        switch(action){
            case 1:
               IT2EDEMOAPPDb test = new IT2EDEMOAPPDb();
               test.addEmployee();
            break;
            
        }
        
    }
    
}
