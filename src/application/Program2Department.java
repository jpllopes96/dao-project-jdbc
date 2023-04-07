package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2Department {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: Department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);


        System.out.println("\n=== Test 2: Department findAll ===");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        for(Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: Department insert ===");
        Department newDepartment = new Department(null, "IT");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new ID = " + newDepartment.getId());

        System.out.println("\n=== Test 4: Department Update ===");
        department = departmentDao.findById(5);
        department.setName("RH");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== Test 5: Department Delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();
    }

}
