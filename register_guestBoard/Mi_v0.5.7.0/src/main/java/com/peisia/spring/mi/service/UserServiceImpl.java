package com.peisia.spring.mi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peisia.dto.UserDto;
import com.peisia.spring.mi.mapper.UserMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class UserServiceImpl implements UserService {

	@Setter(onMethod_ = @Autowired)
	UserMapper mapper;

	public void register(UserDto user) {
		log.info("impl테스트입니다=========" + user.getUserName());
		mapper.register(user);
	}

}
