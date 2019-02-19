/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:35:22 GMT 2019
 */

package org.sat4j.opt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSelectorVariablesDecorator_ESTest extends AbstractSelectorVariablesDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution();
      assertTrue(boolean0);
      
      maxSatDecorator0.model();
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      int[] intArray0 = maxSatDecorator0.getPrevfullmodel();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution();
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevfullmodel();
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution();
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevboolmodel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(4);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.setExpectedNumberOfClauses(4);
      int int0 = maxSatDecorator0.getNbexpectedclauses();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.setExpectedNumberOfClauses(2836);
      int int0 = maxSatDecorator0.getExpectedNumberOfClauses();
      assertEquals(2836, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, fixedPeriodRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution();
      assertTrue(boolean0);
      
      maxSatDecorator0.createBlockingClauseForCurrentModel();
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solver0);
      maxSatDecorator0.admitABetterSolution();
      // Undeclared exception!
      try { 
        maxSatDecorator0.model(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.admitABetterSolution();
      try { 
        maxSatDecorator0.discardCurrentModel();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating trivially inconsistent constraint
         //
         verifyException("org.sat4j.minisat.constraints.card.MaxWatchCard", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.discardCurrentModel();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0);
      try { 
        maxSatDecorator0.admitABetterSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      solver0.nextFreeVarId(true);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution();
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevboolmodel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(singleSolutionDetector0);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution();
      assertTrue(maxSatDecorator0.isOptimal());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      boolean[] booleanArray0 = maxSatDecorator0.getPrevboolmodel();
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      maxSatDecorator0.setSolutionOptimal(false);
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      maxSatDecorator0.setNbexpectedclauses(0);
      assertEquals(0, maxSatDecorator0.getNbexpectedclauses());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      boolean boolean0 = maxSatDecorator0.isSolutionOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        maxSatDecorator0.discardCurrentModel();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      int[] intArray0 = maxSatDecorator0.getPrevmodel();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      IVecInt iVecInt0 = maxSatDecorator0.createBlockingClauseForCurrentModel();
      assertNull(iVecInt0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, true);
      boolean boolean0 = maxSatDecorator0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(statisticsSolver0);
      int[] intArray0 = maxSatDecorator0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      int[] intArray0 = new int[4];
      maxSatDecorator0.setPrevmodel(intArray0);
      assertFalse(maxSatDecorator0.nonOptimalMeansSatisfiable());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        maxSatDecorator0.model((-2209));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 2645.0, 1.0, 14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean[] booleanArray0 = new boolean[6];
      maxSatDecorator0.setPrevboolmodel(booleanArray0);
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null);
      int[] intArray0 = new int[4];
      maxSatDecorator0.setPrevfullmodel(intArray0);
      int[] intArray1 = maxSatDecorator0.getPrevfullmodel();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMax> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(14);
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningButHeuristics0, cardinalityDataStructureYanMax0, searchParams0, pureOrder0, lubyRestarts0, (ILogAble) null);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int int0 = maxSatDecorator0.getNbexpectedclauses();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      int int0 = maxSatDecorator0.getExpectedNumberOfClauses();
      assertEquals(0, int0);
  }
}
