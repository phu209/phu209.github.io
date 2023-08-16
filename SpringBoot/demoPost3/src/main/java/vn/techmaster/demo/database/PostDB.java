package vn.techmaster.demo.database;

import vn.techmaster.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostDB {
    public static List<Post> postList = new ArrayList<>(
            List.of(
                    new Post("Post title 1", "Author 1"),
                    new Post("Post title 2", "Author 2"),
                    new Post("Post title 3", "Author 3")
            )
    );

}
