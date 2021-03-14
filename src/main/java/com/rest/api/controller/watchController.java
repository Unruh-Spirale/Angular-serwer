package com.rest.api.controller;

import com.rest.api.entity.Watch;
import com.rest.api.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watches")
public class watchController {

    WatchService watchService;

    @Autowired
    public watchController(WatchService watchService) {
        this.watchService = watchService;
    }

    @GetMapping
    public List<Watch> getAllWatches(){
        return watchService.getAllWatches();
    }

    @GetMapping("/{id}")
    public Watch getWatch(@PathVariable("id") long idWatch){
        return watchService.getWatch(idWatch);
    }

    @PostMapping
    public void addWatch(@RequestBody Watch watch){
        watchService.addWatch(watch);
    }

    @PutMapping("/{id}")
    public void updateWatch(@PathVariable("id") long idWatch, @RequestBody Watch watch){
        watchService.updateWatch(idWatch, watch);
    }

    @DeleteMapping("/{id}")
    public void deleteWatch(@PathVariable("id") long idWatch){
        watchService.deleteWatch(idWatch);
    }
}
