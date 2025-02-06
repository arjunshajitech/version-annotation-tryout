package com.example.version.version.version;

import java.util.Random;

import org.hibernate.StaleObjectStateException;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class VController {

    final VRepository vRepository;
    
    @PostMapping("/api/v1/version")
    public void version() {
        try {
            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;
            V v = vRepository.findByName("hello");
            if (v == null) {
                vRepository.save(new V("hello",randomNumber));
            } else {
                v.setName("hello");
                v.setAge(randomNumber);
                vRepository.save(v);
            }
        } catch (ObjectOptimisticLockingFailureException e) {
            // swallow this exception and ignore
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
