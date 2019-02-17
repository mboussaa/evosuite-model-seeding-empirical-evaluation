/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:59:10 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Sequential;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sequential_ESTest extends Sequential_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      sequential0.addExactlyOne(dimacsOutputSolver0, vecInt0);
      assertEquals(3, dimacsOutputSolver0.realNumberOfVariables());
      assertEquals(3, dimacsOutputSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(2);
      IConstr iConstr0 = sequential0.addExactly(dimacsOutputSolver0, vecInt0, 474);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      MiniSATLearning<MixedDataStructureDanielHT> miniSATLearning0 = new MiniSATLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, (-3097));
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(miniSATLearning0, mixedDataStructureDanielHT0, tabuListDecorator0, lubyRestarts0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      ISolver iSolver0 = solver0.getSolvingEngine();
      try { 
        sequential0.addExactlyOne(iSolver0, iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(dimacsOutputSolver0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(dimacsOutputSolver0, vecInt0);
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(minimal4InclusionModel0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[13];
      VecInt vecInt0 = new VecInt(intArray0);
      Sequential sequential0 = new Sequential();
      MiniSATLearning<MixedDataStructureDanielHT> miniSATLearning0 = new MiniSATLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = mock(MixedDataStructureDanielHT.class, new ViolatedAssumptionAnswer());
      doReturn((ILits) null).when(mixedDataStructureDanielHT0).getVocabulary();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, (-3097));
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(miniSATLearning0, mixedDataStructureDanielHT0, tabuListDecorator0, lubyRestarts0);
      ISolver iSolver0 = solver0.getSolvingEngine();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(iSolver0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[13];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrinkTo(2051);
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactlyOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[25];
      VecInt vecInt0 = new VecInt(intArray0);
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      sequential0.addExactly(dimacsOutputSolver0, vecInt0, (-1680));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addExactly((ISolver) null, (IVecInt) null, (-1711));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      int[] intArray0 = new int[20];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addExactly((ISolver) null, vecInt0, Integer.MIN_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1196, 1196);
      // Undeclared exception!
      sequential0.addAtMostOne(dimacsOutputSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[13];
      VecInt vecInt0 = new VecInt(intArray0);
      Sequential sequential0 = new Sequential();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(iSolver0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[10];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrink((-1));
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMostOne(dimacsOutputSolver0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[10];
      VecInt vecInt0 = new VecInt(intArray0);
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      sequential0.addAtMost(dimacsOutputSolver0, vecInt0, 2993);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      int[] intArray0 = new int[25];
      VecInt vecInt0 = new VecInt(intArray0);
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(statisticsSolver0, checkMUSSolutionListener0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(minOneDecorator0, vecInt0, 3572);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      try { 
        sequential0.addAtMost((ISolver) null, (IVecInt) null, 2786);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[24];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addAtMost(dimacsOutputSolver0, vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      sequential0.addAtMost(dimacsOutputSolver0, vecInt0, 499);
      assertEquals(1497, dimacsOutputSolver0.nVars());
      assertEquals(1497, dimacsOutputSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        sequential0.addAtMost(dimacsOutputSolver0, vecInt0, 499);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Sequential", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SolutionCounter solutionCounter0 = mock(SolutionCounter.class, new ViolatedAssumptionAnswer());
      GroupClauseSelectorSolver<SolutionCounter> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<SolutionCounter>(solutionCounter0);
      SolutionCounter solutionCounter1 = new SolutionCounter(groupClauseSelectorSolver0);
      LexicoDecorator<SolutionCounter> lexicoDecorator0 = new LexicoDecorator<SolutionCounter>(solutionCounter1);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(dimacsOutputSolver0);
      SolutionFoundListener solutionFoundListener0 = mock(SolutionFoundListener.class, new ViolatedAssumptionAnswer());
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(abstractMinimalModel0, solutionFoundListener0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(modelIteratorToSATAdapter0);
      iVecInt0.push(0);
      Sequential sequential0 = new Sequential();
      IConstr iConstr0 = sequential0.addAtMost(lexicoDecorator0, iVecInt0, 1);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      Sequential sequential0 = new Sequential();
      IConstr iConstr0 = sequential0.addAtMostOne(dimacsOutputSolver0, vecInt0);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(2221, 0);
      Sequential sequential0 = new Sequential();
      // Undeclared exception!
      sequential0.addExactlyOne(dimacsOutputSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sequential sequential0 = new Sequential();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[13];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        sequential0.addExactly(dimacsOutputSolver0, vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
