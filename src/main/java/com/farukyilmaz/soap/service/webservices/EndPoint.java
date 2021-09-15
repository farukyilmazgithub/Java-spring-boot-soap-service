package com.farukyilmaz.soap.service.webservices;

import com.farukyilmaz.soap.service.companies.repositories.CompanieRepository;
import com.farukyilmaz.soap.service.users.models.User;
import com.farukyilmaz.soap.service.users.repositories.UserRepository;
import com.farukyilmaz.soap.service.webservices.domain.*;
import com.farukyilmaz.soap.service.webservices.domain.SearchCompanieRequest;
import com.farukyilmaz.soap.service.webservices.domain.SearchCompanieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndPoint {

	private static final String NAMESPACE_URI = "https://github.com/farukyilmazgithub";

	@Autowired
	private UserRepository userrepository;
	@Autowired
	private CompanieRepository companieRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "searchUserRequest")
	@ResponsePayload
	public SearchUserResponse searchUserRequest(@RequestPayload SearchUserRequest request) {
		SearchUserResponse response = new SearchUserResponse();
		response.getUsers().addAll(userrepository.findByUserCodeAndAccountCode(request.getUserCode(),request.getAccountCode()));
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "searchUserBalanceRequest")
	@ResponsePayload
	public SearchUserBalanceResponse searchUserBalanceRequest(@RequestPayload SearchUserBalanceRequest request) {
		SearchUserBalanceResponse responseB = new SearchUserBalanceResponse();
		responseB.getUsers().addAll(userrepository.findByUserCodeAndAccountCode(request.getUserCode(),request.getAccountCode()));
		responseB.getUsers().forEach(item-> item.setAccountType(null));
		responseB.getUsers().forEach(item-> item.setId(null));
		return responseB;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserRequest")
	@ResponsePayload
	public CreateUserResponse createUserRequest(@RequestPayload CreateUserRequest request) {
		CreateUserResponse responseC = new CreateUserResponse();

		User userC = new User(request.getUserCode(),request.getName(),request.getSurName(),
				request.getAccountType(),request.getAccountCode(),request.getBalance());
		userrepository.save(userC);

		responseC.getUsers().addAll(userrepository.findByUserCodeAndAccountCode(request.getUserCode(),request.getAccountCode()));
		return responseC;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "searchCompanieRequest")
	@ResponsePayload
	public SearchCompanieResponse searchCompanieRequest(@RequestPayload SearchCompanieRequest request) {
		SearchCompanieResponse responseD = new SearchCompanieResponse();
		responseD.getCompanies().addAll(companieRepository.findByCompanieName(request.getCompanieName()));
		return responseD;
	}
}
