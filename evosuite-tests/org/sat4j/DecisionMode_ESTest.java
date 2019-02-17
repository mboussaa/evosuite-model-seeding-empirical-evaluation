/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:09:06 GMT 2019
 */

package org.sat4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.DecisionMode;
import org.sat4j.ExitCode;
import org.sat4j.ILauncherMode;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DecisionMode_ESTest extends DecisionMode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      InstanceReader instanceReader0 = new InstanceReader(dimacsStringSolver0);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("dzl#[0");
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      decisionMode0.solve(dimacsStringSolver0, instanceReader0, basicLauncher0, mockPrintWriter0, 585L);
      assertEquals(0L, dimacsStringSolver0.getTimeoutMs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      decisionMode0.solve(iSolver0, dimacsReader0, basicLauncher0, printWriter0, 10L);
      decisionMode0.getCurrentExitCode();
      assertEquals(ExitCode.SATISFIABLE, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      // Undeclared exception!
      try { 
        decisionMode0.solve((IProblem) null, dimacsReader0, (ILogAble) null, (PrintWriter) null, (-2300L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      DimacsReader dimacsReader0 = new DimacsReader(statisticsSolver0);
      // Undeclared exception!
      try { 
        decisionMode0.displayResult(statisticsSolver0, statisticsSolver0, (ILogAble) null, (PrintWriter) null, dimacsReader0, 151L, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      decisionMode0.solve(iSolver0, dimacsReader0, basicLauncher0, printWriter0, 10L);
      decisionMode0.onUnsatTermination();
      assertEquals(ExitCode.OPTIMUM_FOUND, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      decisionMode0.onUnsatTermination();
      assertEquals(ExitCode.UNKNOWN, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      //  // Unstable assertion: assertEquals(ExitCode.OPTIMUM_FOUND, decisionMode0.getCurrentExitCode());
      
      GroupClauseSelectorSolver<ModelIterator> groupClauseSelectorSolver0 = (GroupClauseSelectorSolver<ModelIterator>) mock(GroupClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(groupClauseSelectorSolver0).isSatisfiable();
      ClausalCardinalitiesDecorator<GroupClauseSelectorSolver<ModelIterator>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GroupClauseSelectorSolver<ModelIterator>>(groupClauseSelectorSolver0, (EncodingStrategyAdapter) null);
      DimacsReader dimacsReader0 = new DimacsReader(clausalCardinalitiesDecorator0);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      StringWriter stringWriter0 = new StringWriter(305);
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      decisionMode0.solve(clausalCardinalitiesDecorator0, dimacsReader0, iLogAble0, printWriter0, (-2518L));
      //  // Unstable assertion: assertEquals(ExitCode.UNSATISFIABLE, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      decisionMode0.solve(iSolver0, dimacsReader0, basicLauncher0, printWriter0, 10L);
      int[] intArray0 = new int[8];
      decisionMode0.onSolutionFound(intArray0);
      decisionMode0.displayResult(iSolver0, iSolver0, basicLauncher0, printWriter0, dimacsReader0, 1L, true);
      assertEquals(2147483, iSolver0.getTimeout());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      iSolver0.nVars();
      ISolver iSolver1 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      DimacsReader dimacsReader0 = new DimacsReader(iSolver1);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      basicLauncher0.log((String) null);
      basicLauncher0.log("Limit learning to clauses of size smaller or equal to ");
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      basicLauncher0.log((String) null);
      long long0 = (-2372L);
      DecisionMode decisionMode1 = (DecisionMode)ILauncherMode.DECISION;
      boolean boolean0 = false;
      decisionMode1.displayResult(iSolver0, iSolver0, basicLauncher0, printWriter0, dimacsReader0, (-2372L), false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      decisionMode0.solve(iSolver0, dimacsReader0, basicLauncher0, printWriter0, 10L);
      decisionMode0.displayResult(iSolver0, iSolver0, basicLauncher0, printWriter0, dimacsReader0, 1L, true);
      assertEquals(ExitCode.SATISFIABLE, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      decisionMode0.displayResult(iSolver0, iSolver0, basicLauncher0, printWriter0, dimacsReader0, 1L, true);
      assertFalse(iSolver0.isDBSimplificationAllowed());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASolverFactory<FullClauseSelectorSolver<ModelIterator>> aSolverFactory0 = (ASolverFactory<FullClauseSelectorSolver<ModelIterator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<FullClauseSelectorSolver<ModelIterator>> basicLauncher0 = new BasicLauncher<FullClauseSelectorSolver<ModelIterator>>(aSolverFactory0);
      basicLauncher0.displayResult();
      //  // Unstable assertion: assertEquals(ExitCode.OPTIMUM_FOUND, basicLauncher0.getExitCode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      ExitCode exitCode0 = ExitCode.OPTIMUM_FOUND;
      decisionMode0.setExitCode(exitCode0);
      assertEquals(ExitCode.OPTIMUM_FOUND, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      decisionMode0.setIncomplete(false);
      assertEquals(ExitCode.UNKNOWN, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      // Undeclared exception!
      try { 
        decisionMode0.onSolutionFound((IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      ExitCode exitCode0 = decisionMode0.getCurrentExitCode();
      assertEquals(ExitCode.UNKNOWN, exitCode0);
  }
}
