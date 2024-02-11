package com.example.StudentApp.Controllers;


import com.example.StudentApp.Models.Post;
import com.example.StudentApp.Repositories.PostRepository;
import com.example.StudentApp.dto.PostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/post/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class postController {

    @Autowired
    private PostRepository postRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("addPost")
    public void addPost(@RequestBody PostRequest p){
        Post post = Post.builder()
                        .title(p.getTitle())
                                .content(p.getContent())
                                        .dateCreated(Instant.now()).build();
        postRepository.save(post);

    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

}
