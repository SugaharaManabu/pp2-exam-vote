package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/counter")
public class CounterController {
    private static final Logger log = LoggerFactory.getLogger(CounterController.class);

    @Autowired
    private CounterService counterService;

    // http://localhost:8080/counter/show
    @RequestMapping("/show")
    public String show(Model model) {
        Counter counter = counterService.findOne(1L);
        model.addAttribute("counter", counter);
        log.info("show");
        return "showcounter";
    }

    // http://localhost:8080/counter/vote
    @RequestMapping("/vote")
    public String vote() {
        return "votecounter";
    }

    @PostMapping(value = "/vote", params = "cold")
    public String voteCold() {
        Counter counter = counterService.findOne(1L);
        counter.setColdCount(counter.getColdCount() + 1);
        counterService.save(counter);

        log.info("voteCold");
        return "redirect:/counter/showcold";
    }

    @PostMapping(value = "/vote", params = "hot")
    public String voteHot() {
        Counter counter = counterService.findOne(1L);
        counter.setHotCount(counter.getHotCount() + 1);
        counterService.save(counter);

        log.info("voteHot");
        return "redirect:/counter/showhot";
    }

    @RequestMapping("showhot")
    public String showHot() {
        log.info("showHot");
        return "votehot";
    }

    @RequestMapping("showcold")
    public String showCold() {
        log.info("showcold");
        return "votecold";
    }
}
