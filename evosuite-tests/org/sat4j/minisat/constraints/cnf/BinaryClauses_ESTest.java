/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 06:57:48 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.cnf.BinaryClauses;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.core.WatcherBasedPrimeImplicantStrategy;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;
import org.sat4j.tools.DotSearchTracing;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BinaryClauses_ESTest extends BinaryClauses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 128);
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      binaryClauses0.calcReason((-1628), vecInt0);
      assertEquals(129, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClauseOnlyLearning<CardinalityDataStructureYanMax> clauseOnlyLearning0 = new ClauseOnlyLearning<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0.0, 0.0, 0.0, 0);
      VarOrderHeap varOrderHeap0 = mock(VarOrderHeap.class, new ViolatedAssumptionAnswer());
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      ArminRestarts arminRestarts0 = new ArminRestarts();
      ASolverFactory<SubModelIterator> aSolverFactory0 = (ASolverFactory<SubModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<SubModelIterator> basicLauncher0 = new BasicLauncher<SubModelIterator>(aSolverFactory0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(clauseOnlyLearning0, cardinalityDataStructureYanMax0, searchParams0, randomWalkDecorator0, arminRestarts0, basicLauncher0);
      ILits iLits0 = solver0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 0);
      binaryClauses0.setLearnt();
      assertTrue(binaryClauses0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 32);
      binaryClauses0.register();
      assertEquals(0, binaryClauses0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1614));
      binaryClauses0.addBinaryClause((-1614));
      binaryClauses0.removeBinaryClause((-1614));
      assertFalse(binaryClauses0.locked());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, (-223));
      int int0 = binaryClauses0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 32);
      binaryClauses0.addBinaryClause((-1));
      int int0 = binaryClauses0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 7);
      // Undeclared exception!
      try { 
        binaryClauses0.removeBinaryClause(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, (-1133));
      // Undeclared exception!
      try { 
        binaryClauses0.propagate((UnitPropagationListener) null, (-1133));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 1244);
      // Undeclared exception!
      try { 
        binaryClauses0.propagate((UnitPropagationListener) null, 1244);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1244
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 10);
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        binaryClauses0.calcReason(0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 3232);
      // Undeclared exception!
      try { 
        binaryClauses0.calcReason(3232, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink(128);
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 0);
      // Undeclared exception!
      try { 
        binaryClauses0.calcReason((-1), vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -128
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 1244);
      binaryClauses0.addBinaryClause(1244);
      // Undeclared exception!
      try { 
        binaryClauses0.propagatePI(watcherBasedPrimeImplicantStrategy0, 1244);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.WatcherBasedPrimeImplicantStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 9);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      boolean boolean0 = binaryClauses0.propagatePI(watcherBasedPrimeImplicantStrategy0, 110);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 0);
      // Undeclared exception!
      try { 
        binaryClauses0.calcReason((-1), vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 9);
      binaryClauses0.calcReason(7, vecInt0);
      assertEquals(8, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(4540, 4540);
      NoRestarts noRestarts0 = new NoRestarts();
      ActiveLearning<CardinalityDataStructureYanMax> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMax>();
      PureOrder pureOrder0 = new PureOrder(4540);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(activeLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, noRestarts0);
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 1);
      binaryClauses0.addBinaryClause(1);
      boolean boolean0 = binaryClauses0.propagate(solver0, 4540);
      assertEquals(1, solver0.getPropagationLevel());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 940);
      // Undeclared exception!
      try { 
        binaryClauses0.calcReasonOnTheFly((-40), (IVecInt) null, (IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-2667));
      // Undeclared exception!
      try { 
        binaryClauses0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 1047);
      binaryClauses0.rescaleBy(1047);
      assertFalse(binaryClauses0.locked());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 0);
      boolean boolean0 = binaryClauses0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 832);
      // Undeclared exception!
      try { 
        binaryClauses0.assertConstraintIfNeeded((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 3845);
      boolean boolean0 = binaryClauses0.locked();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 30);
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        binaryClauses0.getAssertionLevel(iVecInt0, 30);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 8);
      double double0 = binaryClauses0.getActivity();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, (-2355));
      // Undeclared exception!
      try { 
        binaryClauses0.isSatisfied();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 32);
      binaryClauses0.undo(0);
      assertTrue(binaryClauses0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 1486);
      binaryClauses0.incActivity(50);
      assertEquals(0.0, binaryClauses0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 699);
      // Undeclared exception!
      try { 
        binaryClauses0.remove((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove all the binary clauses at once!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 960);
      // Undeclared exception!
      try { 
        binaryClauses0.get(960);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1614));
      // Undeclared exception!
      try { 
        binaryClauses0.removeBinaryClause((-1614));
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, (-6618));
      // Undeclared exception!
      try { 
        binaryClauses0.canBeSatisfiedByCountingLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 2410);
      // Undeclared exception!
      try { 
        binaryClauses0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1498));
      Constr constr0 = binaryClauses0.toConstraint();
      assertEquals(0, constr0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-1281));
      // Undeclared exception!
      try { 
        binaryClauses0.forwardActivity((-1281));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 0);
      boolean boolean0 = binaryClauses0.canBePropagatedMultipleTimes();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, 128);
      // Undeclared exception!
      try { 
        binaryClauses0.setActivity(629.1265029999385);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BinaryClauses binaryClauses0 = new BinaryClauses((ILits) null, 1);
      boolean boolean0 = binaryClauses0.simplify();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-288));
      DotSearchTracing<Object> dotSearchTracing0 = new DotSearchTracing<Object>("");
      // Undeclared exception!
      try { 
        binaryClauses0.toString((VarMapper) dotSearchTracing0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Lits lits0 = new Lits();
      BinaryClauses binaryClauses0 = new BinaryClauses(lits0, (-2014));
      // Undeclared exception!
      try { 
        binaryClauses0.requiredNumberOfSatisfiedLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }
}
