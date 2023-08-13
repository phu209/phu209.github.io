package vn.techmaster.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

//@RestController = @Controller + @ResponseBody
//@Controller
@RestController
@RequestMapping("/posts")
public class WebController {
    private List<Post> postList;

    public WebController() {
        System.out.println("WebController Created");

        this.postList = new ArrayList<>();
        this.postList.add(new Post("Post title 1", "Author 1"));
        this.postList.add(new Post("Post title 2", "Author 2"));
        this.postList.add(new Post("Post title 3", "Author 3"));
    }

    // 1. Lay ds tat ca post
    //@RequestMapping(method = RequestMethod.GET, value = "/posts")
    @GetMapping("")
    public List<Post> getAllPost() {
        return this.postList;
    }

    // 2. Lay post theo id
    //@RequestMapping(method = RequestMethod.GET, value = "/posts/{id}")
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable(name = "id") Integer postId) {
        return this.postList.stream()
                .filter(p -> p.getId().equals(postId))
                .findFirst().orElse(null);
    }
    // 3. Tao moi post
    //@RequestMapping(method = RequestMethod.POST, value = "/posts/{id}")
    @PostMapping("")
    public Post creatPost(@RequestBody Post request) {
        System.out.println(request);

        Post post = new Post(request.getTitle(),request.getAuthor());

        this.postList.add(post);
        return post;
    }

    // 4. Cap nhat post
    //@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Integer id, @RequestBody Post request) {
        Post post = this.postList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().orElse(null);

        if (post != null) {
            post.setTitle(request.getTitle());
            post.setAuthor(request.getAuthor());
            return post;
        }
        return null;
    }

    // 5. Xoa post
    //@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
    @DeleteMapping("/{id}")
    public void deletePostById(@PathVariable(name = "id") Integer postId) {
         this.postList.removeIf(post -> post.getId().equals(postId));
    }

    // 6. Tim kiem
    // /posts/search?tittle=bac
    @GetMapping("/search")
    public List<Post> searchPost(@RequestParam String title) {
        return this.postList.stream()
                .filter(p -> p.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
