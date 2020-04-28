package wp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wp.domain.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByDateDesc();
}
