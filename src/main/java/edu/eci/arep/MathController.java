package edu.eci.arep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {


    @GetMapping("/linearsearch")
    public ResponseEntity<Map<String, Object>> linearSearch (@RequestParam int[] list, @RequestParam int value){
        int result = -1;
        LinearSearch ls = new LinearSearch(list,value);
        result = ls.getResult();
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "linearSearch");
        response.put("list", list);
        response.put("value", value);
        response.put("output", result);

        return ResponseEntity.ok(response);
    }


    @GetMapping("/binarysearch")
    public ResponseEntity<Map<String, Object>> binarySearch (@RequestParam int[] list, @RequestParam int value){
        int result = -1;
        Arrays.sort(list);
        BinarySearch bs = new BinarySearch(list,value);
        result = bs.getResult();

        Map<String, Object> response = new HashMap<>();
        response.put("operation", "BinarySearch");
        response.put("list", list);
        response.put("value", value);
        response.put("output", result);

        return ResponseEntity.ok(response);

    }





}