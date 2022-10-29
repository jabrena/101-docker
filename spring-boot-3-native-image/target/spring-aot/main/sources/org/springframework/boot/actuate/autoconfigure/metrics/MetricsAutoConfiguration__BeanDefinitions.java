package org.springframework.boot.actuate.autoconfigure.metrics;

import io.micrometer.core.instrument.Clock;
import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link MetricsAutoConfiguration}
 */
public class MetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'metricsAutoConfiguration'
   */
  public static BeanDefinition getMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = MetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(MetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'micrometerClock'.
   */
  private static BeanInstanceSupplier<Clock> getMicrometerClockInstanceSupplier() {
    return BeanInstanceSupplier.<Clock>forFactoryMethod(MetricsAutoConfiguration.class, "micrometerClock")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(MetricsAutoConfiguration.class).micrometerClock());
  }

  /**
   * Get the bean definition for 'micrometerClock'
   */
  public static BeanDefinition getMicrometerClockBeanDefinition() {
    Class<?> beanType = Clock.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMicrometerClockInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'meterRegistryPostProcessor'.
   */
  private static BeanInstanceSupplier<MeterRegistryPostProcessor> getMeterRegistryPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MeterRegistryPostProcessor>forFactoryMethod(MetricsAutoConfiguration.class, "meterRegistryPostProcessor", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ApplicationContext.class)
            .withGenerator((registeredBean, args) -> MetricsAutoConfiguration.meterRegistryPostProcessor(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'meterRegistryPostProcessor'
   */
  public static BeanDefinition getMeterRegistryPostProcessorBeanDefinition() {
    Class<?> beanType = MeterRegistryPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMeterRegistryPostProcessorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'propertiesMeterFilter'.
   */
  private static BeanInstanceSupplier<PropertiesMeterFilter> getPropertiesMeterFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PropertiesMeterFilter>forFactoryMethod(MetricsAutoConfiguration.class, "propertiesMeterFilter", MetricsProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(MetricsAutoConfiguration.class).propertiesMeterFilter(args.get(0)));
  }

  /**
   * Get the bean definition for 'propertiesMeterFilter'
   */
  public static BeanDefinition getPropertiesMeterFilterBeanDefinition() {
    Class<?> beanType = PropertiesMeterFilter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPropertiesMeterFilterInstanceSupplier());
    return beanDefinition;
  }
}
