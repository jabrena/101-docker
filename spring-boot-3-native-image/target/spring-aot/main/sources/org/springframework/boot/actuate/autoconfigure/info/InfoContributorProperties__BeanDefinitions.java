package org.springframework.boot.actuate.autoconfigure.info;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link InfoContributorProperties}
 */
public class InfoContributorProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'infoContributorProperties'
   */
  public static BeanDefinition getInfoContributorPropertiesBeanDefinition() {
    Class<?> beanType = InfoContributorProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InfoContributorProperties::new);
    return beanDefinition;
  }
}
