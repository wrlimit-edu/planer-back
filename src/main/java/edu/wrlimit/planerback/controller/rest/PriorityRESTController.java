package edu.wrlimit.planerback.controller.rest;

import edu.wrlimit.planerback.model.Priority;
import edu.wrlimit.planerback.service.priority.interfaces.IPriorityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/priority")
public class PriorityRESTController {

    IPriorityService priorityService;

    public PriorityRESTController(IPriorityService priorityService) {
        this.priorityService = priorityService;
    }

    @RequestMapping("/list")
    public List<Priority> getAll() {
        return null;
    }
}
