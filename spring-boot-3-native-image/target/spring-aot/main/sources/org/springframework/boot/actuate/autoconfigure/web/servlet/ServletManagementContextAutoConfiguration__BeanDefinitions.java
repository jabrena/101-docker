package org.springframework.boot.actuate.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties;
import org.springframework.boot.actuate.autoconfigure.web.ManagementContextFactory;

/**
 * Bean definitions for {@link ServletManagementContextAutoConfiguration}
 */
public class ServletManagementContextAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'servletManagementContextAutoConfiguration'
   */
  public static BeanDefinition getServletManagementContextAutoConfigurationBeanDefinition() {
    Class<?> beanType = ServletManagementContextAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ServletManagementContextAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'servletWebChildContextFactory'
   */
  public static BeanDefinition getServletWebChildContextFactoryBeanDefinition() {
    Class<?> beanType = ManagementContextFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<ManagementContextFactory>forFactoryMethod(ServletManagementContextAutoConfiguration.class, "servletWebChildContextFactory").withGenerator(ServletManagementContextAutoConfiguration::servletWebChildContextFactory));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'managementServletContext'.
   */
  private static BeanInstanceSupplier<ManagementServletContext> getManagementServletContextInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ManagementServletContext>forFactoryMethod(ServletManagementContextAutoConfiguration.class, "managementServletContext", WebEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletManagementContextAutoConfiguration.class).managementServletContext(args.get(0)));
  }

  /**
   * Get the bean definition for 'managementServletContext'
   */
  public static BeanDefinition getManagementServletContextBeanDefinition() {
    Class<?> beanType = ManagementServletContext.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getManagementServletContextInstanceSupplier());
    return beanDefinition;
  }
}
