package vn.techmaster.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.techmaster.demo.dao.PostDAO;
import vn.techmaster.demo.exception.BadRequestException;
import vn.techmaster.demo.exception.ResouceNotFoundException;
import vn.techmaster.demo.model.Post;

import java.util.List;
import java.util.Objects;

@Service
public class PostService {
    @Autowired
    private PostDAO postDAO;
    public List<Post> getAllPost() {
        return postDAO.findAll();
    }

    public Post getPostById(Integer postId) {
        List<Post> postList = postDAO.findAll();
        return postList.stream()
                .filter(p -> p.getId().equals(postId))
                .findFirst()
                .orElseThrow(() -> {
                    throw new ResouceNotFoundException("Not found post");
                });
    }

    public Post createPost(Post request) {
        Post post = new Post(request.getTitle(),request.getAuthor());

        postDAO.save(post);
        return post;
    }

    public Post updatePost(Integer id, Post request) {
        Post post = getPostById(id);
        post.setTitle(request.getTitle());
        post.setAuthor(request.getAuthor());
        return post;
    }

    public void deletePost(Integer postId) {
        Post post = getPostById(postId);
        postDAO.delete(postId);
    }

    public List<Post> searchPost(String title) {
        if(title.trim().length() == 0) {
            throw  new BadRequestException("Title khong duoc de trong");
        }
        return postDAO.findByTitleContainsIgnoreCase(title);
    }
}