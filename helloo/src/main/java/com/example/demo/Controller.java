package com.example.demo;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
public class Controller {
	private final ProjectRepository projectRepository;
	private final UserRepository userRepository;
	private final CommentRepository commentRepository;
	private final SchedulerRepository schedulerRepository;
	private final TimeRepository timeRepository;
	private final ProjectService projectservice;
	private final GroupRepository groupRepository;
	private final GroupService groupservice;
	private final SchedulerService schedulerservice;

	@GetMapping("/project")
	public List<ProjectEntity> findAllProject() {
		return projectRepository.findAll();
	}

	@GetMapping("/user")
	public List<UserEntity> findAllUser() {
		return userRepository.findAll();
	}

	@GetMapping("/comment")
	public List<CommentEntity> findAllComment() {
		return commentRepository.findAll();
	}

	@GetMapping("/scheduler")
	public List<SchedulerEntity> findAllScheduler() {
		return schedulerRepository.findAll();
	}

	@GetMapping("/time")
	public List<TimeEntity> findAllTime() {
		return timeRepository.findAll();
	}

	@GetMapping("/grouplist")
	public List<GroupEntity> findAllGroup() {
		return groupRepository.findAll();
	}

	@PostMapping("/project/post")
	public Boolean postMemberDto(@RequestBody DtoProject dtoproject) {
		projectservice.postProject(dtoproject);
		return true;
	}

	@PostMapping("/grouplist/post")
	public Boolean postMemberDto(@RequestBody DtoGroup dtogroup) {
		groupservice.postGroup(dtogroup);
		return true;
	}

	@PostMapping("/scheduler/post")
	public Boolean postMemberDto(@RequestBody DtoScheduler dtoscheduler) {
		schedulerservice.postScheduler(dtoscheduler);
		return true;
	}
}