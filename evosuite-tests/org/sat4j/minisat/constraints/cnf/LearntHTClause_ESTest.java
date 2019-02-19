/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:15:19 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.LearntHTClause;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.WatcherBasedPrimeImplicantStrategy;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LearntHTClause_ESTest extends LearntHTClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinOneDecorator[] minOneDecoratorArray0 = new MinOneDecorator[1];
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(493, 6, 6, 0).when(minOneDecorator0).nVars();
      minOneDecoratorArray0[0] = minOneDecorator0;
      ManyCore<MinOneDecorator> manyCore0 = new ManyCore<MinOneDecorator>(minOneDecoratorArray0);
      LexicoDecorator<ManyCore<MinOneDecorator>> lexicoDecorator0 = new LexicoDecorator<ManyCore<MinOneDecorator>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      LearntHTClause learntHTClause0 = new LearntHTClause(iVecInt0, (ILits) null);
      learntHTClause0.incActivity(1349.5606);
      assertEquals(1349.5606, learntHTClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-122);
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.insertFirst(0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, iLits0);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[6];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.insertFirst(492);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, iLits0);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 493
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Lits lits0 = new Lits();
      IVecInt iVecInt0 = VecInt.EMPTY;
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause(iVecInt0, lits0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause((IVecInt) null, lits0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause(vecInt0, lits0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause(vecInt0, (ILits) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[2];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MinOneDecorator[] minOneDecoratorArray0 = new MinOneDecorator[1];
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(493, 6, 6, 0).when(minOneDecorator0).nVars();
      minOneDecoratorArray0[0] = minOneDecorator0;
      ManyCore<MinOneDecorator> manyCore0 = new ManyCore<MinOneDecorator>(minOneDecoratorArray0);
      LexicoDecorator<ManyCore<MinOneDecorator>> lexicoDecorator0 = new LexicoDecorator<ManyCore<MinOneDecorator>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      LearntHTClause learntHTClause0 = new LearntHTClause(iVecInt0, (ILits) null);
      learntHTClause0.forwardActivity(493);
      assertEquals(0.0, learntHTClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(3);
      vecInt0.unsafePush(3);
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, (ILits) null);
      learntHTClause0.setLearnt();
      assertTrue(learntHTClause0.canBeSatisfiedByCountingLiterals());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        learntHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 5);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.LearntHTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      learntHTClause0.setActivity(1.5);
      assertEquals(1.5, learntHTClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      boolean boolean0 = learntHTClause0.learnt();
      assertTrue(boolean0);
  }
}
