package org.dodream.Pro;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	
	public boolean join(MyVO vo){
		MyDAO dao = sqlSessionTemplate.getMapper(MyDAO.class);
		return dao.join(vo);
	}
	

	
}
