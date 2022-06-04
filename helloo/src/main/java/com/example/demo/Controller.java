package com.example.demo;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
public class Controller {
	private final ProjectRepository projectRepository;

	@GetMapping("/project")

	public List<ProjectEntity> findAllProject() {
		return projectRepository.findAll();

	}
}