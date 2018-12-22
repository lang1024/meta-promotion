package com.awsomegroup.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstanceInfoController {
  @Autowired
  private DiscoveryClient discoveryClient;


  /**
   * 本地服务实例的信息
   * @return
   */
  @GetMapping("/instance-info")
  public List<String> showInfo() {
    List<String> localServiceInstance = this.discoveryClient.getServices();
    return localServiceInstance;
  }
}
