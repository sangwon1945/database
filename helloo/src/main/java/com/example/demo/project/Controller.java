package com.example.demo.project;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
public class Controller {

    private  Repository1 ProjectRepository;
    
    @PostMapping
    public ProjectEntity put(@RequestParam Integer id, @RequestParam String content, @RequestParam Date due_date, @RequestParam Date meeting, @RequestParam String manager) {
    	return ;
    }
    
    /**
     * 멤버 조회
     * Integer id, String title, String content, Date due_date, Date meeting, String manager
     * @return
     */
    @GetMapping("/project")
    public List<ProjectEntity> findAllproject() {
        return ProjectRepository.findAll();
    }
    
    
}
