package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    private List<Customer> customers = new ArrayList<>();

    @GetMapping("/demo1")
    public int demo1() {
        return 92;
    }

    @GetMapping("/demo2")
    public double demo2() {
        return 3.0974;
    }

    @GetMapping("/demo3")
    public String demo3() {
        return "<h1>Welcome to LAB-7 	</h1>";
    }

    @GetMapping("/demo4")
    public String demo4() {
        String institution = "KLEF";
        return "I Study at " + institution;
    }

    @GetMapping("/demo5/{id}")
    public String demo5(@PathVariable int id) {
        return "ID: " + id;
    }

    @GetMapping("/demo6/{a}/{b}")
    public String demo6(@PathVariable int a, @PathVariable int b) {
        return "Sum: " + (a + b);
    }

    @GetMapping("/demo7")
    public String demo7(@RequestParam("id") String id) {
        return "ID: " + id;
    }

    @GetMapping("/demo8/{name}")
    public String demo8(@PathVariable String name) {
        return "Name: " + name;
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return "Customer Added Successfully";
    }

    @GetMapping("/viewcustomer")
    public List<Customer> viewCustomer() {
        return customers;
    }
}

