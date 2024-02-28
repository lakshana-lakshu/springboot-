package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Door;
import com.example.demo.repository.DoorRepo;

@Service
public class DoorService {
    public DoorRepo doorRepo;

    public DoorService(DoorRepo doorRepo) {
        this.doorRepo = doorRepo;
    }
    public Door postDetail(Door door)
    {
       return doorRepo.save(door);
    }
    public List<Door> getAll()
    {
        return doorRepo.findAll();
    }
    public List<Door> getByAccessType(String accessType)
    {
        return doorRepo.findByAccessType(accessType);
    }
    public Door getByDoorId(int doorId)
    {
        return doorRepo.findById(doorId).orElse(null);
    }
}