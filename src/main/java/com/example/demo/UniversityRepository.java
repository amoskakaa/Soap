package com.example.demo;

import localhost.university.University;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class UniversityRepository {
    private Map<String, University> universities = new HashMap<>();

    @PostConstruct
    private void localData(){
        University strath = new University();
        strath.setLocation("Ole Sangale");
        strath.setName("Strathmore");
        strath.setYearfounded(1960);
        universities.put(strath.getName(),strath);

        University jkuat = new University();
        strath.setLocation("Juja");
        strath.setName("JKUAT");
        strath.setYearfounded(1940);
        universities.put(strath.getName(),jkuat);

        University ku = new University();
        strath.setLocation("Thika");
        strath.setName("Kenyatta University");
        strath.setYearfounded(1930);
        universities.put(strath.getName(),ku);
    }

    public University getUniversityByName(String name){
        return universities.get(name);
    }
}
