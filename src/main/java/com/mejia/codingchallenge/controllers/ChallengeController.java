package com.mejia.codingchallenge.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChallengeController {

    @GetMapping("/data")
    public String testGetRoute() {
        return "This is just a test";
    }

    @DeleteMapping("/data")
    public String testDeleteRoute() {
        return "Delete here";
    }

    @PatchMapping("/data")
    public String testUpdateRoute() {
        return "Update Here";
    }

    @PostMapping("/data")
    public String testPostRoute() {
        return "Post here";
    }

    @GetMapping("/data/{num}")
    public String testRouteWithPathVar(@PathVariable int num) {
        return "Multiplied by ten, " + num + " is " + (num * 10);
    }


    @GetMapping("/data/")
    @ResponseBody
    public String testRouteWithReqParam(@RequestParam String id, @RequestParam(name = "blank") String name, @RequestParam String about) {
        return "Name: " + name + "\nID: " + id + "\nBio: " + about;
    }

}
