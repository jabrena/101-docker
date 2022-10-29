package org.springframework.boot.actuate.autoconfigure.web.server;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ManagementServerProperties}
 */
public class ManagementServerProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'managementServerProperties'
   */
  public static BeanDefinition getManagementServerPropertiesBeanDefinition() {
    Class<?> beanType = ManagementServerProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ManagementServerProperties::new);
    return beanDefinition;
  }
}
