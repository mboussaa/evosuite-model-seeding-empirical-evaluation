/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:09:24 GMT 2019
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
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.SingleSolutionDetector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MinOneDecorator_ESTest extends MinOneDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[0];
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(iVecInt0, iLits0);
      originalBinaryClause0.get(128);
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(originalBinaryClause0).when(singleSolutionDetector0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn(1169, 0).when(singleSolutionDetector0).nVars();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      minOneDecorator0.discard();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = (-408);
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = (ManyCore<ModelIteratorToSATAdapter>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>>(manyCore0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(clausalCardinalitiesDecorator0);
      minOneDecorator0.reset();
      assertFalse(minOneDecorator0.hasNoObjectiveFunction());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(singleSolutionDetector0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      minOneDecorator0.forceObjectiveValueTo(9);
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[8];
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      Number number0 = minOneDecorator0.calculateObjective();
      assertEquals(0, number0);
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[8];
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      minOneDecorator0.modelWithInternalVariables();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[0];
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      minOneDecorator0.modelWithInternalVariables();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[8];
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      minOneDecorator0.model();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[0];
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      minOneDecorator0.model();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = (ManyCore<ModelIteratorToSATAdapter>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>>(manyCore0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(clausalCardinalitiesDecorator0);
      Double double0 = new Double((-3489.24595));
      // Undeclared exception!
      try { 
        minOneDecorator0.forceObjectiveValueTo(double0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // requires at least 2 literals
         //
         verifyException("org.sat4j.tools.encoding.Policy", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.forceObjectiveValueTo((-3489));
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
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = (ManyCore<ModelIteratorToSATAdapter>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>>(manyCore0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(clausalCardinalitiesDecorator0);
      // Undeclared exception!
      try { 
        minOneDecorator0.discardCurrentSolution();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // requires at least 2 literals
         //
         verifyException("org.sat4j.tools.encoding.Policy", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.discardCurrentSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NoLearningNoHeuristics<MixedDataStructureSingleWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      int[] intArray0 = new int[1];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningNoHeuristics0, mixedDataStructureSingleWL0, searchParams0, subsetVarOrder0, noRestarts0, iLogAble0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(solver0);
      try { 
        minOneDecorator0.discard();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = (ManyCore<ModelIteratorToSATAdapter>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>>(manyCore0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(clausalCardinalitiesDecorator0);
      // Undeclared exception!
      try { 
        minOneDecorator0.discard();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // requires at least 2 literals
         //
         verifyException("org.sat4j.tools.encoding.Policy", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.discard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(dimacsStringSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsStringSolver0);
      try { 
        minOneDecorator0.admitABetterSolution(iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, true);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, true);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink(2996);
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(dimacsStringSolver0);
      try { 
        minOneDecorator0.admitABetterSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NoLearningNoHeuristics<MixedDataStructureSingleWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      int[] intArray0 = new int[1];
      intArray0[0] = 1340;
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningNoHeuristics0, mixedDataStructureSingleWL0, searchParams0, subsetVarOrder0, noRestarts0, iLogAble0);
      ISolver iSolver0 = solver0.getSolvingEngine();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector0);
      // Undeclared exception!
      try { 
        minOneDecorator0.admitABetterSolution();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1340
         //
         verifyException("org.sat4j.minisat.orders.SubsetVarOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = (ManyCore<ModelIteratorToSATAdapter>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(0, 0).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<ModelIteratorToSATAdapter>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(clausalCardinalitiesDecorator0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(clausalCardinalitiesDecorator0);
      minOneDecorator0.admitABetterSolution(iVecInt0);
      boolean boolean0 = minOneDecorator0.isOptimal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn((-2571), (-2571)).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(iVecInt0, iLits0);
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, originalBinaryClause0, (IConstr) null).when(singleSolutionDetector0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn(0, 128, (-2571)).when(singleSolutionDetector0).nVars();
      doReturn(false).when(singleSolutionDetector0).removeConstr(any(org.sat4j.specs.IConstr.class));
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      VecInt vecInt0 = new VecInt();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      minOneDecorator0.addAtMost(vecInt0, (-1262));
      minOneDecorator0.discardCurrentSolution();
      minOneDecorator0.discardCurrentSolution();
      minOneDecorator0.discardCurrentSolution();
      assertFalse(minOneDecorator0.hasNoObjectiveFunction());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      VecInt vecInt0 = new VecInt();
      minOneDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((Object) intArray0, (Object) intArray0).when(singleSolutionDetector0).modelWithInternalVariables();
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, true);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(fullClauseSelectorSolver0);
      minOneDecorator0.admitABetterSolution();
      assertFalse(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      minOneDecorator0.admitABetterSolution();
      assertTrue(minOneDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      boolean boolean0 = minOneDecorator0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      int[] intArray0 = minOneDecorator0.modelWithInternalVariables();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      // Undeclared exception!
      try { 
        minOneDecorator0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      // Undeclared exception!
      try { 
        minOneDecorator0.calculateObjective();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.MinOneDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      int[] intArray0 = minOneDecorator0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector0);
      // Undeclared exception!
      try { 
        minOneDecorator0.setTimeoutForFindingBetterSolution((-2336));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // No implemented yet
         //
         verifyException("org.sat4j.opt.MinOneDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Double double0 = new Double((-480.8215));
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      try { 
        minOneDecorator0.forceObjectiveValueTo(double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      Number number0 = minOneDecorator0.getObjectiveValue();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      boolean boolean0 = minOneDecorator0.nonOptimalMeansSatisfiable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SingleSolutionDetector> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SingleSolutionDetector>(singleSolutionDetector0, false);
      SingleSolutionDetector singleSolutionDetector1 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector1);
      boolean boolean0 = minOneDecorator0.hasNoObjectiveFunction();
      assertFalse(boolean0);
  }
}
