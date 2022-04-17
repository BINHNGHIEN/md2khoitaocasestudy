package com.company.service.user;

import com.company.model.Role;
import com.company.model.RoleName;
import com.company.model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserServiceIMPL  implements IUserService{
    public static List<User> userList= new ArrayList<>();
    static {
        Role role = new Role(1, RoleName.MANAGER);
        Set<Role> roleSet= new HashSet<>();
        roleSet.add(role);
        userList.add(new User(1,"binh","binh"," binh", roleSet));
    }
    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public void save(User user) {
        userList.add(user);
    }
}
