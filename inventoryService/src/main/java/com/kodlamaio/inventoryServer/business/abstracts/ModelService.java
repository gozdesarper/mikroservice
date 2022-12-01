package com.kodlamaio.inventoryServer.business.abstracts;

import java.util.List;

import com.kodlamaio.inventoryServer.business.request.create.CreatModelRequest;
import com.kodlamaio.inventoryServer.business.request.update.UpdateModelRequest;
import com.kodlamaio.inventoryServer.business.responses.create.CreateModelResponse;
import com.kodlamaio.inventoryServer.business.responses.get.GetAllModelResponse;
import com.kodlamaio.inventoryServer.business.responses.update.UpdateModelResponse;

public interface ModelService {
	List<GetAllModelResponse> getAll();
	CreateModelResponse add(CreatModelRequest creatModelRequest);
	UpdateModelResponse update(UpdateModelRequest updateModelRequest);
	void delete(String id);
	

}
