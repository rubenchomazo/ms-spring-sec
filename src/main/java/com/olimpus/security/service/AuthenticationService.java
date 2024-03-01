package com.olimpus.security.service;

import com.olimpus.security.dao.request.SignUpRequest;
import com.olimpus.security.dao.request.SigninRequest;
import com.olimpus.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
	JwtAuthenticationResponse signup(SignUpRequest request);

	JwtAuthenticationResponse signin(SigninRequest request);
}
