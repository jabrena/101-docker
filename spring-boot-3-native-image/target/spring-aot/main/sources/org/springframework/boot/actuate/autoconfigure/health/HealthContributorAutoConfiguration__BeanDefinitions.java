package org.springframework.boot.actuate.autoconfigure.health;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.health.PingHealthIndicator;

/**
 * Bean definitions for {@link HealthContributorAutoConfiguration}
 */
public class HealthContributorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'healthContributorAutoConfiguration'
   */
  public static BeanDefinition getHealthContributorAutoConfigurationBeanDefinition() {
    Class<?> beanType = HealthContributorAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HealthContributorAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pingHealthContributor'.
   */
  private static BeanInstanceSupplier<PingHealthIndicator> getPingHealthContributorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PingHealthIndicator>forFactoryMethod(HealthContributorAutoConfiguration.class, "pingHealthContributor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(HealthContributorAutoConfiguration.class).pingHealthContributor());
  }

  /**
   * Get the bean definition for 'pingHealthContributor'
   */
  public static BeanDefinition getPingHealthContributorBeanDefinition() {
    Class<?> beanType = PingHealthIndicator.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPingHealthContributorInstanceSupplier());
    return beanDefinition;
  }
}
