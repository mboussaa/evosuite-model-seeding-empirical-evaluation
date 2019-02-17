/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:56:05 GMT 2019
 */

package org.ow2.proactive.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.net.ssl.SSLContext;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.http.CommonHttpClientBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommonHttpClientBuilder_ESTest extends CommonHttpClientBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      commonHttpClientBuilder0.maxConnections((-1));
      // Undeclared exception!
      commonHttpClientBuilder0.build();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      CommonHttpClientBuilder commonHttpClientBuilder1 = commonHttpClientBuilder0.insecure(true);
      assertSame(commonHttpClientBuilder0, commonHttpClientBuilder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      SSLContext sSLContext0 = commonHttpClientBuilder0.createSslContext();
      assertNotNull(sSLContext0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      HttpClientBuilder httpClientBuilder0 = commonHttpClientBuilder0.createInternalHttpClientBuilder();
      assertNotNull(httpClientBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      CommonHttpClientBuilder commonHttpClientBuilder1 = commonHttpClientBuilder0.useSystemProperties(false);
      assertSame(commonHttpClientBuilder1, commonHttpClientBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      CommonHttpClientBuilder commonHttpClientBuilder1 = commonHttpClientBuilder0.allowAnyCertificate(false);
      // Undeclared exception!
      commonHttpClientBuilder1.build();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      commonHttpClientBuilder0.allowAnyHostname(true);
      // Undeclared exception!
      commonHttpClientBuilder0.build();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      commonHttpClientBuilder0.allowAnyHostname(false);
      // Undeclared exception!
      commonHttpClientBuilder0.build();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      CommonHttpClientBuilder commonHttpClientBuilder1 = commonHttpClientBuilder0.allowAnyCertificate(true);
      // Undeclared exception!
      commonHttpClientBuilder1.build();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      commonHttpClientBuilder0.maxConnections(1);
      // Undeclared exception!
      commonHttpClientBuilder0.build();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      CommonHttpClientBuilder commonHttpClientBuilder1 = commonHttpClientBuilder0.disableContentCompression();
      // Undeclared exception!
      commonHttpClientBuilder1.build();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      RequestConfig requestConfig0 = RequestConfig.DEFAULT;
      commonHttpClientBuilder0.setDefaultRequestConfig(requestConfig0);
      // Undeclared exception!
      commonHttpClientBuilder0.build();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommonHttpClientBuilder commonHttpClientBuilder0 = new CommonHttpClientBuilder();
      commonHttpClientBuilder0.useSystemProperties();
      // Undeclared exception!
      commonHttpClientBuilder0.build();
  }
}
