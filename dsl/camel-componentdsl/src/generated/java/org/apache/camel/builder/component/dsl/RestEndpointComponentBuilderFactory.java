/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.rest.RestComponent;

/**
 * Expose REST services or call external REST services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface RestEndpointComponentBuilderFactory {

    /**
     * REST (camel-rest)
     * Expose REST services or call external REST services.
     * 
     * Category: core,rest
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-rest
     * 
     * @return the dsl builder
     */
    static RestEndpointComponentBuilder restEndpoint() {
        return new RestEndpointComponentBuilderImpl();
    }

    /**
     * Builder for the REST component.
     */
    interface RestEndpointComponentBuilder
            extends
                ComponentBuilder<RestComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The Camel Rest component to use for the consumer REST transport, such
         * as jetty, servlet, undertow. If no component has been explicitly
         * configured, then Camel will lookup if there is a Camel component that
         * integrates with the Rest DSL, or if a
         * org.apache.camel.spi.RestConsumerFactory is registered in the
         * registry. If either one is found, then that is being used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param consumerComponentName the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder consumerComponentName(
                java.lang.String consumerComponentName) {
            doSetProperty("consumerComponentName", consumerComponentName);
            return this;
        }
        /**
         * The swagger api doc resource to use. The resource is loaded from
         * classpath by default and must be in JSON format.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param apiDoc the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder apiDoc(java.lang.String apiDoc) {
            doSetProperty("apiDoc", apiDoc);
            return this;
        }
        /**
         * The Camel Rest component to use for the producer REST transport, such
         * as http, undertow. If no component has been explicitly configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param componentName the value to set
         * @return the dsl builder
         */
        @Deprecated
        default RestEndpointComponentBuilder componentName(
                java.lang.String componentName) {
            doSetProperty("componentName", componentName);
            return this;
        }
        /**
         * Host and port of HTTP service to use (override host in swagger
         * schema).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder host(java.lang.String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The Camel Rest component to use for the producer REST transport, such
         * as http, undertow. If no component has been explicitly configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param producerComponentName the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder producerComponentName(
                java.lang.String producerComponentName) {
            doSetProperty("producerComponentName", producerComponentName);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default RestEndpointComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class RestEndpointComponentBuilderImpl
            extends
                AbstractComponentBuilder<RestComponent>
            implements
                RestEndpointComponentBuilder {
        @Override
        protected RestComponent buildConcreteComponent() {
            return new RestComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((RestComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "consumerComponentName": ((RestComponent) component).setConsumerComponentName((java.lang.String) value); return true;
            case "apiDoc": ((RestComponent) component).setApiDoc((java.lang.String) value); return true;
            case "componentName": ((RestComponent) component).setComponentName((java.lang.String) value); return true;
            case "host": ((RestComponent) component).setHost((java.lang.String) value); return true;
            case "lazyStartProducer": ((RestComponent) component).setLazyStartProducer((boolean) value); return true;
            case "producerComponentName": ((RestComponent) component).setProducerComponentName((java.lang.String) value); return true;
            case "autowiredEnabled": ((RestComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}