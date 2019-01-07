package me.zingon.Test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.zingon.Test.model.Words;

public interface NlpDao {
	List<Words> queryWords(@Param("type")String type);
}
