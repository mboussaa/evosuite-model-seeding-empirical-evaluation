/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:58:54 GMT 2019
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
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Ladder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Ladder_ESTest extends Ladder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(773, 773, 2527, 0).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(iSolver0);
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver1 = lightFactory0.lightSolver();
      try { 
        ladder0.addExactlyOne(iSolver1, iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(abstractMinimalModel0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(209, 209, 2130, 0).when(abstractMinimalModel0).nVars();
      doReturn(0).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0, (SolutionFoundListener) null);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      IConstr iConstr0 = ladder0.addExactlyOne(optToSatAdapter0, iVecInt0);
      assertEquals(4, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      VecInt vecInt0 = new VecInt(791, 791);
      // Undeclared exception!
      try { 
        ladder0.addExactlyOne((ISolver) null, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Ladder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(abstractMinimalModel0).nVars();
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0, true);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        ladder0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Ladder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(abstractMinimalModel0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0).when(abstractMinimalModel0).nVars();
      doReturn(27, 27, 27, 27, 27).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0, true);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(fullClauseSelectorSolver0);
      iVecInt0.shrink((-229));
      // Undeclared exception!
      try { 
        ladder0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(abstractMinimalModel0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(1971, 1300, 1971, 0).when(abstractMinimalModel0).nVars();
      doReturn(0, 0, 0).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      IConstr iConstr0 = ladder0.addAtMostOne(lexicoDecorator0, iVecInt0);
      assertEquals(2, iVecInt0.size());
      assertEquals(8, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(statisticsSolver0);
      // Undeclared exception!
      try { 
        ladder0.addAtMostOne(statisticsSolver0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      VecInt vecInt0 = new VecInt(791);
      // Undeclared exception!
      try { 
        ladder0.addAtMostOne((ISolver) null, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Ladder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(iSolver0);
      iVecInt0.shrink(43);
      // Undeclared exception!
      try { 
        ladder0.addAtMostOne(iSolver0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Ladder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0, true);
      VecInt vecInt0 = new VecInt(791);
      vecInt0.unsafePush(791);
      // Undeclared exception!
      try { 
        ladder0.addAtMostOne(fullClauseSelectorSolver0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(abstractMinimalModel0).nVars();
      doReturn(27).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0, true);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        ladder0.addAtMostOne(fullClauseSelectorSolver0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.tools.encoding.Ladder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(abstractMinimalModel0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(27, 27, 27, 27, 27).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0, true);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(1400, 1914, 2, 58, 58).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(iSolver0);
      iVecInt0.shrink(43);
      IConstr iConstr0 = ladder0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
      assertEquals(15, iVecInt0.last());
      assertEquals(56, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null, (IConstr) null).when(abstractMinimalModel0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(27, 27, 27, 27, 27).when(abstractMinimalModel0).nextFreeVarId(anyBoolean());
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0, true);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(1400, 1914, 2, 58, 58).when(iSolver0).nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(iSolver0);
      // Undeclared exception!
      try { 
        ladder0.addExactlyOne(fullClauseSelectorSolver0, iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ladder ladder0 = new Ladder();
      AbstractMinimalModel abstractMinimalModel0 = mock(AbstractMinimalModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(abstractMinimalModel0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(1716, 50, 1716, 0).when(abstractMinimalModel0).nVars();
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0, (SolutionFoundListener) null);
      optToSatAdapter0.nVars();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      IConstr iConstr0 = ladder0.addExactlyOne(optToSatAdapter0, iVecInt0);
      assertEquals(1, iConstr0.size());
      assertEquals(1, iVecInt0.size());
  }
}
