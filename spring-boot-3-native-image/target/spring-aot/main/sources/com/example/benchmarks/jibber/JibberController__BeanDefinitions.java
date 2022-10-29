package com.example.benchmarks.jibber;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JibberController}
 */
public class JibberController__BeanDefinitions {
  /**
   * Get the bean definition for 'jibberController'
   */
  public static BeanDefinition getJibberControllerBeanDefinition() {
    Class<?> beanType = JibberController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<JibberController> instanceSupplier = InstanceSupplier.using(JibberController::new);
    instanceSupplier = instanceSupplier.andThen(JibberController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
