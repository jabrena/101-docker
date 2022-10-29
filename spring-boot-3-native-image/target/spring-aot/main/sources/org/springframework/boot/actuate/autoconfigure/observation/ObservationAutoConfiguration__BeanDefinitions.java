package org.springframework.boot.actuate.autoconfigure.observation;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.observation.DefaultMeterObservationHandler;
import io.micrometer.observation.ObservationRegistry;
import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ObservationAutoConfiguration}
 */
public class ObservationAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'observationAutoConfiguration'
   */
  public static BeanDefinition getObservationAutoConfigurationBeanDefinition() {
    Class<?> beanType = ObservationAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ObservationAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'observationRegistryPostProcessor'.
   */
  private static BeanInstanceSupplier<ObservationRegistryPostProcessor> getObservationRegistryPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObservationRegistryPostProcessor>forFactoryMethod(ObservationAutoConfiguration.class, "observationRegistryPostProcessor", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> ObservationAutoConfiguration.observationRegistryPostProcessor(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'observationRegistryPostProcessor'
   */
  public static BeanDefinition getObservationRegistryPostProcessorBeanDefinition() {
    Class<?> beanType = ObservationRegistryPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getObservationRegistryPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'observationRegistry'.
   */
  private static BeanInstanceSupplier<ObservationRegistry> getObservationRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ObservationRegistry>forFactoryMethod(ObservationAutoConfiguration.class, "observationRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ObservationAutoConfiguration.class).observationRegistry());
  }

  /**
   * Get the bean definition for 'observationRegistry'
   */
  public static BeanDefinition getObservationRegistryBeanDefinition() {
    Class<?> beanType = ObservationRegistry.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getObservationRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ObservationAutoConfiguration.OnlyMetricsConfiguration}
   */
  public static class OnlyMetricsConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'onlyMetricsConfiguration'
     */
    public static BeanDefinition getOnlyMetricsConfigurationBeanDefinition() {
      Class<?> beanType = ObservationAutoConfiguration.OnlyMetricsConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ObservationAutoConfiguration.OnlyMetricsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'metricsObservationHandlerGrouping'.
     */
    private static BeanInstanceSupplier<ObservationHandlerGrouping> getMetricsObservationHandlerGroupingInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ObservationHandlerGrouping>forFactoryMethod(ObservationAutoConfiguration.OnlyMetricsConfiguration.class, "metricsObservationHandlerGrouping")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ObservationAutoConfiguration.OnlyMetricsConfiguration.class).metricsObservationHandlerGrouping());
    }

    /**
     * Get the bean definition for 'metricsObservationHandlerGrouping'
     */
    public static BeanDefinition getMetricsObservationHandlerGroupingBeanDefinition() {
      Class<?> beanType = ObservationHandlerGrouping.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMetricsObservationHandlerGroupingInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link ObservationAutoConfiguration.MeterObservationHandlerConfiguration}
   */
  public static class MeterObservationHandlerConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'meterObservationHandlerConfiguration'
     */
    public static BeanDefinition getMeterObservationHandlerConfigurationBeanDefinition() {
      Class<?> beanType = ObservationAutoConfiguration.MeterObservationHandlerConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ObservationAutoConfiguration.MeterObservationHandlerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link ObservationAutoConfiguration.MeterObservationHandlerConfiguration.OnlyMetricsMeterObservationHandlerConfiguration}
     */
    public static class OnlyMetricsMeterObservationHandlerConfiguration__BeanDefinitions {
      /**
       * Get the bean definition for 'onlyMetricsMeterObservationHandlerConfiguration'
       */
      public static BeanDefinition getOnlyMetricsMeterObservationHandlerConfigurationBeanDefinition(
          ) {
        Class<?> beanType = ObservationAutoConfiguration.MeterObservationHandlerConfiguration.OnlyMetricsMeterObservationHandlerConfiguration.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(ObservationAutoConfiguration.MeterObservationHandlerConfiguration.OnlyMetricsMeterObservationHandlerConfiguration::new);
        return beanDefinition;
      }

      /**
       * Get the bean instance supplier for 'defaultMeterObservationHandler'.
       */
      private static BeanInstanceSupplier<DefaultMeterObservationHandler> getDefaultMeterObservationHandlerInstanceSupplier(
          ) {
        return BeanInstanceSupplier.<DefaultMeterObservationHandler>forFactoryMethod(ObservationAutoConfiguration.MeterObservationHandlerConfiguration.OnlyMetricsMeterObservationHandlerConfiguration.class, "defaultMeterObservationHandler", MeterRegistry.class)
                .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ObservationAutoConfiguration.MeterObservationHandlerConfiguration.OnlyMetricsMeterObservationHandlerConfiguration.class).defaultMeterObservationHandler(args.get(0)));
      }

      /**
       * Get the bean definition for 'defaultMeterObservationHandler'
       */
      public static BeanDefinition getDefaultMeterObservationHandlerBeanDefinition() {
        Class<?> beanType = DefaultMeterObservationHandler.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(getDefaultMeterObservationHandlerInstanceSupplier());
        return beanDefinition;
      }
    }
  }
}
