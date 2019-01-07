package me.zingon.Test.controller;

import java.util.List;
import me.zingon.Test.web.ApiResponse;
import me.zingon.Test.web.ListApiResponse;

public class APIController {

	protected ApiResponse createApiResp(int status, String msg) {
		return new ApiResponse(ApiResponse.Status.ERROR, null, new ApiResponse.ApiError(status, msg));
	}

	protected ApiResponse respSingle(Object data) {
		return new ApiResponse(ApiResponse.Status.OK, data);
	}

	protected ApiResponse respOK() {
		return new ApiResponse(ApiResponse.Status.OK, null);
	}

	protected ListApiResponse respCollection(List<?> data) {
		return new ListApiResponse(ApiResponse.Status.OK, data, null);
	}

	protected ApiResponse respParamError() {
		return new ApiResponse(ApiResponse.Status.ERROR, null, new ApiResponse.ApiError(0, "璇锋眰鍙傛暟閿欒"));
	}

	protected ApiResponse respServerError() {
		return new ApiResponse(ApiResponse.Status.ERROR, null, new ApiResponse.ApiError(1, "鏈嶅姟寮傚父"));
	}
}