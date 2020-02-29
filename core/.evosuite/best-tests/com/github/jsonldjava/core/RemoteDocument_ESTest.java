/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 13:54:46 GMT 2020
 */

package com.github.jsonldjava.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.jsonldjava.core.RemoteDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteDocument_ESTest extends RemoteDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteDocument remoteDocument0 = new RemoteDocument((String) null, (Object) null);
      String string0 = remoteDocument0.getDocumentUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoteDocument remoteDocument0 = new RemoteDocument(":7'Q;!A+w343QG", ":7'Q;!A+w343QG");
      String string0 = remoteDocument0.getDocumentUrl();
      assertEquals(":7'Q;!A+w343QG", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoteDocument remoteDocument0 = new RemoteDocument((String) null, (Object) null);
      Object object0 = remoteDocument0.getDocument();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RemoteDocument remoteDocument0 = new RemoteDocument("", "");
      Object object0 = remoteDocument0.getDocument();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RemoteDocument remoteDocument0 = new RemoteDocument("", "");
      String string0 = remoteDocument0.getDocumentUrl();
      assertEquals("", string0);
  }
}