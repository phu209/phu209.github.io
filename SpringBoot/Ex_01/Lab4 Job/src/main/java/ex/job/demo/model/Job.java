package ex.job.demo.model;

import lombok.*;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Job {
    private String id;
    private String title;
    private String description;
    private String location;
    private int minSalary;
    private int maxSalary;
    private String emailTo;

    private static final AtomicLong counter = new AtomicLong(0);

    public Job(String title, String description, String location, int minSalary, int maxSalary, String emailTo) {
        this.id = "JOB-" + counter.incrementAndGet();
        this.title = title;
        this.description = description;
        this.location = location;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.emailTo = emailTo;
    }
}
