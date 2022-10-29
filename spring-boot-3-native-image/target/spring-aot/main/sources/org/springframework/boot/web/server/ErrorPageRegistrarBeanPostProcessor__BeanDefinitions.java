package org.springframework.boot.web.server;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ErrorPageRegistrarBeanPostProcessor}
 */
public class ErrorPageRegistrarBeanPostProcessor__BeanDefinitions {
  /**
   * Get the bean definition for 'errorPageRegistrarBeanPostProcessor'
   */
  public static BeanDefinition getErrorPageRegistrarBeanPostProcessorBeanDefinition() {
    Class<?> beanType = ErrorPageRegistrarBeanPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setSynthetic(true);
    beanDefinition.setInstanceSupplier(ErrorPageRegistrarBeanPostProcessor::new);
    return beanDefinition;
  }
}
