/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:25:41 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsOutputSolver_ESTest extends DimacsOutputSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses(0);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar(1);
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      dimacsOutputSolver0.newVar((-1));
      int int0 = dimacsOutputSolver0.nextFreeVarId(true);
      assertEquals("p cnf -1", stringWriter0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      dimacsOutputSolver0.newVar((-683));
      int int0 = dimacsOutputSolver0.nextFreeVarId(false);
      assertEquals((-683), dimacsOutputSolver0.nVars());
      assertEquals((-682), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbvars = (-1371);
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals((-1371), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbclauses = 9;
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nbclauses = (-1753);
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals((-1753), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.setExpectedNumberOfClauses(5000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.newVar((-4318));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(110, 110);
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      // Undeclared exception!
      dimacsOutputSolver0.addExactly(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null, 539);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.fixedNbClauses = true;
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(110, 110);
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      // Undeclared exception!
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1948);
      IVecInt iVecInt0 = vecInt0.push((-1214));
      IConstr iConstr0 = dimacsOutputSolver0.addClause(iVecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = VecInt.EMPTY;
      dimacsOutputSolver0.addClause(iVecInt0);
      IConstr iConstr0 = dimacsOutputSolver0.addClause(iVecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1948);
      IVecInt iVecInt0 = vecInt0.push((-1214));
      IConstr iConstr0 = dimacsOutputSolver0.addClause(iVecInt0, 1948);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nextFreeVarId(true);
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(1, dimacsOutputSolver0.realNumberOfVariables());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, (-2422));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, 2684);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 2684
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast((IVecInt) null, (-10));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(110);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(vecInt0, 110);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 110
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(110);
      vecInt0.insertFirst(110);
      vecInt0.insertFirst(110);
      IConstr iConstr0 = dimacsOutputSolver0.addExactly(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-1126));
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost((IVecInt) null, (-1203));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost((IVecInt) null, 21);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 21
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(110);
      dimacsOutputSolver0.setExpectedNumberOfClauses((-570));
      dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      assertEquals((-570), dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(110);
      dimacsOutputSolver0.addAtLeast(vecInt0, 1);
      IConstr iConstr0 = dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.printStat((PrintWriter) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.getAddedVars();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.registerLiteral(36);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      String string0 = dimacsOutputSolver0.toString("c<Aa");
      assertEquals("Dimacs output solver", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addParity((IVecInt) null, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.reset();
      assertEquals(0, dimacsOutputSolver0.getTimeout());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.newVar();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      File file0 = MockFile.createTempFile("|n#bjl}bs36;!_", ")rQdegBXG]9");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(mockPrintWriter0);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.modelWithInternalVariables();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.printInfos((PrintWriter) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.primeImplicant(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }
}
