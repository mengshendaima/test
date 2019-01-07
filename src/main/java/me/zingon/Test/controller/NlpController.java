package me.zingon.Test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import me.zingon.Test.model.Words;
import me.zingon.Test.service.NlpService;
import me.zingon.Test.web.ApiResponse;

@RestController
@RequestMapping("/navigate")
public class NlpController extends APIController{
	@Autowired
    NlpService nlpService;
	@RequestMapping("/function")
	public ApiResponse function(@RequestBody Map<String,Object> param){
		if(param.containsKey("message")){
		String message=(String) param.get("message");
		List<Term> termList = HanLP.segment(message);
		String type="n";
		System.out.println(termList);
		List<Words>wordlist=nlpService.queryWords(type);
		System.out.println(wordlist);
		return respOK();
		}else{
			return respParamError();
		}
	}
}
