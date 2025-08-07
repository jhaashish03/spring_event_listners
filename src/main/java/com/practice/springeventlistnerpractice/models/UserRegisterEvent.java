package com.practice.springeventlistnerpractice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class UserRegisterEvent {
  private String email;

}
