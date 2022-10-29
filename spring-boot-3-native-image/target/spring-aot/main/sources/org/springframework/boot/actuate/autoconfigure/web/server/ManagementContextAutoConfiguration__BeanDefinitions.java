package org.springframework.boot.actuate.autoconfigure.web.server;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link ManagementContextAutoConfiguration}
 */
public class ManagementContextAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'managementContextAutoConfiguration'
   */
  public static BeanDefinition getManagementContextAutoConfigurationBeanDefinition() {
    Class<?> beanType = ManagementContextAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ManagementContextAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ManagementContextAutoConfiguration.SameManagementContextConfiguration}
   */
  public static class SameManagementContextConfiguration__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration'.
     */
    private static BeanInstanceSupplier<ManagementContextAutoConfiguration.SameManagementContextConfiguration> getSameManagementContextConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ManagementContextAutoConfiguration.SameManagementContextConfiguration>forConstructor(Environment.class)
              .withGenerator((registeredBean, args) -> new ManagementContextAutoConfiguration.SameManagementContextConfiguration(args.get(0)));
    }

    /**
     * Get the bean definition for 'sameManagementContextConfiguration'
     */
    public static BeanDefinition getSameManagementContextConfigurationBeanDefinition() {
      Class<?> beanType = ManagementContextAutoConfiguration.SameManagementContextConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getSameManagementContextConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link ManagementContextAutoConfiguration.SameManagementContextConfiguration.EnableSameManagementContextConfiguration}
     */
    public static class EnableSameManagementContextConfiguration__BeanDefinitions {
      /**
       * Get the bean definition for 'enableSameManagementContextConfiguration'
       */
      public static BeanDefinition getEnableSameManagementContextConfigurationBeanDefinition() {
        Class<?> beanType = ManagementContextAutoConfiguration.SameManagementContextConfiguration.EnableSameManagementContextConfiguration.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(ManagementContextAutoConfiguration.SameManagementContextConfiguration.EnableSameManagementContextConfiguration::new);
        return beanDefinition;
      }
    }
  }
}
