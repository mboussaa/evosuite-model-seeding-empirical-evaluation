/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:34:10 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.orders.PureOrder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PureOrder_ESTest extends PureOrder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      pureOrder0.setPeriod(0);
      int int0 = pureOrder0.getPeriod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder((-1120));
      int int0 = pureOrder0.getPeriod();
      assertEquals((-1120), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PureOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      String string0 = pureOrder0.toString();
      assertEquals(20, pureOrder0.getPeriod());
      assertEquals("tries to first branch on a single phase watched unassigned variable (pure literal if using a CB data structure) else VSIDS from MiniSAT", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      int int0 = pureOrder0.getPeriod();
      assertEquals(20, int0);
  }
}
