package com.example.demoehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentService {

    static HashMap<Integer, Student> student = new HashMap<>();

    static {
        student.put(1, new Student(
                100,
                "Alpha",
                "TOURE",
                "2nd S1",
                "M",
                "alpha2re@school.com"
        ));
        student.put(2, new Student(
                101,
                "Thiané",
                "SAGNA",
                "TLe L2",
                "F",
                "thiasagna@school.com"
        ));
        student.put(3, new Student(
                102,
                "Moussa",
                "NDIAYE",
                "1er S2",
                "M",
                "moussndiaye@school.com"
        ));
    }

    @Cacheable(cacheNames = "demoEhcache", key="#id")
    public Student getStudentById(Integer id) {
        System.out.println("Fetching student data from cache");
        return student.get(id);
    }
}

