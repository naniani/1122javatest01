package com.offcn.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        转化对象
        User user = new User(1, "梁嘉豪", 21);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

//      转化集合
        List<User> list = new ArrayList<>();
        User user1 = new User(1, "梁嘉豪", 21);
        User user2 = new User(2, "梁朝旭", 21);
        User user3 = new User(1, "梁稼雷", 21);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        ObjectMapper mapper1 = new ObjectMapper();
        String list_json = mapper1.writeValueAsString(list);
        System.out.println(list_json);

//        转化多个集合 存在map
        List<User> list2 = new ArrayList<>();
        User user4 = new User(4, "梁嘉豪2", 22);
        User user5 = new User(5, "梁朝旭2", 22);
        User user6 = new User(6, "梁稼雷2", 22);
        list2.add(user4);
        list2.add(user5);
        list2.add(user6);

        Map<String, List<User>> map = new HashMap<>();
        map.put("list1",list);
        map.put("list2",list2);
        ObjectMapper mapper2 = new ObjectMapper();
        String map_json = mapper2.writeValueAsString(map);
        System.out.println(map_json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
