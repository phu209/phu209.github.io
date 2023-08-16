package vn.techmaster.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
//@Builder // design pattern builder
public class Post {
    private static int autoId = 1;
    private Integer id;
    @NotNull(message = "Title khong duoc de trong")
    @NotBlank(message = "Title khong duoc de trong")
    @Size(min = 5, max = 50, message = "Title phải từ 50 đến 50 ký tự")
    private String title;

    @NotNull(message = "Author khong duoc de trong")
    @NotBlank(message = "Author khong duoc de trong")
    private String author;

    public Post(String title, String author) {
        this.id = autoId++;
        this.title = title;
        this.author = author;
    }
}
