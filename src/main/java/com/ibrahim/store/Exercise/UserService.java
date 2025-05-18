package com.ibrahim.store.Exercise;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User With Email : " + user.getEmail() + "Already exist");
        }

        userRepository.save(user);
        notificationService.send( "Registration Successfully: ",  user.getEmail());
    }
}
