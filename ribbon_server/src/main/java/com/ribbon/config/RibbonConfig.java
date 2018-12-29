package com.ribbon.config;

import com.netflix.discovery.DiscoveryClient;

public class RibbonConfig {


    DiscoveryClient.DiscoveryClientOptionalArgs getDiscoveryClientOptionalArgs()
    {
        DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs
                =  new  DiscoveryClient.DiscoveryClientOptionalArgs();
        return discoveryClientOptionalArgs;
    }
}
