/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:59:39 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.cnf.UnitClauses;
import org.sat4j.minisat.core.Solver;
import org.sat4j.specs.FakeConstr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.encoding.Binary;
import org.sat4j.tools.encoding.Commander;
import org.sat4j.tools.encoding.Policy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Binary_ESTest extends Binary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(iVecInt0).size();
      UnitClauses unitClauses0 = new UnitClauses(iVecInt0);
      assertTrue(unitClauses0.isSatisfied());
      assertFalse(unitClauses0.canBePropagatedMultipleTimes());
      assertFalse(unitClauses0.simplify());
      assertNotNull(unitClauses0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, unitClauses0, unitClauses0).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(25).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertTrue(unitClauses0.isSatisfied());
      assertFalse(unitClauses0.canBePropagatedMultipleTimes());
      assertFalse(unitClauses0.simplify());
      assertNotNull(clausalCardinalitiesDecorator0);
      
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(1197, 1179, 37, 2).when(iSolver0).nVars();
      IVecInt iVecInt1 = AbstractMinimalModel.negativeLiterals(iSolver0);
      assertEquals((-2), iVecInt1.last());
      assertEquals(2, iVecInt1.size());
      assertFalse(iVecInt1.isEmpty());
      assertNotNull(iVecInt1);
      
      IConstr iConstr0 = binary0.addExactlyOne(clausalCardinalitiesDecorator0, iVecInt1);
      assertTrue(unitClauses0.isSatisfied());
      assertFalse(unitClauses0.canBePropagatedMultipleTimes());
      assertFalse(unitClauses0.simplify());
      assertEquals((-2), iVecInt1.last());
      assertEquals(2, iVecInt1.size());
      assertFalse(iVecInt1.isEmpty());
      assertEquals(2, iConstr0.size());
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
      assertNotNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(solver0).isVerbose();
      doReturn((int[]) null).when(solver0).primeImplicant();
      Policy policy0 = new Policy();
      assertNotNull(policy0);
      
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      int[] intArray0 = clausalCardinalitiesDecorator0.primeImplicant();
      assertNull(intArray0);
      
      IConstr iConstr0 = FakeConstr.instance();
      assertNotNull(iConstr0);
      
      boolean boolean0 = clausalCardinalitiesDecorator0.isVerbose();
      assertFalse(boolean0);
      
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(1197, 1179, 0).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(iSolver0);
      assertEquals(1, iVecInt0.size());
      assertEquals((-1), iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
      assertNotNull(iVecInt0);
      
      int int0 = 2251;
      IConstr iConstr1 = binary0.addExactlyOne(clausalCardinalitiesDecorator0, iVecInt0);
      assertEquals(1, iVecInt0.size());
      assertEquals((-1), iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
      assertEquals(2, iConstr1.size());
      assertFalse(iConstr1.canBePropagatedMultipleTimes());
      assertEquals(0.0, iConstr1.getActivity(), 0.01);
      assertNotNull(iConstr1);
      
      boolean boolean1 = iVecInt0.contains(int0);
      assertEquals(1, iVecInt0.size());
      assertEquals((-1), iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      String string0 = binary0.toString();
      assertNotNull(string0);
      assertEquals("org.sat4j.tools.encoding.Binary", string0);
      
      boolean boolean2 = iVecInt0.contains(int0);
      assertEquals(1, iVecInt0.size());
      assertEquals((-1), iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
      
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      assertEquals(1, iVecInt0.size());
      assertEquals((-1), iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
      assertEquals(1, readOnlyVecInt0.size());
      assertFalse(readOnlyVecInt0.isEmpty());
      assertNotNull(readOnlyVecInt0);
      
      // Undeclared exception!
      try { 
        readOnlyVecInt0.remove(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0).when(solver0).nVars();
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(clausalCardinalitiesDecorator0);
      assertTrue(iVecInt0.isEmpty());
      assertEquals(0, iVecInt0.size());
      assertNotNull(iVecInt0);
      
      // Undeclared exception!
      try { 
        binary0.addExactlyOne(clausalCardinalitiesDecorator0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(1427, 1427, 1427, 1427, 1427).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(iSolver0);
      assertEquals((-1427), iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
      assertEquals(1427, iVecInt0.size());
      assertNotNull(iVecInt0);
      
      // Undeclared exception!
      binary0.addExactly(clausalCardinalitiesDecorator0, iVecInt0, 1427);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      // Undeclared exception!
      try { 
        binary0.addExactly((ISolver) null, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(solver0).nVars();
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      SolutionFoundListener solutionFoundListener0 = mock(SolutionFoundListener.class, new ViolatedAssumptionAnswer());
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(clausalCardinalitiesDecorator0, solutionFoundListener0);
      assertNotNull(minimal4CardinalityModel0);
      
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(minimal4CardinalityModel0);
      assertTrue(iVecInt0.isEmpty());
      assertEquals(0, iVecInt0.size());
      assertNotNull(iVecInt0);
      
      // Undeclared exception!
      try { 
        binary0.addExactly(clausalCardinalitiesDecorator0, iVecInt0, 81);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(858, 858, 858, 858, 858).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      VecInt vecInt0 = new VecInt(858, (-2910));
      assertEquals((-2910), vecInt0.last());
      assertEquals(858, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
      assertNotNull(vecInt0);
      
      // Undeclared exception!
      binary0.addAtMostOne(clausalCardinalitiesDecorator0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      // Undeclared exception!
      try { 
        binary0.addAtMostOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(solver0).nVars();
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(clausalCardinalitiesDecorator0);
      assertEquals(0, iVecInt0.size());
      assertTrue(iVecInt0.isEmpty());
      assertNotNull(iVecInt0);
      
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      assertEquals(0, iVecInt0.size());
      assertTrue(iVecInt0.isEmpty());
      assertTrue(readOnlyVecInt0.isEmpty());
      assertEquals(0, readOnlyVecInt0.size());
      assertNotNull(readOnlyVecInt0);
      
      // Undeclared exception!
      try { 
        binary0.addAtMostOne(clausalCardinalitiesDecorator0, readOnlyVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      // Undeclared exception!
      try { 
        binary0.addAtMost((ISolver) null, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(solver0).nVars();
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(clausalCardinalitiesDecorator0);
      assertEquals(0, iVecInt0.size());
      assertTrue(iVecInt0.isEmpty());
      assertNotNull(iVecInt0);
      
      // Undeclared exception!
      try { 
        binary0.addAtMost(clausalCardinalitiesDecorator0, iVecInt0, (-586));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binary", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Binary binary0 = new Binary();
      assertNotNull(binary0);
      
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      assertNotNull(commander0);
      
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      assertNotNull(clausalCardinalitiesDecorator0);
      
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(1427, 48, 48, 48, 48).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(iSolver0);
      assertEquals(48, iVecInt0.size());
      assertFalse(iVecInt0.isEmpty());
      assertEquals((-48), iVecInt0.last());
      assertNotNull(iVecInt0);
      
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      assertEquals(48, iVecInt0.size());
      assertFalse(iVecInt0.isEmpty());
      assertEquals((-48), iVecInt0.last());
      assertEquals(48, readOnlyVecInt0.size());
      assertFalse(readOnlyVecInt0.isEmpty());
      assertNotNull(readOnlyVecInt0);
      
      IConstr iConstr0 = binary0.addAtMost(clausalCardinalitiesDecorator0, readOnlyVecInt0, (byte)2);
      assertEquals(48, iVecInt0.size());
      assertFalse(iVecInt0.isEmpty());
      assertEquals((-48), iVecInt0.last());
      assertEquals(48, readOnlyVecInt0.size());
      assertFalse(readOnlyVecInt0.isEmpty());
      assertEquals(612, iConstr0.size());
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
      assertNotNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Binary binary0 = new Binary();
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      VecInt vecInt0 = new VecInt(48, 48);
      // Undeclared exception!
      binary0.addAtMost(clausalCardinalitiesDecorator0, vecInt0, 1417);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Binary binary0 = new Binary();
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      VecInt vecInt0 = new VecInt(26, 48);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      IConstr iConstr0 = binary0.addAtMostOne(clausalCardinalitiesDecorator0, readOnlyVecInt0);
      assertEquals(124, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Binary binary0 = new Binary();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(46, 46, (-227)).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(iSolver0);
      IConstr iConstr0 = binary0.addAtMostOne((ISolver) null, iVecInt0);
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Binary binary0 = new Binary();
      // Undeclared exception!
      try { 
        binary0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Binary binary0 = new Binary();
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(solver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(solver0).nextFreeVarId(anyBoolean());
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<MixedDataStructureDanielHT>>(solver0, commander0);
      VecInt vecInt0 = new VecInt(48, 48);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      IConstr iConstr0 = binary0.addExactly(clausalCardinalitiesDecorator0, readOnlyVecInt0, 48);
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
  }
}
