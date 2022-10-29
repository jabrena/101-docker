package org.springframework.boot.actuate.autoconfigure.health;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.endpoint.web.WebEndpointsSupplier;
import org.springframework.boot.actuate.endpoint.web.servlet.AdditionalHealthEndpointPathsWebMvcHandlerMapping;
import org.springframework.boot.actuate.health.HealthContributorRegistry;
import org.springframework.boot.actuate.health.HealthEndpointGroups;
import org.springframework.boot.actuate.health.HealthEndpointWebExtension;

/**
 * Bean definitions for {@link HealthEndpointWebExtensionConfiguration}
 */
public class HealthEndpointWebExtensionConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'healthEndpointWebExtensionConfiguration'
   */
  public static BeanDefinition getHealthEndpointWebExtensionConfigurationBeanDefinition() {
    Class<?> beanType = HealthEndpointWebExtensionConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HealthEndpointWebExtensionConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthEndpointWebExtension'.
   */
  private static BeanInstanceSupplier<HealthEndpointWebExtension> getHealthEndpointWebExtensionInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HealthEndpointWebExtension>forFactoryMethod(HealthEndpointWebExtensionConfiguration.class, "healthEndpointWebExtension", HealthContributorRegistry.class, HealthEndpointGroups.class, HealthEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointWebExtensionConfiguration.class).healthEndpointWebExtension(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'healthEndpointWebExtension'
   */
  public static BeanDefinition getHealthEndpointWebExtensionBeanDefinition() {
    Class<?> beanType = HealthEndpointWebExtension.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthEndpointWebExtensionInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link HealthEndpointWebExtensionConfiguration.MvcAdditionalHealthEndpointPathsConfiguration}
   */
  public static class MvcAdditionalHealthEndpointPathsConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'mvcAdditionalHealthEndpointPathsConfiguration'
     */
    public static BeanDefinition getMvcAdditionalHealthEndpointPathsConfigurationBeanDefinition() {
      Class<?> beanType = HealthEndpointWebExtensionConfiguration.MvcAdditionalHealthEndpointPathsConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(HealthEndpointWebExtensionConfiguration.MvcAdditionalHealthEndpointPathsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'healthEndpointWebMvcHandlerMapping'.
     */
    private static BeanInstanceSupplier<AdditionalHealthEndpointPathsWebMvcHandlerMapping> getHealthEndpointWebMvcHandlerMappingInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<AdditionalHealthEndpointPathsWebMvcHandlerMapping>forFactoryMethod(HealthEndpointWebExtensionConfiguration.MvcAdditionalHealthEndpointPathsConfiguration.class, "healthEndpointWebMvcHandlerMapping", WebEndpointsSupplier.class, HealthEndpointGroups.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointWebExtensionConfiguration.MvcAdditionalHealthEndpointPathsConfiguration.class).healthEndpointWebMvcHandlerMapping(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'healthEndpointWebMvcHandlerMapping'
     */
    public static BeanDefinition getHealthEndpointWebMvcHandlerMappingBeanDefinition() {
      Class<?> beanType = AdditionalHealthEndpointPathsWebMvcHandlerMapping.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getHealthEndpointWebMvcHandlerMappingInstanceSupplier());
      return beanDefinition;
    }
  }
}
