/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 07:33:45 GMT 2019
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
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomWalkDecorator_ESTest extends RandomWalkDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.setProbability(0.0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0, 0);
      randomWalkDecorator0.updateVarAtDecisionLevel(688);
      assertEquals(0.0, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.setVarDecay(1.5);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, (-2751.3209444972));
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      randomWalkDecorator0.printStat(printWriter0, "Number of processors \t");
      assertEquals((-2751.3209444972), randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.assignLiteral(0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.varActivity(1);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0E-100;
      varOrderHeap0.activity = doubleArray0;
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      double double0 = randomWalkDecorator0.varActivity(1);
      assertEquals(1.0E-100, double0, 0.01);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      String string0 = randomWalkDecorator0.toString();
      assertEquals("tries to first branch on a single phase watched unassigned variable (pure literal if using a CB data structure) else VSIDS from MiniSAT with random walks 0.01", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      levelBasedVarOrderHeap0.activity = null;
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      double[] doubleArray0 = new double[0];
      pureOrder0.activity = doubleArray0;
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, (-399.33104846));
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals((-399.33104846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = randomWalkDecorator0.getPhaseSelectionStrategy();
      randomWalkDecorator0.setPhaseSelectionStrategy(iPhaseSelectionStrategy0);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null, 1.0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varDecayActivity();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity(698);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 349
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      varOrderHeap0.setLits(iLits0);
      randomWalkDecorator0.init();
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo(48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setLits((ILits) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.getVariableHeuristics();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      varOrderHeap0.setLits(iLits0);
      randomWalkDecorator0.init();
      randomWalkDecorator0.select();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, (-772));
      // Undeclared exception!
      try { 
        randomWalkDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setVarDecay(0.3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.init();
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
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.printStat((PrintWriter) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 0.01);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.undo(3670);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.assignLiteral(1244);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null, 1.0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVarAtDecisionLevel((-868));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.varActivity((-1376));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      randomWalkDecorator0.setProbability(0.0);
      double double0 = randomWalkDecorator0.getProbability();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.varDecayActivity();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.updateVar((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      randomWalkDecorator0.getVariableHeuristics();
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.getPhaseSelectionStrategy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        randomWalkDecorator0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RandomWalkDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      randomWalkDecorator0.setLits((ILits) null);
      assertEquals(0.01, randomWalkDecorator0.getProbability(), 0.01);
  }
}
