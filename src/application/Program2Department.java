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

//        System.out.println("\n=== Test 4: Seller insert ===");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! new ID = " + newSeller.getId());
//
//        System.out.println("\n=== Test 5: Seller Update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Update completed!");
//
//        System.out.println("\n=== Test 6: Seller Delete ===");
//        System.out.println("Enter id for delete test: ");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed!");

        sc.close();
    }

}
