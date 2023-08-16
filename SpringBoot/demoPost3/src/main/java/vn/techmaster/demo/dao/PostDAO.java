package vn.techmaster.demo.dao;

import org.springframework.stereotype.Repository;
import vn.techmaster.demo.database.PostDB;
import vn.techmaster.demo.model.Post;

import java.util.List;

@Repository
public class PostDAO {
    public List<Post> findAll() {
        return PostDB.postList;
    }

    public void save(Post post) {
        PostDB.postList.add(post);
    }

    public void delete(Integer postId) {
        PostDB.postList.removeIf(post -> post.getId().equals(postId));
    }

    public List<Post> findByTitleContainsIgnoreCase(String title) {
        return PostDB.postList.stream()
                .filter(p -> p.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
