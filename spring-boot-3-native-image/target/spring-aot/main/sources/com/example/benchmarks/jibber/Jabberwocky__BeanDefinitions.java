package com.example.benchmarks.jibber;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Jabberwocky}
 */
public class Jabberwocky__BeanDefinitions {
  /**
   * Get the bean definition for 'jabberwocky'
   */
  public static BeanDefinition getJabberwockyBeanDefinition() {
    Class<?> beanType = Jabberwocky.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(Jabberwocky::new);
    return beanDefinition;
  }
}
