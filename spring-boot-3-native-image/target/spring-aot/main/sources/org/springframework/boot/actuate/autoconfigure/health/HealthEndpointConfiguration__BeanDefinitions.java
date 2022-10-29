package org.springframework.boot.actuate.autoconfigure.health;

import java.lang.Class;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.health.HealthContributorRegistry;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.HealthEndpointGroups;
import org.springframework.boot.actuate.health.HttpCodeStatusMapper;
import org.springframework.boot.actuate.health.StatusAggregator;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link HealthEndpointConfiguration}
 */
public class HealthEndpointConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'healthEndpointConfiguration'
   */
  public static BeanDefinition getHealthEndpointConfigurationBeanDefinition() {
    Class<?> beanType = HealthEndpointConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(HealthEndpointConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthStatusAggregator'.
   */
  private static BeanInstanceSupplier<StatusAggregator> getHealthStatusAggregatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StatusAggregator>forFactoryMethod(HealthEndpointConfiguration.class, "healthStatusAggregator", HealthEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointConfiguration.class).healthStatusAggregator(args.get(0)));
  }

  /**
   * Get the bean definition for 'healthStatusAggregator'
   */
  public static BeanDefinition getHealthStatusAggregatorBeanDefinition() {
    Class<?> beanType = StatusAggregator.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthStatusAggregatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthHttpCodeStatusMapper'.
   */
  private static BeanInstanceSupplier<HttpCodeStatusMapper> getHealthHttpCodeStatusMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HttpCodeStatusMapper>forFactoryMethod(HealthEndpointConfiguration.class, "healthHttpCodeStatusMapper", HealthEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointConfiguration.class).healthHttpCodeStatusMapper(args.get(0)));
  }

  /**
   * Get the bean definition for 'healthHttpCodeStatusMapper'
   */
  public static BeanDefinition getHealthHttpCodeStatusMapperBeanDefinition() {
    Class<?> beanType = HttpCodeStatusMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthHttpCodeStatusMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthEndpointGroups'.
   */
  private static BeanInstanceSupplier<HealthEndpointGroups> getHealthEndpointGroupsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HealthEndpointGroups>forFactoryMethod(HealthEndpointConfiguration.class, "healthEndpointGroups", ApplicationContext.class, HealthEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointConfiguration.class).healthEndpointGroups(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'healthEndpointGroups'
   */
  public static BeanDefinition getHealthEndpointGroupsBeanDefinition() {
    Class<?> beanType = HealthEndpointGroups.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthEndpointGroupsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthContributorRegistry'.
   */
  private static BeanInstanceSupplier<HealthContributorRegistry> getHealthContributorRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HealthContributorRegistry>forFactoryMethod(HealthEndpointConfiguration.class, "healthContributorRegistry", ApplicationContext.class, HealthEndpointGroups.class, Map.class, Map.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointConfiguration.class).healthContributorRegistry(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'healthContributorRegistry'
   */
  public static BeanDefinition getHealthContributorRegistryBeanDefinition() {
    Class<?> beanType = HealthContributorRegistry.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthContributorRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthEndpoint'.
   */
  private static BeanInstanceSupplier<HealthEndpoint> getHealthEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<HealthEndpoint>forFactoryMethod(HealthEndpointConfiguration.class, "healthEndpoint", HealthContributorRegistry.class, HealthEndpointGroups.class, HealthEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(HealthEndpointConfiguration.class).healthEndpoint(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'healthEndpoint'
   */
  public static BeanDefinition getHealthEndpointBeanDefinition() {
    Class<?> beanType = HealthEndpoint.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthEndpointInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'healthEndpointGroupsBeanPostProcessor'.
   */
  private static BeanInstanceSupplier<HealthEndpointConfiguration.HealthEndpointGroupsBeanPostProcessor> getHealthEndpointGroupsBeanPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HealthEndpointConfiguration.HealthEndpointGroupsBeanPostProcessor>forFactoryMethod(HealthEndpointConfiguration.class, "healthEndpointGroupsBeanPostProcessor", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> HealthEndpointConfiguration.healthEndpointGroupsBeanPostProcessor(args.get(0)));
  }

  /**
   * Get the bean definition for 'healthEndpointGroupsBeanPostProcessor'
   */
  public static BeanDefinition getHealthEndpointGroupsBeanPostProcessorBeanDefinition() {
    Class<?> beanType = HealthEndpointConfiguration.HealthEndpointGroupsBeanPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getHealthEndpointGroupsBeanPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
