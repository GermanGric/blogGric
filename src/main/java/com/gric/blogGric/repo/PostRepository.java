package com.gric.blogGric.repo;

import com.gric.blogGric.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
