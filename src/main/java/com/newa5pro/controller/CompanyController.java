/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newa5pro.controller;

import javax.servlet.http.HttpSession;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hy
 */
@Controller
public class CompanyController {

    @RequestMapping(value = "/job/add")//add post when deployed
    public @ResponseBody
    String postJob(HttpSession session
    ,@RequestParam(value = "job-title") String title
    ,@RequestParam(value = "job-location", required = false) String location
    ,@RequestParam(value = "job-type", required = false) String type
    ,@RequestParam(value = "job-industry", required = false) String industry
    ,@RequestParam(value = "job-salary", required = false) float salary
    ,@RequestParam(value = "responsibilities", required = false) String responsible
    ,@RequestParam(value = "requirements", required = false) String requirement
    ,@RequestParam(value = "other_info", required = false) String otherInfo
    ,@RequestParam(value = " apply", required = false) String apply) throws JSONException {
        String accountType = (String) session.getAttribute("type");
        if (accountType != null && "company".equals(accountType)) {
            
            return "valid";
        } else {
            return "invalid";
        }
    }
}