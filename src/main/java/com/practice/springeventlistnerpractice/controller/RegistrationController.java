package com.practice.springeventlistnerpractice.controller;

import com.practice.springeventlistnerpractice.models.UserRegisterEvent;
import com.practice.springeventlistnerpractice.models.UserRegisterEventAsync;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
  private final ApplicationEventPublisher publisher;
  public RegistrationController(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }
  @PostMapping("/register")
  public String register(@RequestParam String email) {
    publisher.publishEvent(new UserRegisterEvent(email));
    return "Registration Successful";

  }

  @PostMapping("/registerAsyncEvent")
  public String registerUserAsnycEvent(@RequestParam String email) {
    publisher.publishEvent(new UserRegisterEventAsync(email));
    return "Registration Successful";
  }

}
