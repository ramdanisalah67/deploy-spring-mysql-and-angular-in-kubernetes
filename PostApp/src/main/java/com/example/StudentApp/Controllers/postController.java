package com.example.StudentApp.Controllers;


import com.example.StudentApp.Models.Message;
import com.example.StudentApp.Models.Post;
import com.example.StudentApp.Repositories.PostRepository;
import com.example.StudentApp.dto.PostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
    public ResponseEntity<Message> addPost(@RequestBody PostRequest p){
        Post post = Post.builder()
                        .title(p.getTitle())
                                .content(p.getContent())
                                        .dateCreated(Instant.now()).build();
        postRepository.save(post);
        return  ResponseEntity.status(HttpStatus.CREATED).body(new Message(200,"post created successfully"));
    }

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }



    @DeleteMapping("delete/{id}")
    public Message deletePost(@PathVariable Long id){
        System.out.println(id);
        if(postRepository.findById(id).isPresent()) {postRepository.deleteById(id);return new Message(200,"post deleted");}
        else return new Message(406,"post not exist");
    }

    @GetMapping("get/{id}")
    public Post getById(@PathVariable Long id){
        return postRepository.findById(id).get();
    }
}
