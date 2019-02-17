/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:07:19 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.MUSLauncher;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClausalDataStructureWL_ESTest extends ClausalDataStructureWL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      ILits iLits0 = clausalDataStructureWL0.createLits();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause(readOnlyVecInt0);
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
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(3414);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause(iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(47);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(3414);
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(3413);
      vecInt0.shrinkTo(3413);
      // Undeclared exception!
      clausalDataStructureWL0.createClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(3414, 3414);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      PercentLengthLearning<MixedDataStructureDanielHT> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams();
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(percentLengthLearning0, mixedDataStructureDanielHT0, searchParams0, pureOrder0, lubyRestarts0, iLogAble0);
      clausalDataStructureWL0.solver = (UnitPropagationListener) solver0;
      clausalDataStructureWL0.createClause(iVecInt0);
      iVecInt0.insertFirst(32);
      iVecInt0.insertFirst(2);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(3430);
      IVecInt iVecInt0 = vecInt0.pop();
      PercentLengthLearning<MixedDataStructureDanielHT> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams();
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts(3430);
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(percentLengthLearning0, mixedDataStructureDanielHT0, searchParams0, pureOrder0, lubyRestarts0, mUSLauncher0);
      clausalDataStructureWL0.solver = (UnitPropagationListener) solver0;
      clausalDataStructureWL0.createClause(iVecInt0);
      vecInt0.insertFirst(1);
      Constr constr0 = clausalDataStructureWL0.createClause(iVecInt0);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      PercentLengthLearning<MixedDataStructureDanielHT> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams();
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(percentLengthLearning0, mixedDataStructureDanielHT0, searchParams0, pureOrder0, lubyRestarts0, mUSLauncher0);
      clausalDataStructureWL0.solver = (UnitPropagationListener) solver0;
      clausalDataStructureWL0.createClause(iVecInt0);
      vecInt0.insertFirst(32);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(3414);
      Constr constr0 = clausalDataStructureWL0.createUnregisteredClause(vecInt0);
      assertEquals(0.0, constr0.getActivity(), 0.01);
  }
}
