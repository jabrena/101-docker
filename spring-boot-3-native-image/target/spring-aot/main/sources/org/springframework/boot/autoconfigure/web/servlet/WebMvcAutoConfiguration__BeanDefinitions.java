package org.springframework.boot.autoconfigure.web.servlet;

import java.lang.Class;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.web.servlet.filter.OrderedFormContentFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.validation.Validator;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.filter.RequestContextFilter;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ThemeResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.resource.ResourceUrlProvider;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Bean definitions for {@link WebMvcAutoConfiguration}
 */
public class WebMvcAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcAutoConfiguration'
   */
  public static BeanDefinition getWebMvcAutoConfigurationBeanDefinition() {
    Class<?> beanType = WebMvcAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(WebMvcAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'formContentFilter'.
   */
  private static BeanInstanceSupplier<OrderedFormContentFilter> getFormContentFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<OrderedFormContentFilter>forFactoryMethod(WebMvcAutoConfiguration.class, "formContentFilter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.class).formContentFilter());
  }

  /**
   * Get the bean definition for 'formContentFilter'
   */
  public static BeanDefinition getFormContentFilterBeanDefinition() {
    Class<?> beanType = OrderedFormContentFilter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFormContentFilterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link WebMvcAutoConfiguration.EnableWebMvcConfiguration}
   */
  public static class EnableWebMvcConfiguration__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration'.
     */
    private static BeanInstanceSupplier<WebMvcAutoConfiguration.EnableWebMvcConfiguration> getEnableWebMvcConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<WebMvcAutoConfiguration.EnableWebMvcConfiguration>forConstructor(WebMvcProperties.class, WebProperties.class, ObjectProvider.class, ObjectProvider.class, ListableBeanFactory.class)
              .withGenerator((registeredBean, args) -> new WebMvcAutoConfiguration.EnableWebMvcConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
    }

    /**
     * Get the bean definition for 'enableWebMvcConfiguration'
     */
    public static BeanDefinition getEnableWebMvcConfigurationBeanDefinition() {
      Class<?> beanType = WebMvcAutoConfiguration.EnableWebMvcConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      InstanceSupplier<WebMvcAutoConfiguration.EnableWebMvcConfiguration> instanceSupplier = getEnableWebMvcConfigurationInstanceSupplier();
      instanceSupplier = instanceSupplier.andThen(WebMvcAutoConfiguration_EnableWebMvcConfiguration__Autowiring::apply);
      beanDefinition.setInstanceSupplier(instanceSupplier);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'requestMappingHandlerAdapter'.
     */
    private static BeanInstanceSupplier<RequestMappingHandlerAdapter> getRequestMappingHandlerAdapterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<RequestMappingHandlerAdapter>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "requestMappingHandlerAdapter", ContentNegotiationManager.class, FormattingConversionService.class, Validator.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).requestMappingHandlerAdapter(args.get(0, ContentNegotiationManager.class), args.get(1, FormattingConversionService.class), args.get(2, Validator.class)));
    }

    /**
     * Get the bean definition for 'requestMappingHandlerAdapter'
     */
    public static BeanDefinition getRequestMappingHandlerAdapterBeanDefinition() {
      Class<?> beanType = RequestMappingHandlerAdapter.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getRequestMappingHandlerAdapterInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'welcomePageHandlerMapping'.
     */
    private static BeanInstanceSupplier<WelcomePageHandlerMapping> getWelcomePageHandlerMappingInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<WelcomePageHandlerMapping>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "welcomePageHandlerMapping", ApplicationContext.class, FormattingConversionService.class, ResourceUrlProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).welcomePageHandlerMapping(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'welcomePageHandlerMapping'
     */
    public static BeanDefinition getWelcomePageHandlerMappingBeanDefinition() {
      Class<?> beanType = WelcomePageHandlerMapping.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getWelcomePageHandlerMappingInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'localeResolver'.
     */
    private static BeanInstanceSupplier<LocaleResolver> getLocaleResolverInstanceSupplier() {
      return BeanInstanceSupplier.<LocaleResolver>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "localeResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).localeResolver());
    }

    /**
     * Get the bean definition for 'localeResolver'
     */
    public static BeanDefinition getLocaleResolverBeanDefinition() {
      Class<?> beanType = LocaleResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getLocaleResolverInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'themeResolver'.
     */
    private static BeanInstanceSupplier<ThemeResolver> getThemeResolverInstanceSupplier() {
      return BeanInstanceSupplier.<ThemeResolver>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "themeResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).themeResolver());
    }

    /**
     * Get the bean definition for 'themeResolver'
     */
    public static BeanDefinition getThemeResolverBeanDefinition() {
      Class<?> beanType = ThemeResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getThemeResolverInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'flashMapManager'.
     */
    private static BeanInstanceSupplier<FlashMapManager> getFlashMapManagerInstanceSupplier() {
      return BeanInstanceSupplier.<FlashMapManager>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "flashMapManager")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).flashMapManager());
    }

    /**
     * Get the bean definition for 'flashMapManager'
     */
    public static BeanDefinition getFlashMapManagerBeanDefinition() {
      Class<?> beanType = FlashMapManager.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getFlashMapManagerInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mvcConversionService'.
     */
    private static BeanInstanceSupplier<FormattingConversionService> getMvcConversionServiceInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<FormattingConversionService>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "mvcConversionService")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).mvcConversionService());
    }

    /**
     * Get the bean definition for 'mvcConversionService'
     */
    public static BeanDefinition getMvcConversionServiceBeanDefinition() {
      Class<?> beanType = FormattingConversionService.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMvcConversionServiceInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mvcValidator'.
     */
    private static BeanInstanceSupplier<Validator> getMvcValidatorInstanceSupplier() {
      return BeanInstanceSupplier.<Validator>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "mvcValidator")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).mvcValidator());
    }

    /**
     * Get the bean definition for 'mvcValidator'
     */
    public static BeanDefinition getMvcValidatorBeanDefinition() {
      Class<?> beanType = Validator.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMvcValidatorInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mvcContentNegotiationManager'.
     */
    private static BeanInstanceSupplier<ContentNegotiationManager> getMvcContentNegotiationManagerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ContentNegotiationManager>forFactoryMethod(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class, "mvcContentNegotiationManager")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class).mvcContentNegotiationManager());
    }

    /**
     * Get the bean definition for 'mvcContentNegotiationManager'
     */
    public static BeanDefinition getMvcContentNegotiationManagerBeanDefinition() {
      Class<?> beanType = ContentNegotiationManager.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getMvcContentNegotiationManagerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter}
   */
  public static class WebMvcAutoConfigurationAdapter__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter'.
     */
    private static BeanInstanceSupplier<WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter> getWebMvcAutoConfigurationAdapterInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter>forConstructor(WebProperties.class, WebMvcProperties.class, ListableBeanFactory.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> new WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6)));
    }

    /**
     * Get the bean definition for 'webMvcAutoConfigurationAdapter'
     */
    public static BeanDefinition getWebMvcAutoConfigurationAdapterBeanDefinition() {
      Class<?> beanType = WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getWebMvcAutoConfigurationAdapterInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'defaultViewResolver'.
     */
    private static BeanInstanceSupplier<InternalResourceViewResolver> getDefaultViewResolverInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<InternalResourceViewResolver>forFactoryMethod(WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.class, "defaultViewResolver")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.class).defaultViewResolver());
    }

    /**
     * Get the bean definition for 'defaultViewResolver'
     */
    public static BeanDefinition getDefaultViewResolverBeanDefinition() {
      Class<?> beanType = InternalResourceViewResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDefaultViewResolverInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'viewResolver'.
     */
    private static BeanInstanceSupplier<ContentNegotiatingViewResolver> getViewResolverInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ContentNegotiatingViewResolver>forFactoryMethod(WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.class, "viewResolver", BeanFactory.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.class).viewResolver(args.get(0)));
    }

    /**
     * Get the bean definition for 'viewResolver'
     */
    public static BeanDefinition getViewResolverBeanDefinition() {
      Class<?> beanType = ContentNegotiatingViewResolver.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getViewResolverInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean definition for 'requestContextFilter'
     */
    public static BeanDefinition getRequestContextFilterBeanDefinition() {
      Class<?> beanType = RequestContextFilter.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<RequestContextFilter>forFactoryMethod(WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter.class, "requestContextFilter").withGenerator(WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter::requestContextFilter));
      return beanDefinition;
    }
  }
}
