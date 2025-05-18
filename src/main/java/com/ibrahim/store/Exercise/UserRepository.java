package com.ibrahim.store.Exercise;

import org.springframework.stereotype.Repository;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
