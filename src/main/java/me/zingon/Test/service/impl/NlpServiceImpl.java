package me.zingon.Test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.zingon.Test.dao.NlpDao;
import me.zingon.Test.model.Words;
import me.zingon.Test.service.NlpService;

@Service
public class NlpServiceImpl implements NlpService {
	@Autowired
	NlpDao nlpDao;

	@Override
	public List<Words> queryWords(String type) {
		return nlpDao.queryWords(type);
	}

}
