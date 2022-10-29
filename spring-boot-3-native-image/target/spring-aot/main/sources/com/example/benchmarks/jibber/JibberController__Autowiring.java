package com.example.benchmarks.jibber;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link JibberController}.
 */
public class JibberController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static JibberController apply(RegisteredBean registeredBean, JibberController instance) {
    instance.j = AutowiredFieldValueResolver.forRequiredField("j").resolve(registeredBean);
    return instance;
  }
}
