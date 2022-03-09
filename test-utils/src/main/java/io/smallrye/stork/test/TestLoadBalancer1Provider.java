package io.smallrye.stork.test;

import io.smallrye.stork.api.LoadBalancer;
import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.config.LoadBalancerType;
import io.smallrye.stork.spi.LoadBalancerProvider;

@LoadBalancerType(TestLoadBalancer1Provider.TYPE)
public class TestLoadBalancer1Provider implements LoadBalancerProvider<TestLb1Configuration> {

    public static final String TYPE = "test-lb-1";

    @Override
    public LoadBalancer createLoadBalancer(TestLb1Configuration config, ServiceDiscovery serviceDiscovery) {
        return new TestLoadBalancer1(config, serviceDiscovery, TYPE);
    }
}
