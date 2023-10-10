package com.lms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping
    public String AdminHome(){
        return "admin/admin";
    }

    @GetMapping("/csm")
    public String ClassScheduleManagement(){
        return "admin/admin_csm";
    }

    @GetMapping("/moli")
    public String ManagingOpenLectureInformation(){
        return "admin/admin_moli";
    }

    @GetMapping("/mlp")
    public String ManagingLecturePlan(){
        return "admin/admin_mlp";
    }
}
