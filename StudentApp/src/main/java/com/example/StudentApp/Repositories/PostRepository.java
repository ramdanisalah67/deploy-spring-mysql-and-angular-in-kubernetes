package com.example.StudentApp.Repositories;

import com.example.StudentApp.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post,Long> {
}
