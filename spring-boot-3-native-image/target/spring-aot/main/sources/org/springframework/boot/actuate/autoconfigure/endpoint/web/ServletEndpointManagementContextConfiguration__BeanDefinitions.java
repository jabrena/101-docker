package org.springframework.boot.actuate.autoconfigure.endpoint.web;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.autoconfigure.endpoint.expose.IncludeExcludeEndpointFilter;
import org.springframework.boot.actuate.endpoint.web.ExposableServletEndpoint;
import org.springframework.boot.actuate.endpoint.web.ServletEndpointRegistrar;
import org.springframework.boot.actuate.endpoint.web.annotation.ServletEndpointsSupplier;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link ServletEndpointManagementContextConfiguration}
 */
public class ServletEndpointManagementContextConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'servletEndpointManagementContextConfiguration'
   */
  public static BeanDefinition getServletEndpointManagementContextConfigurationBeanDefinition() {
    Class<?> beanType = ServletEndpointManagementContextConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ServletEndpointManagementContextConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'servletExposeExcludePropertyEndpointFilter'.
   */
  private static BeanInstanceSupplier<IncludeExcludeEndpointFilter> getServletExposeExcludePropertyEndpointFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<IncludeExcludeEndpointFilter>forFactoryMethod(ServletEndpointManagementContextConfiguration.class, "servletExposeExcludePropertyEndpointFilter", WebEndpointProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletEndpointManagementContextConfiguration.class).servletExposeExcludePropertyEndpointFilter(args.get(0)));
  }

  /**
   * Get the bean definition for 'servletExposeExcludePropertyEndpointFilter'
   */
  public static BeanDefinition getServletExposeExcludePropertyEndpointFilterBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(IncludeExcludeEndpointFilter.class, ExposableServletEndpoint.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getServletExposeExcludePropertyEndpointFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ServletEndpointManagementContextConfiguration.WebMvcServletEndpointManagementContextConfiguration}
   */
  public static class WebMvcServletEndpointManagementContextConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'webMvcServletEndpointManagementContextConfiguration'
     */
    public static BeanDefinition getWebMvcServletEndpointManagementContextConfigurationBeanDefinition(
        ) {
      Class<?> beanType = ServletEndpointManagementContextConfiguration.WebMvcServletEndpointManagementContextConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(ServletEndpointManagementContextConfiguration.WebMvcServletEndpointManagementContextConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'servletEndpointRegistrar'.
     */
    private static BeanInstanceSupplier<ServletEndpointRegistrar> getServletEndpointRegistrarInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ServletEndpointRegistrar>forFactoryMethod(ServletEndpointManagementContextConfiguration.WebMvcServletEndpointManagementContextConfiguration.class, "servletEndpointRegistrar", WebEndpointProperties.class, ServletEndpointsSupplier.class, DispatcherServletPath.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ServletEndpointManagementContextConfiguration.WebMvcServletEndpointManagementContextConfiguration.class).servletEndpointRegistrar(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'servletEndpointRegistrar'
     */
    public static BeanDefinition getServletEndpointRegistrarBeanDefinition() {
      Class<?> beanType = ServletEndpointRegistrar.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getServletEndpointRegistrarInstanceSupplier());
      return beanDefinition;
    }
  }
}
