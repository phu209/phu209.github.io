package ex.job.demo.controller;

import ex.job.demo.model.Job;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/v1")
public class WebController {
    private List<Job> jobList;

    public WebController() {

        this.jobList = new ArrayList<>();
        this.jobList.add(new Job("title 1","des 1","location 1", 500,1000,"email 1"));
        this.jobList.add(new Job("title 2","des 2","location 2", 800,1500,"email 2"));
        this.jobList.add(new Job("title 3","des 3","location 3", 1000,2000,"email 3"));
    }

    @GetMapping("/jobs")
    public List<Job> getAllJob() {
        return this.jobList;
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable String id) {
        return this.jobList.stream()
                .filter(job -> job.getId().equals(id))
                .findFirst().orElse(null);
    }

    @PostMapping("/jobs")
    public Job createJob(@RequestBody Job request) {
        System.out.println(request);

        Job job = new Job(request.getTitle(),request.getDescription(),request.getLocation(),request.getMinSalary(),request.getMaxSalary(),request.getEmailTo());
        this.jobList.add(job);
        return job;
    }

    @PutMapping("/jobs/{id}")
    public Job updateJob(@PathVariable String id, @RequestBody Job request) {
        Job job = this.jobList.stream()
                .filter(j -> j.getId().equals(id))
                .findFirst().orElse(null);

        if (job != null) {
            job.setTitle(request.getTitle());
            job.setDescription(request.getDescription());
            job.setLocation(request.getLocation());
            job.setMinSalary(request.getMinSalary());
            job.setMaxSalary(request.getMaxSalary());
            job.setEmailTo(request.getEmailTo());
            return job;
        }
        return null;
    }

    @DeleteMapping("/jobs/{id}")
    public void deleteJobById(@PathVariable String id) {
        this.jobList.removeIf(job -> job.getId().equals(id));
    }

    @GetMapping("jobs/random")
    public Job getRamdomJob() {
        if(!jobList.isEmpty()) {
            Random rd = new Random();
            int rdIndex = rd.nextInt(jobList.size());
            return jobList.get(rdIndex);
        }
        return null;
    }

    @GetMapping("/sort")
    public List<Job> getSortedJobs(@RequestParam("max_salary") String sortOrder) {
        List<Job> sortedJobs = new ArrayList<>(this.jobList);

        if (sortOrder.equalsIgnoreCase("desc")) {
            sortedJobs.sort((job1, job2) -> Integer.compare(job2.getMaxSalary(), job1.getMaxSalary()));
        }

        return sortedJobs;
    }
}
