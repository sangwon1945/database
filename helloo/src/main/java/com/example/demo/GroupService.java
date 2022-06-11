package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class GroupService {
	private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Transactional
    public DtoGroupResponse postGroup(DtoGroup dtoGroup) {
    	GroupEntity groupEntity = new GroupEntity(dtoGroup);
    	groupRepository.save(groupEntity);
        return new DtoGroupResponse(groupEntity);
    }
}