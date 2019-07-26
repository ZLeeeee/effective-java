package com.chapter.chapter1.adapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
 private Services(){
     //prevents instance 防止创建实例
 }
 private static final String DEFAULT_REGIST_NAME = "default_provider";
 private static final Map<String , Provider> providers = new ConcurrentHashMap<String, Provider>();
 public static void regist(String name,Provider provider){
     providers.put(name,provider);
 }
 public static void defaultRegist(Provider provider){
     regist(DEFAULT_REGIST_NAME,provider);
 }
 public static Service newInstance(){
  return newInstance(DEFAULT_REGIST_NAME);
 }
 public static Service newInstance(String name){
     return providers.get(name).getService();
 }
}
