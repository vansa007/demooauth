package com.example.demo1.controllers;

import com.example.demo1.models.TestModel;
import com.example.demo1.repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestRepo repo;

    @GetMapping(path = "/list")
    public ResponseEntity<Map<String, Object>> getAll() {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("DATA", repo.findAll());
            map.put("MESSAGE", "Get data successfully!");
            map.put("STATUS", true);
        }catch (Exception error) {
            error.printStackTrace();
            map.put("MESSAGE", "Meet error!");
            map.put("STATUS", false);
        }
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }
}
