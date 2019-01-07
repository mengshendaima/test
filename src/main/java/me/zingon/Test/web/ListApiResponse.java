package me.zingon.Test.web;

import java.util.List;

import me.zingon.Test.web.ApiResponse.ApiError;
import me.zingon.Test.web.ApiResponse.Status;

/**
 * Created by ldewailly on 15/05/19.
 */
public class ListApiResponse {

	private final Status status;
	private final List<?> data;
	private final ApiError error;

	public ListApiResponse(Status status, List<?> data, ApiError error) {
		this.status = status;
		this.data = data;
		this.error = error;
	}

	public Status getStatus() {
		return status;
	}

	public List<?> getData() {
		return data;
	}

	public ApiError getError() {
		return error;
	}

}
