package wp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wp.domain.Post;
import wp.service.PostService;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/blog/posts")
    public List<Post> findPosts() {
        return postService.findAll();
    }
}
