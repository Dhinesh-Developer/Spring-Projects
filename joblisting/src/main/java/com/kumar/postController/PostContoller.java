package com.kumar.postController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.model.Post;
import com.kumar.model.PostRepository;
import com.kumar.model.searchRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostContoller 
{
	@Autowired
	PostRepository repo;
	
	@Autowired
	searchRepository srepo;
	
	@GetMapping("/allPosts")
	@CrossOrigin
	public List<Post> getAllPosts()
	{
		return repo.findAll();
	}
	
	@PostMapping("/post")
	@CrossOrigin
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
	}
	
	@GetMapping("/posts/{text}")
	@CrossOrigin
	public List<Post> search(@PathVariable String text)
	{
		return srepo.findByText(text);
	}
}
