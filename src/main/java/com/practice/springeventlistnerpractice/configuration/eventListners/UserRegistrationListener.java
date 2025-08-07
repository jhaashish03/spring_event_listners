package com.practice.springeventlistnerpractice.configuration.eventListners;

import com.practice.springeventlistnerpractice.models.UserRegisterEvent;
import com.practice.springeventlistnerpractice.models.UserRegisterEventAsync;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserRegistrationListener {

  @EventListener
  public void handleUserRegisterEvent(UserRegisterEvent event) {
    log.info("User Registered Successfully {}",event.getEmail());
  }

  @Async
  @EventListener
  public void handleUserRegisterEventAsync(UserRegisterEventAsync event) {
   log.info("User Registered Successfully in async {}",event.getEmail());
  }

  //can listen to any built in events just replace the parameter with the event class
  //or anootaion the method with @BuiltInEvent listener like @TranactionalEventListner
  //@EventListener(condition = "#event.email.contains('@gmail.com')")
  //public void handleUserRegisterEventGmail(UserRegisterEvent event) {
  //  log.info("User Registered Successfully {}",event.getEmail());
  //}
}
