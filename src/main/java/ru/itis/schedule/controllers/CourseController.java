package ru.itis.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.schedule.models.Course;
import ru.itis.schedule.services.CourseService;

import java.util.List;

@RestController
@RequestMapping("/cources")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> getCources(){
        return ResponseEntity.ok(courseService.getCources());
    }

    @PostMapping
    public ResponseEntity<?> save(Course course){
        courseService.save(course);
        return ResponseEntity.accepted().build();
    }
}
