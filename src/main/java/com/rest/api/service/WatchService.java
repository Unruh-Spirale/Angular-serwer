package com.rest.api.service;

import com.rest.api.entity.Watch;

import java.util.List;

public interface WatchService {

    List<Watch> getAllWatches();
    Watch getWatch(long idWatch);
    void addWatch(Watch watch);
    void updateWatch(long idWatch, Watch updateWatch);
    void deleteWatch(long idWatch);

}
