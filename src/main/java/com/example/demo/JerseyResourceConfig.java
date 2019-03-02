package com.example.demo;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * 继承ResourceConfig,并添加一些配置信息
 *
 * @author leftso
 *
 */
public class JerseyResourceConfig extends ResourceConfig {
	public JerseyResourceConfig() {
		register(RequestContextFilter.class);
		register(MultiPartFeature.class);
		// 配置那个包下面的会被Jersey扫描
		packages("com.example.demo");
		//register(JAXBContextResolver.class);
		//register(JacksonFeature.class);
		//registerInstances(new LoggingFilter(Logger.getLogger(ServiceApplication.class.getName()), true));
	}
}
