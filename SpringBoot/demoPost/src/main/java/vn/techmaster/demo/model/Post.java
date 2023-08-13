package vn.techmaster.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
//@Builder // design pattern builder
public class Post {
    private static int autoId = 0;
    private Integer id;
    private String title;
    private String author;

    public Post(String title, String author) {
        this.id = autoId++;
        this.title = title;
        this.author = author;
    }
}
