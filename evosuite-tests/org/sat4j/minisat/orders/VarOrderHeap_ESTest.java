/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:34:32 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.core.Heap;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RSATPhaseSelectionStrategy;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VarOrderHeap_ESTest extends VarOrderHeap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      solver0.newVar(436);
      varOrderHeap0.init();
      MixedDataStructureDanielWL mixedDataStructureDanielWL1 = new MixedDataStructureDanielWL();
      ActiveLearning<MixedDataStructureDanielWL> activeLearning0 = new ActiveLearning<MixedDataStructureDanielWL>(1.0E100);
      Solver<MixedDataStructureDanielWL> solver1 = new Solver<MixedDataStructureDanielWL>(activeLearning0, mixedDataStructureDanielWL1, searchParams0, varOrderHeap0, miniSATRestarts0);
      varOrderHeap0.init();
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = new double[0];
      varOrderHeap0.activity = doubleArray0;
      int int0 = varOrderHeap0.numberOfInterestingVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      levelBasedVarOrderHeap0.setVarDecay(0.0);
      levelBasedVarOrderHeap0.varDecayActivity();
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      varOrderHeap0.setLits((ILits) null);
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(1);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      pureOrder0.printStat(printWriter0, "org.sat4j.minisat.orders.LevelBasedVarOrderHeap");
      assertEquals("tries to first branch on a single phase watched unassigned variable (pure literal if using a CB data structure) else VSIDS from MiniSAT", pureOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NegativeLiteralSelectionStrategy negativeLiteralSelectionStrategy0 = new NegativeLiteralSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(negativeLiteralSelectionStrategy0);
      levelBasedVarOrderHeap0.updateActivity(0);
      double double0 = levelBasedVarOrderHeap0.varActivity(1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-2547.562990811303), (-2547.562990811303), (-2547.562990811303), (-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      varOrderHeap0.init();
      double double0 = varOrderHeap0.varActivity(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      solver0.newVar(436);
      varOrderHeap0.init();
      varOrderHeap0.undo(436);
      int int0 = varOrderHeap0.select();
      assertEquals(873, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-2547.728354694187), (-2547.728354694187), (-839.429166), (-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      ILits iLits0 = varOrderHeap0.getVocabulary();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-1120));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      solver0.newVar(30);
      ILits iLits0 = varOrderHeap0.getVocabulary();
      assertEquals(0, iLits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = new double[0];
      varOrderHeap0.activity = doubleArray0;
      double[] doubleArray1 = varOrderHeap0.getVariableHeuristics();
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = varOrderHeap0.getPhaseSelectionStrategy();
      assertNull(iPhaseSelectionStrategy0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      double[] doubleArray0 = new double[0];
      Heap heap0 = pureOrder0.createHeap(doubleArray0);
      assertTrue(heap0.heapProperty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.varActivity((-45));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -23
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      // Undeclared exception!
      try { 
        varOrderHeap0.updateVarAtDecisionLevel(2338);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.updateVar(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      // Undeclared exception!
      try { 
        varOrderHeap0.updateVar(3856);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1928
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.updateActivity(1563);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1563
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.undo(3856);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      NoLearningButHeuristics<MixedDataStructureDanielWL> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(noLearningButHeuristics0, mixedDataStructureDanielWL0, pureOrder0, (RestartStrategy) null);
      pureOrder0.init();
      // Undeclared exception!
      try { 
        pureOrder0.undo((-44));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1351);
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      ActiveLearning<MixedDataStructureDanielWL> activeLearning0 = new ActiveLearning<MixedDataStructureDanielWL>();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(activeLearning0, mixedDataStructureDanielWL0, searchParams0, subsetVarOrder0, arminRestarts0);
      // Undeclared exception!
      try { 
        subsetVarOrder0.init();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.minisat.orders.SubsetVarOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RSATPhaseSelectionStrategy rSATPhaseSelectionStrategy0 = new RSATPhaseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(rSATPhaseSelectionStrategy0);
      // Undeclared exception!
      try { 
        varOrderHeap0.assignLiteral((-2147483647));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RSATPhaseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RSATPhaseSelectionStrategy rSATPhaseSelectionStrategy0 = new RSATPhaseSelectionStrategy();
      int[] intArray0 = new int[6];
      rSATPhaseSelectionStrategy0.phase = intArray0;
      int[] intArray1 = new int[0];
      rSATPhaseSelectionStrategy0.phase = intArray1;
      varOrderHeap0.phaseStrategy = (IPhaseSelectionStrategy) rSATPhaseSelectionStrategy0;
      // Undeclared exception!
      try { 
        varOrderHeap0.assignLiteral(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.orders.RSATPhaseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      solver0.newVar(436);
      varOrderHeap0.init();
      int int0 = varOrderHeap0.numberOfInterestingVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      varOrderHeap0.init();
      varOrderHeap0.undo(0);
      varOrderHeap0.updateVar(0);
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      solver0.newVar(436);
      varOrderHeap0.init();
      varOrderHeap0.updateVar(402);
      int int0 = varOrderHeap0.numberOfInterestingVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      varOrderHeap0.init();
      varOrderHeap0.undo(0);
      varOrderHeap0.undo(0);
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      varOrderHeap0.init();
      varOrderHeap0.undo(0);
      int int0 = varOrderHeap0.select();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      String string0 = varOrderHeap0.toString();
      assertEquals("VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = varOrderHeap0.getVariableHeuristics();
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      varOrderHeap0.updateVarAtDecisionLevel((-2029));
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      pureOrder0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ILits iLits0 = varOrderHeap0.getVocabulary();
      assertNull(iLits0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(1);
      pureOrder0.assignLiteral((-734));
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double double0 = varOrderHeap0.varActivity(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = (PhaseInLastLearnedClauseSelectionStrategy)varOrderHeap0.getPhaseSelectionStrategy();
      assertEquals("phase appearing in latest learned clause", phaseInLastLearnedClauseSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      varOrderHeap0.varDecayActivity();
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-4));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, searchParams0, varOrderHeap0, miniSATRestarts0);
      varOrderHeap0.init();
      int int0 = varOrderHeap0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.printStat((PrintWriter) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }
}
