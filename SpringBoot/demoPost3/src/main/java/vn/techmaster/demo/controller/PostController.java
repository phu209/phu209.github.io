package vn.techmaster.demo.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.demo.model.Post;
import vn.techmaster.demo.response.ErrorResponse;
import vn.techmaster.demo.service.PostService;

import java.util.ArrayList;
import java.util.List;

// status
// message
// time
// path
// ...

//@RestController = @Controller + @ResponseBody
//@Controller
@CrossOrigin
@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    // 1. Lay ds tat ca post
    //@RequestMapping(method = RequestMethod.GET, value = "/posts")
    @GetMapping("")
    public ResponseEntity<?> getAllPost() {
        return ResponseEntity.ok(postService.getAllPost()); //status = 200, body = List<post>
    }

    // 2. Lay post theo id
    //@RequestMapping(method = RequestMethod.GET, value = "/posts/{id}")
    @GetMapping("/{id}")
    public ResponseEntity<?> getPostById(@PathVariable(name = "id") Integer postId) {
        return ResponseEntity.ok(postService.getPostById(postId));

    }
    // 3. Tao moi post
    //@RequestMapping(method = RequestMethod.POST, value = "/posts/{id}")
    @PostMapping("")
    public ResponseEntity<?> creatPost(@Valid @RequestBody Post request) {
        return new ResponseEntity<>(postService.createPost(request), HttpStatus.CREATED); //status = 201
    }

    // 4. Cap nhat post
    //@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePost(@PathVariable Integer id,@Valid @RequestBody Post request) {
       return ResponseEntity.ok().body(postService.updatePost(id,request));
    }

    // 5. Xoa post
    //@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePostById(@PathVariable(name = "id") Integer postId) {
        postService.deletePost(postId);
        return ResponseEntity.noContent().build(); //status = 204
    }

    // 6. Tim kiem
    // /posts/search?tittle=bac
    @GetMapping("/search")
    public ResponseEntity<?> searchPost(@RequestParam String title) {
        return ResponseEntity.ok(postService.searchPost(title));
    }
}
