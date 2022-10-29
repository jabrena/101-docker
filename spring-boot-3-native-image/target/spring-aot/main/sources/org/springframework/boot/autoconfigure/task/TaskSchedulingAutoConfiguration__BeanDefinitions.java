package org.springframework.boot.autoconfigure.task;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.boot.task.TaskSchedulerBuilder;

/**
 * Bean definitions for {@link TaskSchedulingAutoConfiguration}
 */
public class TaskSchedulingAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'taskSchedulingAutoConfiguration'
   */
  public static BeanDefinition getTaskSchedulingAutoConfigurationBeanDefinition() {
    Class<?> beanType = TaskSchedulingAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TaskSchedulingAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'scheduledBeanLazyInitializationExcludeFilter'
   */
  public static BeanDefinition getScheduledBeanLazyInitializationExcludeFilterBeanDefinition() {
    Class<?> beanType = LazyInitializationExcludeFilter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<LazyInitializationExcludeFilter>forFactoryMethod(TaskSchedulingAutoConfiguration.class, "scheduledBeanLazyInitializationExcludeFilter").withGenerator(TaskSchedulingAutoConfiguration::scheduledBeanLazyInitializationExcludeFilter));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'taskSchedulerBuilder'.
   */
  private static BeanInstanceSupplier<TaskSchedulerBuilder> getTaskSchedulerBuilderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TaskSchedulerBuilder>forFactoryMethod(TaskSchedulingAutoConfiguration.class, "taskSchedulerBuilder", TaskSchedulingProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TaskSchedulingAutoConfiguration.class).taskSchedulerBuilder(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'taskSchedulerBuilder'
   */
  public static BeanDefinition getTaskSchedulerBuilderBeanDefinition() {
    Class<?> beanType = TaskSchedulerBuilder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTaskSchedulerBuilderInstanceSupplier());
    return beanDefinition;
  }
}
