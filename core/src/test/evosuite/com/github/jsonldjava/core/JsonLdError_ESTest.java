/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 13:54:19 GMT 2020
 */

package com.github.jsonldjava.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.jsonldjava.core.JsonLdError;
import java.sql.BatchUpdateException;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonLdError_ESTest extends JsonLdError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.INVALID_CONTAINER_MAPPING;
      Integer integer0 = new Integer((-302));
      JsonLdError jsonLdError0 = new JsonLdError(jsonLdError_Error0, integer0);
      JsonLdError.Error jsonLdError_Error1 = jsonLdError0.getType();
      assertEquals(JsonLdError.Error.INVALID_CONTAINER_MAPPING, jsonLdError_Error1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsonLdError jsonLdError0 = new JsonLdError((JsonLdError.Error) null);
      // Undeclared exception!
      try { 
        jsonLdError0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdError", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.CONFLICTING_INDEXES;
      String string0 = jsonLdError_Error0.toString();
      assertEquals("conflicting indexes", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.CONFLICTING_INDEXES;
      SQLException sQLException0 = new SQLException();
      JsonLdError jsonLdError0 = new JsonLdError(jsonLdError_Error0, (Object) null, sQLException0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.INVALID_INPUT;
      Object object0 = new Object();
      int[] intArray0 = new int[3];
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(intArray0);
      JsonLdError jsonLdError0 = new JsonLdError(jsonLdError_Error0, object0, batchUpdateException0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.KEYWORD_REDEFINITION;
      JsonLdError jsonLdError0 = new JsonLdError(jsonLdError_Error0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.LIST_OF_LISTS;
      JsonLdError jsonLdError0 = new JsonLdError(jsonLdError_Error0, "INVALID_LANGUAGE_MAP_VALUE");
      String string0 = jsonLdError0.getMessage();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JsonLdError.Error jsonLdError_Error0 = JsonLdError.Error.INVALID_REVERSE_VALUE;
      JsonLdError jsonLdError0 = new JsonLdError(jsonLdError_Error0, (Throwable) null);
      String string0 = jsonLdError0.getMessage();
      assertEquals("invalid @reverse value", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JsonLdError jsonLdError0 = new JsonLdError((JsonLdError.Error) null);
      jsonLdError0.getType();
  }
}
