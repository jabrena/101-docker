package org.springframework.boot.autoconfigure.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration}
 */
public class JacksonHttpMessageConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonHttpMessageConvertersConfiguration'
   */
  public static BeanDefinition getJacksonHttpMessageConvertersConfigurationBeanDefinition() {
    Class<?> beanType = JacksonHttpMessageConvertersConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration}
   */
  public static class MappingJackson2HttpMessageConverterConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'mappingJackson2HttpMessageConverterConfiguration'
     */
    public static BeanDefinition getMappingJacksonHttpMessageConverterConfigurationBeanDefinition(
        ) {
      Class<?> beanType = JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mappingJackson2HttpMessageConverter'.
     */
    private static BeanInstanceSupplier<MappingJackson2HttpMessageConverter> getMappingJacksonHttpMessageConverterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MappingJackson2HttpMessageConverter>forFactoryMethod(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration.class, "mappingJackson2HttpMessageConverter", ObjectMapper.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JacksonHttpMessageConvertersConfiguration.MappingJackson2HttpMessageConverterConfiguration.class).mappingJackson2HttpMessageConverter(args.get(0)));
    }

    /**
     * Get the bean definition for 'mappingJackson2HttpMessageConverter'
     */
    public static BeanDefinition getMappingJacksonHttpMessageConverterBeanDefinition() {
      Class<?> beanType = MappingJackson2HttpMessageConverter.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMappingJacksonHttpMessageConverterInstanceSupplier());
      return beanDefinition;
    }
  }
}
