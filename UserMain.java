package com.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class UserMain {
    public static void main(String[] args) {
        // Create the HashMap
        Map<String, User> userIdToUserMap = new HashMap<>();

        // Create User objects
        User user1 = new User("1", "John","john@123");
        User user2 = new User("2", "Alice","alice@123");
        User user3 = new User("3", "Bob","bob@123");

        // Add users to the HashMap
        userIdToUserMap.put(user1.getUserId(), user1);
        userIdToUserMap.put(user2.getUserId(), user2);
        userIdToUserMap.put(user3.getUserId(), user3);

        // Accessing user using the user ID
        String userId = "2";
        User user = userIdToUserMap.get(userId);
        System.out.println("User ID: " + user.getUserId() + ", Name: " + user.getUserName());
        
        for(Map.Entry m:userIdToUserMap.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  
    }
}

