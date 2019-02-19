/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:36:13 GMT 2019
 */

package org.ow2.proactive.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import javax.script.Bindings;
import javax.script.SimpleBindings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.ow2.proactive.scripting.Script;
import org.ow2.proactive.scripting.SelectionScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionScript_ESTest extends SelectionScript_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("l8'hyKHs_X]w%xzn|");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = new File("l8'hyKHs_X]w%xzn|");
      SelectionScript selectionScript0 = new SelectionScript(file0, serializableArray0, false);
      String string0 = selectionScript0.toString();
      assertEquals("333948248\n\u0000\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("4j8y[F|zz$E0)s*VJ", "4j8y[F|zz$E0)s*VJ");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertFalse(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("4j8y[F|zz$E0)s*VJ", "4j8y[F|zz$E0)s*VJ");
      selectionScript0.hashCode();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, true);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.prepareSpecialBindings(simpleBindings0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[2];
      SelectionScript selectionScript0 = new SelectionScript("l8'hyKHs_X]w%xzn|", "l8'hyKHs_X]w%xzn|", serializableArray0, true);
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      linkedList0.offerFirst(selectionScript0);
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals(756533656, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[3];
      Script<SelectionScript> script0 = (Script<SelectionScript>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn(",v").when(script0).getScript();
      doReturn("2K+htvF+xg|(O0").when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, false);
      String string0 = selectionScript0.getId();
      assertNull(string0);
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("", "Bad result format : awaited Boolean (or Integer when not existing), found ");
      String string0 = selectionScript0.getId();
      assertTrue(selectionScript0.isDynamic());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[9];
      SelectionScript selectionScript0 = new SelectionScript("an&02+(U;B;rEiR+*", "an&02+(U;B;rEiR+*", serializableArray0, true);
      selectionScript0.digest();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("}B)b~SdC>DF2`RD;%(", "}B)b~SdC>DF2`RD;%(");
      // Undeclared exception!
      try { 
        selectionScript0.getResult("}B)b~SdC>DF2`RD;%(", (Bindings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("org.apache.log4j.or.DefaultRenderer", "org.apache.log4j.or.DefaultRenderer");
      SelectionScript selectionScript1 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.equals(selectionScript1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.compareByteArray((byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SelectionScript selectionScript0 = new SelectionScript(uRL0, serializableArray0, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[2];
      SelectionScript selectionScript0 = new SelectionScript(uRL0, serializableArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "MD5", (Serializable[]) null, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "MD5", (Serializable[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "/fooExample", true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "}B)b~,SdC>DF2`RD%(");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      Serializable[] serializableArray0 = new Serializable[1];
      serializableArray0[0] = (Serializable) selectionScript0;
      SelectionScript selectionScript1 = null;
      try {
        selectionScript1 = new SelectionScript("MD5", "MD5", serializableArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[2];
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((File) null, serializableArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((File) null, (Serializable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)70;
      byte[] byteArray1 = new byte[6];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertTrue(selectionScript0.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Script<Integer> script0 = (Script<Integer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, true);
      selectionScript0.buildSelectionScriptId();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[5];
      Script<Integer> script0 = (Script<Integer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn("").when(script0).getScript();
      doReturn("").when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, true);
      selectionScript0.buildSelectionScriptId();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ys!j^`XbKI[K");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("ys!j^`XbKI[K");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      SelectionScript selectionScript0 = new SelectionScript(mockFile0, (Serializable[]) null);
      selectionScript0.getReader();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("l8'hyKHs_X]w%xzn|");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = new File("l8'hyKHs_X]w%xzn|");
      SelectionScript selectionScript0 = new SelectionScript(file0, serializableArray0, false);
      boolean boolean0 = selectionScript0.isDynamic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      SelectionScript selectionScript0 = new SelectionScript("", "r}$kad/4BT/iS.");
      linkedList0.addLast(selectionScript0);
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals((-461658112), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      linkedList0.add((SelectionScript) null);
      // Undeclared exception!
      try { 
        SelectionScript.hashCodeFromList(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = SelectionScript.hashCodeFromList((List<SelectionScript>) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray0);
      assertTrue(selectionScript0.isDynamic());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript((String) null, (String) null);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[0];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertFalse(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("org.apache.log4j.or.DefaultRenderer", "org.apache.log4j.or.DefaultRenderer");
      SelectionScript selectionScript1 = new SelectionScript("MD5", "selected");
      boolean boolean0 = selectionScript0.equals(selectionScript1);
      assertTrue(selectionScript1.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      boolean boolean0 = selectionScript0.equals(selectionScript0);
      assertTrue(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      boolean boolean0 = selectionScript0.equals((Object) null);
      assertTrue(selectionScript0.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.getResult(simpleBindings0, simpleBindings0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, "MD5", (Serializable[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[2];
      File file0 = new File("l8'hyKHs_X]w%xzn|");
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(file0, serializableArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/l8'hyKHs_X]w%xzn|
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((Script<?>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      File file0 = new File("ys!j^`XbKI[K");
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(file0, (Serializable[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/ys!j^`XbKI[K
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, "S[3dU:v &Q", serializableArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, (Serializable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, "args", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("tbHfU*Pb4_Aun>hoqQs", "1V,vHGT~4o", false);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.prepareBindings(simpleBindings0);
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript((String) null, (String) null);
      // Undeclared exception!
      try { 
        selectionScript0.getReader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript((String) null, (String) null);
      boolean boolean0 = selectionScript0.isDynamic();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("MD5", "GM%0px.C{X=3KnXN", true);
      String string0 = selectionScript0.getId();
      assertEquals("MD5", string0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript((String) null, (String) null);
      String string0 = selectionScript0.getDefaultScriptName();
      assertTrue(selectionScript0.isDynamic());
      assertEquals("SelectionScript", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[9];
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, serializableArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.digest();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }
}
