/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:28:09 GMT 2019
 */

package org.sat4j.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.ConstrGroup;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.cnf.LearntBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.ManyCore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstrGroup_ESTest extends ConstrGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      Constr constr0 = Constr.TAUTOLOGY;
      constrGroup0.add(constr0);
      constrGroup0.add(constr0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(dimacsOutputSolver0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iVecInt0).get(anyInt());
      OriginalBinaryClause originalBinaryClause0 = OriginalBinaryClause.brandNewClause(unitPropagationListener0, iLits0, iVecInt0);
      constrGroup0.add(originalBinaryClause0);
      int int0 = constrGroup0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      Constr constr0 = Constr.TAUTOLOGY;
      constrGroup0.add(constr0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(dimacsOutputSolver0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      Constr constr0 = Constr.TAUTOLOGY;
      constrGroup0.add(constr0);
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom((ISolver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.getConstr(2533);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      boolean boolean0 = constrGroup0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      LearntBinaryClause learntBinaryClause0 = new LearntBinaryClause(iVecInt0, iLits0);
      constrGroup0.add(learntBinaryClause0);
      boolean boolean0 = constrGroup0.learnt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      String[] stringArray0 = new String[0];
      GateTranslator[] gateTranslatorArray0 = new GateTranslator[5];
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      gateTranslatorArray0[0] = gateTranslator0;
      gateTranslatorArray0[1] = gateTranslator0;
      gateTranslatorArray0[2] = gateTranslator0;
      gateTranslatorArray0[3] = gateTranslator0;
      gateTranslatorArray0[4] = gateTranslator0;
      ManyCore<GateTranslator> manyCore0 = new ManyCore<GateTranslator>(stringArray0, gateTranslatorArray0);
      VecInt vecInt0 = new VecInt(0, 0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(manyCore0, vecInt0);
      Constr constr0 = mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(vecInt0, (-645));
      constrGroup0.add(constr0);
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(abstractMinimalModel0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only remove a group of constraints!
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(true);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      constrGroup0.removeFrom(iSolver0);
      assertFalse(constrGroup0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.add((IConstr) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      constrGroup0.add((IConstr) null);
      // Undeclared exception!
      try { 
        constrGroup0.learnt();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      int int0 = constrGroup0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      constrGroup0.clear();
      assertEquals(0, constrGroup0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      // Undeclared exception!
      try { 
        constrGroup0.get(698);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      boolean boolean0 = constrGroup0.canBePropagatedMultipleTimes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      String string0 = constrGroup0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      IConstr iConstr0 = constrGroup0.getConstr(1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.toString((VarMapper) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      double double0 = constrGroup0.getActivity();
      assertEquals(0.0, double0, 0.01);
  }
}
