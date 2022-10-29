package org.springframework.boot.actuate.autoconfigure.metrics.task;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TaskExecutorMetricsAutoConfiguration}
 */
public class TaskExecutorMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'taskExecutorMetricsAutoConfiguration'
   */
  public static BeanDefinition getTaskExecutorMetricsAutoConfigurationBeanDefinition() {
    Class<?> beanType = TaskExecutorMetricsAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<TaskExecutorMetricsAutoConfiguration> instanceSupplier = InstanceSupplier.using(TaskExecutorMetricsAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(TaskExecutorMetricsAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
