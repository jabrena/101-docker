package org.springframework.boot.actuate.autoconfigure.info;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link InfoContributorAutoConfiguration}
 */
public class InfoContributorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'infoContributorAutoConfiguration'
   */
  public static BeanDefinition getInfoContributorAutoConfigurationBeanDefinition() {
    Class<?> beanType = InfoContributorAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(InfoContributorAutoConfiguration::new);
    return beanDefinition;
  }
}
