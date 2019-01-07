package me.zingon.Test.service;

import java.util.List;

import me.zingon.Test.model.Words;

public interface NlpService {
	public List<Words> queryWords(String type);
}
