package org.springframework.boot.actuate.autoconfigure.endpoint;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.endpoint.invoke.ParameterValueMapper;
import org.springframework.boot.actuate.endpoint.invoker.cache.CachingOperationInvokerAdvisor;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link EndpointAutoConfiguration}
 */
public class EndpointAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'endpointAutoConfiguration'
   */
  public static BeanDefinition getEndpointAutoConfigurationBeanDefinition() {
    Class<?> beanType = EndpointAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(EndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointOperationParameterMapper'.
   */
  private static BeanInstanceSupplier<ParameterValueMapper> getEndpointOperationParameterMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ParameterValueMapper>forFactoryMethod(EndpointAutoConfiguration.class, "endpointOperationParameterMapper", ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EndpointAutoConfiguration.class).endpointOperationParameterMapper(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'endpointOperationParameterMapper'
   */
  public static BeanDefinition getEndpointOperationParameterMapperBeanDefinition() {
    Class<?> beanType = ParameterValueMapper.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEndpointOperationParameterMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'endpointCachingOperationInvokerAdvisor'.
   */
  private static BeanInstanceSupplier<CachingOperationInvokerAdvisor> getEndpointCachingOperationInvokerAdvisorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CachingOperationInvokerAdvisor>forFactoryMethod(EndpointAutoConfiguration.class, "endpointCachingOperationInvokerAdvisor", Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EndpointAutoConfiguration.class).endpointCachingOperationInvokerAdvisor(args.get(0)));
  }

  /**
   * Get the bean definition for 'endpointCachingOperationInvokerAdvisor'
   */
  public static BeanDefinition getEndpointCachingOperationInvokerAdvisorBeanDefinition() {
    Class<?> beanType = CachingOperationInvokerAdvisor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEndpointCachingOperationInvokerAdvisorInstanceSupplier());
    return beanDefinition;
  }
}
