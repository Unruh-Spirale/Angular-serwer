package com.rest.api.service.impl;

import com.rest.api.entity.Watch;
import com.rest.api.repository.WatchRepository;
import com.rest.api.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WatchServiceImpl implements WatchService {

    WatchRepository watchRepository;

    @Autowired
    public WatchServiceImpl(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    @Override
    public List<Watch> getAllWatches() {
        return watchRepository.findAll();
    }

    @Override
    public Watch getWatch(long idWatch) {
        Optional<Watch> watchOptional = watchRepository.findById(idWatch);
        if (watchOptional.isPresent()){
            Watch watch = watchOptional.get();
            return watch;
        }
        return null;
    }

    @Override
    public void addWatch(Watch watch) {
        watchRepository.save(watch);

    }

    @Override
    public void updateWatch(long idWatch, Watch updateWatch) {
        Watch watch = watchRepository.findById(idWatch).get();

        watch.setCompany(updateWatch.getCompany());
        watch.setCountry(updateWatch.getCountry());
        watch.setModel(updateWatch.getModel());
        watch.setMovement(updateWatch.getMovement());
        watch.setMovementModel(updateWatch.getMovementModel());
        watch.setToRepair(updateWatch.getToRepair());
        watch.setDeadline(updateWatch.getDeadline());
        watch.setCost(updateWatch.getCost());

        watchRepository.save(watch);
    }

    @Override
    public void deleteWatch(long idWatch) {
        watchRepository.deleteById(idWatch);
    }
}
