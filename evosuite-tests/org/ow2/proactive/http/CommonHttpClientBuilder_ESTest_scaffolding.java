/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Feb 17 07:56:05 GMT 2019
 */

package org.ow2.proactive.http;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CommonHttpClientBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.ow2.proactive.http.CommonHttpClientBuilder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CommonHttpClientBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.http.config.SocketConfig",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.log4j.or.RendererMap",
      "org.apache.http.StatusLine",
      "org.apache.http.cookie.MalformedCookieException",
      "org.apache.http.RequestLine",
      "org.apache.http.conn.ConnectionRequest",
      "org.apache.log4j.Level",
      "org.apache.http.config.Lookup",
      "org.apache.http.config.SocketConfig$Builder",
      "org.apache.http.HttpMessage",
      "org.apache.http.HttpRequestInterceptor",
      "org.apache.http.client.AuthCache",
      "org.apache.http.HeaderIterator",
      "org.apache.http.conn.ClientConnectionManager",
      "org.apache.http.conn.scheme.SchemeSocketFactory",
      "org.apache.http.HttpInetConnection",
      "org.apache.http.conn.HttpClientConnectionManager",
      "org.apache.http.HttpRequest",
      "org.apache.log4j.spi.Filter",
      "org.apache.http.client.BackoffManager",
      "org.apache.http.HttpException",
      "org.apache.http.cookie.CookieSpec",
      "org.apache.http.client.AuthenticationStrategy",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.apache.log4j.CategoryKey",
      "org.apache.http.conn.socket.ConnectionSocketFactory",
      "org.apache.log4j.Layout",
      "org.apache.http.client.CredentialsProvider",
      "org.apache.http.conn.util.PublicSuffixMatcher",
      "org.apache.http.conn.routing.RouteInfo$LayerType",
      "org.apache.http.client.ClientProtocolException",
      "org.apache.http.client.methods.Configurable",
      "org.apache.http.protocol.HttpRequestExecutor",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.apache.log4j.helpers.Loader",
      "org.apache.http.client.methods.HttpRequestWrapper",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.http.conn.util.PublicSuffixList",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.http.conn.ConnectTimeoutException",
      "org.apache.http.conn.ssl.SSLContextBuilder$TrustManagerDelegate",
      "org.apache.http.client.HttpClient",
      "org.apache.http.auth.Credentials",
      "org.apache.http.cookie.Cookie",
      "org.apache.http.HttpConnectionMetrics",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.http.HttpClientConnection",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.http.conn.ConnectionPoolTimeoutException",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.http.protocol.HttpProcessor",
      "org.apache.http.protocol.HttpCoreContext",
      "org.apache.http.client.methods.HttpRequestWrapper$HttpEntityEnclosingRequestWrapper",
      "org.apache.http.auth.AuthProtocolState",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.http.client.RedirectStrategy",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.protocol.HttpContext",
      "org.apache.http.auth.AuthScope",
      "org.apache.http.params.HttpParams",
      "org.apache.http.HttpResponse",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.http.HttpHost",
      "org.apache.http.conn.UnsupportedSchemeException",
      "org.apache.http.ProtocolException",
      "org.apache.http.client.protocol.HttpClientContext",
      "org.apache.log4j.or.ObjectRenderer",
      "org.ow2.proactive.http.CommonHttpClientBuilder",
      "org.apache.http.config.MessageConstraints",
      "org.apache.http.Header",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.log4j.Logger",
      "org.apache.http.conn.ssl.SSLContextBuilder$KeyManagerDelegate",
      "org.apache.http.conn.ConnectionKeepAliveStrategy",
      "org.apache.http.concurrent.Cancellable",
      "org.apache.http.conn.ssl.X509HostnameVerifier",
      "org.apache.http.conn.routing.HttpRoutePlanner",
      "org.apache.http.Consts",
      "org.apache.http.conn.ssl.SSLConnectionSocketFactory",
      "org.ow2.proactive.http.AllowAllTrustStrategy",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.http.conn.ssl.SSLInitializationException",
      "org.apache.http.cookie.CookieOrigin",
      "org.apache.http.util.Args",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.HttpEntity",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.http.config.ConnectionConfig",
      "org.apache.http.conn.socket.LayeredConnectionSocketFactory",
      "org.apache.http.conn.ssl.SSLContextBuilder",
      "org.apache.http.conn.scheme.Scheme",
      "org.apache.http.HttpResponseInterceptor",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.config.MessageConstraints$Builder",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.http.conn.scheme.SocketFactory",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.http.auth.AuthState",
      "org.apache.http.auth.AuthenticationException",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.http.NameValuePair",
      "org.apache.http.impl.execchain.ClientExecChain",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.http.HttpVersion",
      "org.apache.http.config.ConnectionConfig$Builder",
      "org.apache.http.ssl.TrustStrategy",
      "org.apache.http.conn.SchemePortResolver",
      "org.apache.http.conn.DnsResolver",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.http.conn.ClientConnectionRequest",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.http.conn.routing.HttpRoute",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.apache.http.client.CookieStore",
      "org.apache.log4j.Appender",
      "org.apache.http.client.methods.CloseableHttpResponse",
      "org.apache.http.auth.AuthScheme",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.client.HttpRequestRetryHandler",
      "org.apache.http.auth.MalformedChallengeException",
      "org.apache.http.HttpEntityEnclosingRequest",
      "org.apache.http.conn.scheme.SchemeRegistry",
      "org.apache.http.impl.client.CloseableHttpClient",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.http.ParseException",
      "org.apache.http.conn.routing.RouteInfo$TunnelType",
      "org.apache.http.conn.ssl.TrustStrategy",
      "org.apache.http.conn.ssl.PrivateKeyStrategy",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.http.client.ServiceUnavailableRetryStrategy",
      "org.apache.http.impl.client.InternalHttpClient",
      "org.apache.http.client.methods.HttpExecutionAware",
      "org.apache.http.HeaderElement",
      "org.apache.http.client.UserTokenHandler",
      "org.apache.http.conn.ManagedClientConnection",
      "org.apache.http.client.ConnectionBackoffStrategy",
      "org.apache.http.conn.HttpRoutedConnection",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.Priority",
      "org.apache.http.ConnectionReuseStrategy",
      "org.apache.http.conn.util.DomainType",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.http.conn.ConnectionReleaseTrigger",
      "org.apache.log4j.LogManager",
      "org.apache.http.conn.routing.RouteInfo",
      "org.apache.http.HttpConnection",
      "org.apache.http.client.ResponseHandler",
      "org.apache.http.conn.ManagedHttpClientConnection"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CommonHttpClientBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.ow2.proactive.http.AllowAllTrustStrategy",
      "org.ow2.proactive.http.CommonHttpClientBuilder",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.http.conn.ssl.SSLConnectionSocketFactory",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.http.conn.ssl.SSLContextBuilder",
      "org.apache.http.conn.ssl.SSLContextBuilder$TrustManagerDelegate",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.http.util.Args",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.Consts",
      "org.apache.http.conn.util.DomainType",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode"
    );
  }
}
