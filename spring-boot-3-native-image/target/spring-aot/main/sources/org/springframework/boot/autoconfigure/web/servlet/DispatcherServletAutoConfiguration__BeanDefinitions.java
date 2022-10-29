package org.springframework.boot.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Bean definitions for {@link DispatcherServletAutoConfiguration}
 */
public class DispatcherServletAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dispatcherServletAutoConfiguration'
   */
  public static BeanDefinition getDispatcherServletAutoConfigurationBeanDefinition() {
    Class<?> beanType = DispatcherServletAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(DispatcherServletAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration}
   */
  public static class DispatcherServletRegistrationConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'dispatcherServletRegistrationConfiguration'
     */
    public static BeanDefinition getDispatcherServletRegistrationConfigurationBeanDefinition() {
      Class<?> beanType = DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dispatcherServletRegistration'.
     */
    private static BeanInstanceSupplier<DispatcherServletRegistrationBean> getDispatcherServletRegistrationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DispatcherServletRegistrationBean>forFactoryMethod(DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration.class, "dispatcherServletRegistration", DispatcherServlet.class, WebMvcProperties.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DispatcherServletAutoConfiguration.DispatcherServletRegistrationConfiguration.class).dispatcherServletRegistration(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'dispatcherServletRegistration'
     */
    public static BeanDefinition getDispatcherServletRegistrationBeanDefinition() {
      Class<?> beanType = DispatcherServletRegistrationBean.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDispatcherServletRegistrationInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link DispatcherServletAutoConfiguration.DispatcherServletConfiguration}
   */
  public static class DispatcherServletConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'dispatcherServletConfiguration'
     */
    public static BeanDefinition getDispatcherServletConfigurationBeanDefinition() {
      Class<?> beanType = DispatcherServletAutoConfiguration.DispatcherServletConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DispatcherServletAutoConfiguration.DispatcherServletConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dispatcherServlet'.
     */
    private static BeanInstanceSupplier<DispatcherServlet> getDispatcherServletInstanceSupplier() {
      return BeanInstanceSupplier.<DispatcherServlet>forFactoryMethod(DispatcherServletAutoConfiguration.DispatcherServletConfiguration.class, "dispatcherServlet", WebMvcProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(DispatcherServletAutoConfiguration.DispatcherServletConfiguration.class).dispatcherServlet(args.get(0)));
    }

    /**
     * Get the bean definition for 'dispatcherServlet'
     */
    public static BeanDefinition getDispatcherServletBeanDefinition() {
      Class<?> beanType = DispatcherServlet.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDispatcherServletInstanceSupplier());
      return beanDefinition;
    }
  }
}
