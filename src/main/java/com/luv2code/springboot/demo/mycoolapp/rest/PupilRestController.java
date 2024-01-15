package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.entity.Pupil;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PupilRestController {
    private List<Pupil> thePupils;

    @PostConstruct
    public void loadData() {
        thePupils = new ArrayList<>();

        thePupils.add(new Pupil("Ahmad", "Mohammad"));
        thePupils.add(new Pupil("Abdo", "Elshamy"));
        thePupils.add(new Pupil("Mokhtar", "Abdo"));
    }

    // define endpoint for "/pupils" - return list of students

    @GetMapping("/pupils")
    public List<Pupil> getPupils() {
        return thePupils;

    }

    @GetMapping("/pupils/{pupilId}")
    public Pupil getPupilById(@PathVariable int pupilId) {
        if ((pupilId >= thePupils.size() || pupilId < 0)){
            throw new PupilNotFoundException("Pupil ID not found -" + pupilId);
        }
            return thePupils.get(pupilId);
    }
}
