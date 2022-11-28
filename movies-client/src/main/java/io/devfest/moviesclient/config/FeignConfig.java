package io.devfest.moviesclient.config;

import feign.Client;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import java.net.InetSocketAddress;
        import java.net.Proxy;

@Configuration
public class FeignConfig {

    @Bean
    public Client feignClient() {
        return new Client.Proxied(null, null,
                new Proxy(Proxy.Type.HTTP,
                        new InetSocketAddress("localhost", 4500)));
    }
}