/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:29:14 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.card.MinWatchCard;
import org.sat4j.minisat.constraints.cnf.BinaryClauses;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ConflictTimer;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.LBDConflictTimer;
import org.sat4j.minisat.core.LearningStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.SizeLCDS;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.Glucose21Restarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.tools.DimacsOutputSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SizeLCDS_ESTest extends SizeLCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 3796);
      binaryClauses0.addBinaryClause(2654);
      binaryClauses0.addBinaryClause(3796);
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, pureOrder0, glucose21Restarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, glucose21Restarts0);
      binaryClauses0.addBinaryClause(2654);
      Vec<Constr> vec0 = new Vec<Constr>(2654, binaryClauses0);
      // Undeclared exception!
      try { 
        sizeLCDS0.reduce(vec0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove all the binary clauses at once!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, randomWalkDecorator0, lubyRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, lubyRestarts0);
      Vec<Constr> vec0 = new Vec<Constr>();
      sizeLCDS0.reduce(vec0);
      assertTrue(vec0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructure> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      LearningStrategy<MixedDataStructureSingleWL> learningStrategy0 = (LearningStrategy<MixedDataStructureSingleWL>) mock(LearningStrategy.class, new ViolatedAssumptionAnswer());
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[3];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(learningStrategy0, mixedDataStructureSingleWL0, subsetVarOrder0, noRestarts0);
      SearchParams searchParams0 = solver0.getSearchParams();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver1 = new Solver<CardinalityDataStructure>(noLearningNoHeuristics0, cardinalityDataStructure0, searchParams0, subsetVarOrder0, noRestarts0, basicLauncher0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver1, (ConflictTimer) null);
      ConflictTimer conflictTimer0 = sizeLCDS0.getTimer();
      assertNull(conflictTimer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMin> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      VarOrderHeap varOrderHeap0 = mock(VarOrderHeap.class, new ViolatedAssumptionAnswer());
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      Lits lits0 = new Lits();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = (Solver<MixedDataStructureDanielWLConciseBinary>) mock(Solver.class, new ViolatedAssumptionAnswer());
      LBDConflictTimer lBDConflictTimer0 = new LBDConflictTimer(solver0, 0);
      Solver<? extends DataStructureFactory> solver1 = lBDConflictTimer0.getSolver();
      VecInt vecInt0 = new VecInt(0);
      Constr constr0 = MinWatchCard.minWatchCardNew(solver1, lits0, vecInt0, true, 0);
      Solver<CardinalityDataStructureYanMin> solver2 = new Solver<CardinalityDataStructureYanMin>(noLearningNoHeuristics0, cardinalityDataStructureYanMin0, randomWalkDecorator0, miniSATRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver2, miniSATRestarts0);
      // Undeclared exception!
      try { 
        sizeLCDS0.onConflictAnalysis(constr0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      SizeLCDS sizeLCDS0 = new SizeLCDS((Solver<? extends DataStructureFactory>) null, miniSATRestarts0);
      // Undeclared exception!
      try { 
        sizeLCDS0.onConflictAnalysis((Constr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.SizeLCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1));
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, randomWalkDecorator0, lubyRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, lubyRestarts0);
      sizeLCDS0.onConflictAnalysis(binaryClauses0);
      assertTrue(binaryClauses0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1));
      binaryClauses0.addBinaryClause((-1));
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, randomWalkDecorator0, lubyRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, lubyRestarts0);
      binaryClauses0.addBinaryClause((-1));
      Constr[] constrArray0 = new Constr[7];
      constrArray0[3] = (Constr) binaryClauses0;
      Vec<Constr> vec0 = new Vec<Constr>(constrArray0);
      // Undeclared exception!
      try { 
        sizeLCDS0.reduce(vec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.SizeLCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1));
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, randomWalkDecorator0, lubyRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, lubyRestarts0);
      Constr[] constrArray0 = new Constr[7];
      constrArray0[3] = (Constr) binaryClauses0;
      Vec<Constr> vec0 = new Vec<Constr>(constrArray0);
      // Undeclared exception!
      try { 
        sizeLCDS0.reduce(vec0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove all the binary clauses at once!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-8));
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, randomWalkDecorator0, lubyRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, lubyRestarts0);
      Vec<Constr> vec0 = new Vec<Constr>(32, binaryClauses0);
      vec0.growTo((-8), binaryClauses0);
      // Undeclared exception!
      try { 
        sizeLCDS0.reduce(vec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.Vec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructure> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      VarOrderHeap varOrderHeap0 = mock(VarOrderHeap.class, new ViolatedAssumptionAnswer());
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(noLearningNoHeuristics0, cardinalityDataStructure0, randomWalkDecorator0, eMARestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, eMARestarts0);
      sizeLCDS0.init();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMin> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(clauseOnlyLearning0, cardinalityDataStructureYanMin0, randomWalkDecorator0, lubyRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver0, lubyRestarts0);
      String string0 = sizeLCDS0.toString();
      assertEquals("Sized based learned constraints deletion strategy with timer luby style (SATZ_rand, TiniSAT) restarts strategy with factor 32", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      LearningStrategy<MixedDataStructureSingleWL> learningStrategy0 = (LearningStrategy<MixedDataStructureSingleWL>) mock(LearningStrategy.class, new ViolatedAssumptionAnswer());
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[18];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(learningStrategy0, mixedDataStructureSingleWL0, subsetVarOrder0, noRestarts0);
      SearchParams searchParams0 = solver0.getSearchParams();
      Solver<MixedDataStructureDanielWLConciseBinary> solver1 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, searchParams0, subsetVarOrder0, noRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver1, noRestarts0);
      ConflictTimer conflictTimer0 = sizeLCDS0.getTimer();
      assertSame(conflictTimer0, noRestarts0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      LearningStrategy<MixedDataStructureSingleWL> learningStrategy0 = (LearningStrategy<MixedDataStructureSingleWL>) mock(LearningStrategy.class, new ViolatedAssumptionAnswer());
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[18];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(learningStrategy0, mixedDataStructureSingleWL0, subsetVarOrder0, noRestarts0);
      SearchParams searchParams0 = solver0.getSearchParams();
      Solver<MixedDataStructureDanielWLConciseBinary> solver1 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, searchParams0, subsetVarOrder0, noRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver1, noRestarts0);
      sizeLCDS0.onClauseLearning((Constr) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>(0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      LearningStrategy<MixedDataStructureSingleWL> learningStrategy0 = (LearningStrategy<MixedDataStructureSingleWL>) mock(LearningStrategy.class, new ViolatedAssumptionAnswer());
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[3];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(learningStrategy0, mixedDataStructureSingleWL0, subsetVarOrder0, noRestarts0);
      SearchParams searchParams0 = solver0.getSearchParams();
      Solver<CardinalityDataStructure> solver1 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, subsetVarOrder0, noRestarts0);
      SizeLCDS sizeLCDS0 = new SizeLCDS(solver1, noRestarts0);
      sizeLCDS0.onPropagation((Constr) null);
  }
}
