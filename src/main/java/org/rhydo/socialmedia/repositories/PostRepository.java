package org.rhydo.socialmedia.repositories;

import org.rhydo.socialmedia.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
