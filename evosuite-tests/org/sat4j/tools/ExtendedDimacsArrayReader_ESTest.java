/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:10:27 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ExtendedDimacsArrayReader;
import org.sat4j.tools.NegationDecorator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExtendedDimacsArrayReader_ESTest extends ExtendedDimacsArrayReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[6];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(4, 9, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsStringSolver0);
      int[] intArray0 = new int[1];
      intArray0[0] = 3;
      int[][] intArray1 = new int[6][2];
      intArray1[0] = intArray0;
      ISolver iSolver0 = extendedDimacsArrayReader0.parseInstance(intArray0, intArray0, intArray1, 1);
      assertEquals(1, iSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[0];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(2, 2, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[0];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(1, 15, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsStringSolver0);
      int[] intArray0 = new int[1];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(11, 0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[6];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(8, (-580), intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[6];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(6, 1559, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsStringSolver0);
      int[] intArray0 = new int[10];
      // Undeclared exception!
      extendedDimacsArrayReader0.handleConstr(11, 0, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[3];
      MaxSatDecorator maxSatDecorator0 = mock(MaxSatDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(maxSatDecorator0).nextFreeVarId(anyBoolean());
      NegationDecorator<MaxSatDecorator> negationDecorator0 = new NegationDecorator<MaxSatDecorator>(maxSatDecorator0);
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(negationDecorator0);
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(6, 6, intArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[5];
      ClauseOnlyLearning<MixedDataStructureDanielHT> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams((-766.70966340915), 3926);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(clauseOnlyLearning0, mixedDataStructureDanielHT0, searchParams0, varOrderHeap0, eMARestarts0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(solver0);
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(abstractMinimalModel0);
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(11, 0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[3];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(12, 27, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsStringSolver0);
      int[] intArray0 = new int[10];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(3, 9, intArray0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsStringSolver0);
      int[] intArray0 = new int[1];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(3, 9, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(2, 6, intArray0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(1, 1, intArray0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(121, 7, intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Gate type 121 not handled yet
         //
         verifyException("org.sat4j.tools.ExtendedDimacsArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader((ISolver) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(12, 12, intArray0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader((ISolver) null);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(11, 12, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(10, (-430), intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Gate type 10 not handled yet
         //
         verifyException("org.sat4j.tools.ExtendedDimacsArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader((ISolver) null);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(9, (-309), intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Gate type 9 not handled yet
         //
         verifyException("org.sat4j.tools.ExtendedDimacsArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader((ISolver) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(7, 7, intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Gate type 7 not handled yet
         //
         verifyException("org.sat4j.tools.ExtendedDimacsArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader((ISolver) null);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        extendedDimacsArrayReader0.handleConstr(5, 5, intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Gate type 5 not handled yet
         //
         verifyException("org.sat4j.tools.ExtendedDimacsArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsStringSolver0);
      int[] intArray0 = new int[0];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(4, 2, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[0];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(2, 12, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ExtendedDimacsArrayReader extendedDimacsArrayReader0 = new ExtendedDimacsArrayReader(dimacsOutputSolver0);
      int[] intArray0 = new int[0];
      boolean boolean0 = extendedDimacsArrayReader0.handleConstr(1, 1, intArray0);
      assertTrue(boolean0);
  }
}
