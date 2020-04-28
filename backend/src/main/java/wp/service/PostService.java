package wp.service;

import org.springframework.stereotype.Service;
import wp.domain.Post;
import wp.repository.PostRepository;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAllByOrderByDateDesc();
    }
}
