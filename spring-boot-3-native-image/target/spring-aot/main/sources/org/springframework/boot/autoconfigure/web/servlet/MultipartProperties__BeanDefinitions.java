package org.springframework.boot.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MultipartProperties}
 */
public class MultipartProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'multipartProperties'
   */
  public static BeanDefinition getMultipartPropertiesBeanDefinition() {
    Class<?> beanType = MultipartProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MultipartProperties::new);
    return beanDefinition;
  }
}
