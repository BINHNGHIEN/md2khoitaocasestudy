package com.company.view;

import com.company.model.Role;
import com.company.model.RoleName;
import com.company.model.User;
import com.company.service.user.UserServiceIMPL;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegisterView {
    public RegisterView(){
        UserServiceIMPL userServiceIMPL= new UserServiceIMPL();
        System.out.println("FORM REGISTER");
        Scanner scanner= new Scanner(System.in);
        int id = UserServiceIMPL.userList.size()+1;
        System.out.println(" Enter the name : ");
        String name = scanner.nextLine();
        System.out.println(" Enter the username : ");
        String username = scanner.nextLine();
        System.out.println(" Enter the password : ");
        String password = scanner.nextLine();
        System.out.println(" Enter the role : ");
        String role = scanner.nextLine();
        Set<Role> roleSet= new HashSet<>();
        switch (role){
            case "manager":
                roleSet.add(new Role(1, RoleName.MANAGER));
            case "user":
                roleSet.add(new Role(2, RoleName.USER));
        }
        User user= new User(id, name, username, password, roleSet);
        userServiceIMPL.save(user);
        new LoginView();
    }
}
