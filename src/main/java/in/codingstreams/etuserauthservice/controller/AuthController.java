package in.codingstreams.etuserauthservice.controller;

import in.codingstreams.etuserauthservice.constant.LoggingConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;
    //Sign up
    @PostMapping("/sign-up")
    public ResponseEntity<AuthResponse> signup(
            @RequestBody AuthRequest authRequest
    ){
        var methodName="AuthController:signUp";
        log.info(LoggingConstants.START_METHOD_LOG,methodName,authRequest);

        authService.signUp()

        log.info(LoggingConstants.END_METHOD_LOG,methodName);
    }
    //Login
    //Verify Token

}
