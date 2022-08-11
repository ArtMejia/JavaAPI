package com.mejia.codingchallenge.controllers;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class ChallengeController {

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    @GetMapping("/data")
    public String testGetRoute() {
        return "This is just a test "+ date + " " + time;
    }

    @DeleteMapping("/data")
    public String testDeleteRoute() {
        return "Delete here "+ date + " " + time;
    }

    @PatchMapping("/data")
    public String testUpdateRoute() {
        return "Update Here " + date + " " + time;
    }

    @PostMapping("/data")
    public String testPostRoute() {
        return "Post here " + date + " " + time;
    }

    @GetMapping("/data/{num}/{num2}")
    public String testRouteWithPathVar(@PathVariable int num, @PathVariable int num2) {
        return "Multiply " + num + " by " + num2 + " equals " + (num * num2) + " " + date + " " + time;
    }

    @GetMapping("/data/")
    @ResponseBody
    public String testRouteWithReqParam(@RequestParam String id, @RequestParam(name = "blank") String name, @RequestParam String about) {
        return "Name: " + name + "\nID: " + id + "\nBio: " + about;
    }

}
