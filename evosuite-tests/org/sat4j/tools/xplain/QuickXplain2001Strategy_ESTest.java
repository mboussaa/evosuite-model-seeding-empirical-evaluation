/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:25:41 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.xplain.QuickXplain2001Strategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuickXplain2001Strategy_ESTest extends QuickXplain2001Strategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("initial unsat core ");
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(dimacsOutputSolver0, solutionFoundListener0);
      GroupClauseSelectorSolver<ModelIteratorToSATAdapter> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      Map<Integer, Integer> map0 = groupClauseSelectorSolver0.getVarToHighLevel();
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(dimacsOutputSolver0, map0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(modelIteratorToSATAdapter0).nVars();
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      IVecInt iVecInt1 = iVecInt0.pop();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain((ISolver) null, hashMap0, iVecInt1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(modelIteratorToSATAdapter0).nVars();
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      HashMap<Integer, ModelIteratorToSATAdapter> hashMap0 = new HashMap<Integer, ModelIteratorToSATAdapter>();
      Integer integer0 = Integer.valueOf(4);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter1 = new ModelIteratorToSATAdapter(optToSatAdapter0, (-4370), solutionFoundListener0);
      hashMap0.put(integer0, modelIteratorToSATAdapter1);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter2 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(modelIteratorToSATAdapter2).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("org.sIt4j.tools.MultiTracA-g").when(modelIteratorToSATAdapter2).getLogPrefix();
      doReturn(true).when(modelIteratorToSATAdapter2).isVerbose();
      doReturn(iVecInt0).when(modelIteratorToSATAdapter2).unsatExplanation();
      ClausalCardinalitiesDecorator<ModelIteratorToSATAdapter> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter2);
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(clausalCardinalitiesDecorator0, hashMap0, iVecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(modelIteratorToSATAdapter0).nVars();
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter1 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(modelIteratorToSATAdapter1).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(false).when(modelIteratorToSATAdapter1).isVerbose();
      doReturn(iVecInt0).when(modelIteratorToSATAdapter1).unsatExplanation();
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator1 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter1);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator1);
      HashMap<Integer, ModelIteratorToSATAdapter> hashMap0 = new HashMap<Integer, ModelIteratorToSATAdapter>();
      IVecInt iVecInt1 = quickXplain2001Strategy0.explain(optToSatAdapter0, hashMap0, iVecInt0);
      assertEquals(0, iVecInt1.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(modelIteratorToSATAdapter0).nVars();
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      HashMap<Integer, ModelIteratorToSATAdapter> hashMap0 = new HashMap<Integer, ModelIteratorToSATAdapter>();
      VecInt vecInt0 = new VecInt(16, (-4370));
      ModelIteratorToSATAdapter modelIteratorToSATAdapter1 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(modelIteratorToSATAdapter1).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn("org.sIt4j.tools.MultiTracA-g").when(modelIteratorToSATAdapter1).getLogPrefix();
      doReturn(true).when(modelIteratorToSATAdapter1).isVerbose();
      doReturn(vecInt0).when(modelIteratorToSATAdapter1).unsatExplanation();
      ClausalCardinalitiesDecorator<ModelIteratorToSATAdapter> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter1);
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(clausalCardinalitiesDecorator0, hashMap0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(modelIteratorToSATAdapter0).isVerbose();
      doReturn(0, 0).when(modelIteratorToSATAdapter0).nVars();
      doReturn((IVecInt) null).when(modelIteratorToSATAdapter0).unsatExplanation();
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(lexicoDecorator0);
      HashMap<Integer, ModelIteratorToSATAdapter> hashMap0 = new HashMap<Integer, ModelIteratorToSATAdapter>();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter1 = new ModelIteratorToSATAdapter(optToSatAdapter0, (-4370), solutionFoundListener0);
      ClausalCardinalitiesDecorator<ModelIteratorToSATAdapter> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter1);
      // Undeclared exception!
      try { 
        quickXplain2001Strategy0.explain(clausalCardinalitiesDecorator0, hashMap0, iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.QuickXplain2001Strategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      String string0 = quickXplain2001Strategy0.toString();
      assertEquals("QuickXplain (IJCAI WS 2001 version) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QuickXplain2001Strategy quickXplain2001Strategy0 = new QuickXplain2001Strategy();
      quickXplain2001Strategy0.cancelExplanationComputation();
      assertEquals("QuickXplain (IJCAI WS 2001 version) minimization strategy", quickXplain2001Strategy0.toString());
  }
}
