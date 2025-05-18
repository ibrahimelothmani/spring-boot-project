package com.ibrahim.store.Exercise;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("memory")
public class InMemoryUserRepository implements UserRepository {

    private final Map<String, User> users = new HashMap<>();
    /**
     * @param user
     */
    @Override
    public void save(User user) {
        System.out.println("SAVING USERS: " + user);
        users.put(user.getEmail(), user);
    }

    /**
     * @param email
     * @return
     */
    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }
}
