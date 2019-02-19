/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:28:12 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.core.SearchParams;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchParams_ESTest extends SearchParams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0.0, 0.0, 0.0, (-2357));
      double double0 = searchParams0.getVarDecay();
      assertEquals(0.0, searchParams0.getClaDecay(), 0.01);
      assertEquals((-2357), searchParams0.getInitConflictBound());
      assertEquals(0.0, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1.0, 1.0, 1.0, (-2644));
      searchParams0.setVarDecay((-2644));
      double double0 = searchParams0.getVarDecay();
      assertEquals((-2644.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0.0, 0);
      int int0 = searchParams0.getInitConflictBound();
      assertEquals(0.0, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1.0, 1.0, 1.0, (-2644));
      int int0 = searchParams0.getInitConflictBound();
      assertEquals(1.0, searchParams0.getClaDecay(), 0.01);
      assertEquals((-2644), int0);
      assertEquals(1.0, searchParams0.getVarDecay(), 0.01);
      assertEquals(1.0, searchParams0.getConflictBoundIncFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0.0, 0.0, 0.0, (-2357));
      double double0 = searchParams0.getConflictBoundIncFactor();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, searchParams0.getClaDecay(), 0.01);
      assertEquals((-2357), searchParams0.getInitConflictBound());
      assertEquals(0.0, searchParams0.getVarDecay(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0.0, 0.0, 0.0, (-2357));
      double double0 = searchParams0.getClaDecay();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.0, searchParams0.getVarDecay(), 0.01);
      assertEquals((-2357), searchParams0.getInitConflictBound());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0.0, 0);
      searchParams0.setClaDecay((-543.00476));
      double double0 = searchParams0.getClaDecay();
      assertEquals((-543.00476), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      searchParams0.toString();
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      double double0 = searchParams0.getClaDecay();
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(0.999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      int int0 = searchParams0.getInitConflictBound();
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(100, int0);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      searchParams0.setConflictBoundIncFactor((-4837));
      assertEquals((-4837.0), searchParams0.getConflictBoundIncFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      double double0 = searchParams0.getConflictBoundIncFactor();
      assertEquals(1.5, double0, 0.01);
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams((-639.0), 2375);
      double double0 = searchParams0.getConflictBoundIncFactor();
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(2375, searchParams0.getInitConflictBound());
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals((-639.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      searchParams0.setInitConflictBound((-1516));
      assertEquals((-1516), searchParams0.getInitConflictBound());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0);
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(0, searchParams0.getInitConflictBound());
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      double double0 = searchParams0.getVarDecay();
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(0.95, double0, 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
  }
}
