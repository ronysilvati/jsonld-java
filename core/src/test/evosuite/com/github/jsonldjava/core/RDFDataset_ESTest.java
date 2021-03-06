/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 13:52:20 GMT 2020
 */

package com.github.jsonldjava.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.jsonldjava.core.JsonLdApi;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.RDFDataset;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RDFDataset_ESTest extends RDFDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.addQuad("", "", "", "", "", "");
      assertEquals(2, rDFDataset0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("Dn", "Dn", "Dn");
      RDFDataset.Literal rDFDataset_Literal1 = new RDFDataset.Literal("Dn", "Dn", "t+z(X_13?'e+");
      int int0 = rDFDataset_Literal0.compareTo((RDFDataset.Node) rDFDataset_Literal1);
      assertEquals((-48), int0);
      assertTrue(rDFDataset_Literal1.isLiteral());
      assertFalse(rDFDataset_Literal1.isIRI());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("com.github.jsonldjava.core.RDFDataset$IRI", "Predicates.not(", "Predicates.not(", "of38w ^~\"DsE");
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("6(1(7D!K|");
      RDFDataset.Quad rDFDataset_Quad1 = new RDFDataset.Quad(rDFDataset_BlankNode0, rDFDataset_BlankNode0, rDFDataset_BlankNode0, "of38w ^~\"DsE");
      int int0 = rDFDataset_Quad0.compareTo(rDFDataset_Quad1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("5\"VPZ'+GtXf||", "5\"VPZ'+GtXf||", "", "^}OqJI54!\")+Qcqx7*", "^}OqJI54!\")+Qcqx7*", "");
      RDFDataset.Quad rDFDataset_Quad1 = new RDFDataset.Quad("Noi", "^}OqJI54!\")+Qcqx7*", "false", "@value");
      int int0 = rDFDataset_Quad0.compareTo(rDFDataset_Quad1);
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("5");
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("R$", "5", "<DmM30&$");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_Literal0, rDFDataset_BlankNode0, rDFDataset_BlankNode0, "<DmM30&$");
      rDFDataset_Quad0.getGraph();
      assertEquals(4, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("Dn", "Dn", "Dn");
      boolean boolean0 = rDFDataset_Literal0.isLiteral();
      assertEquals(4, rDFDataset_Literal0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("jX^#sD1WKV\"tg", "?1;", "rX.mU3{fgGQN q{quE");
      rDFDataset_Literal0.getValue();
      assertEquals(4, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("Dn", "Dn", "Dn");
      String string0 = rDFDataset_Literal0.getLanguage();
      assertNotNull(string0);
      assertEquals(4, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("Dn", "Dn", "Dn");
      String string0 = rDFDataset_Literal0.getDatatype();
      assertNotNull(string0);
      assertEquals(4, rDFDataset_Literal0.size());
      assertEquals("Dn", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("`R", "", "`R");
      boolean boolean0 = rDFDataset_Literal0.isLiteral();
      assertEquals(4, rDFDataset_Literal0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("", "  ?pQ2", "BitArrays must be of equal length (%s != %s)", "XQG[&f1*", "", "");
      RDFDataset.Node rDFDataset_Node0 = rDFDataset_Quad0.getObject();
      boolean boolean0 = rDFDataset_Node0.isIRI();
      assertEquals(4, rDFDataset_Node0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("", "json-ld-1.1", (String) null);
      boolean boolean0 = rDFDataset_Literal0.isBlankNode();
      assertFalse(boolean0);
      assertEquals(3, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI("");
      boolean boolean0 = rDFDataset_IRI0.isIRI();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI("");
      boolean boolean0 = rDFDataset_IRI0.isBlankNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("");
      boolean boolean0 = rDFDataset_BlankNode0.isBlankNode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Float float0 = new Float(1506.2523F);
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(")xUstZQ1FBYw!", float0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      rDFDataset0.addQuad(")xUstZQ1FBYw!", "", "@type", "CharMatcher.and(");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("_:http://www.w3.org/2001/XMLSchema#string", ")xUstZQ1FBYw!", "3fz:h:", "json-ld-1.0");
      assertFalse(rDFDataset_Quad0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      // Undeclared exception!
      try { 
        rDFDataset0.addTriple("tn!'ly", "tn!'ly", "/`N-H>#f|*");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      // Undeclared exception!
      try { 
        rDFDataset0.addTriple(")J", "lp* ^<~ kz\"", "", "pS:=(VeIngIf7[gT9}y", "pS:=(VeIngIf7[gT9}y");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.setNamespace("  ?pQ2", "UNX]P-K}PwT,9['b");
      Map<String, String> map0 = rDFDataset0.getNamespaces();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      Integer integer0 = new Integer(3494);
      try { 
        rDFDataset0.parseContext(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid local context: java.lang.Integer@0000000005
         //
         verifyException("com.github.jsonldjava.core.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode((String) null);
      Boolean boolean0 = Boolean.TRUE;
      Map<String, Object> map0 = rDFDataset_BlankNode0.toObject(boolean0);
      // Undeclared exception!
      try { 
        rDFDataset0.graphToRDF((String) null, map0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.RDFDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      Double double0 = new Double((-374.1843214954576));
      BiFunction<Object, Object, Double> biFunction0 = (BiFunction<Object, Object, Double>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(double0).when(biFunction0).apply(any() , any());
      rDFDataset0.replaceAll(biFunction0);
      // Undeclared exception!
      try { 
        rDFDataset0.addTriple("", "com.google.common.base.CharMatcher$InRange", "http://www.w3.org/2001/XMLSchema#double");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.util.ArrayList
         //
         verifyException("com.github.jsonldjava.core.RDFDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("OW|]%F2~d3jhgNd!T");
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      // Undeclared exception!
      try { 
        rDFDataset0.addQuad((String) null, "http://www.w3.org/1999/02/22-rdf-syntax-ns#langString", "json-ld-1.1", "A(.ZtM$WXoIE@m1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      Integer integer0 = new Integer((short) (-1));
      rDFDataset0.putIfAbsent("jX^#sD1WKV\"tg", integer0);
      // Undeclared exception!
      try { 
        rDFDataset0.addQuad("@value", ";<vt:j", "", "jX^#sD1WKV\"tg");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.util.ArrayList
         //
         verifyException("com.github.jsonldjava.core.RDFDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("(<qfNQ)w,9&x^2S", "RL%M]{}*", "RL%M]{}*", "(<qfNQ)w,9&x^2S", "RL%M]{}*", "~_<Lb *c");
      int int0 = rDFDataset_Quad0.compareTo((RDFDataset.Quad) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("WEAK_MASK", "WEAK_MASK", "_:json-ld-1.1");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_Literal0, rDFDataset_Literal0, rDFDataset_Literal0, "_:json-ld-1.1");
      assertEquals(4, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      List<RDFDataset.Quad> list0 = rDFDataset0.getQuads("c _u4Q/V,OYgA{");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      // Undeclared exception!
      try { 
        rDFDataset0.addTriple((String) null, "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      // Undeclared exception!
      try { 
        rDFDataset0.graphToRDF((String) null, rDFDataset0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.ArrayList cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.RDFDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Float float0 = new Float(1506.2523F);
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(")xUstZQ1FBYw!", float0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("_:http://www.w3.org/2001/XMLSchema#string", ")xUstZQ1FBYw!", "3fz:h:", "json-ld-1.0");
      rDFDataset0.graphToRDF("e+!!P&F", rDFDataset_Quad0);
      assertFalse(rDFDataset_Quad0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.addQuad("GS ^FC5Y", "GS ^FC5Y", "GS ^FC5Y", "GS ^FC5Y", "GS ^FC5Y", "GS ^FC5Y");
      rDFDataset0.getQuads("GS ^FC5Y");
      assertEquals(2, rDFDataset0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Float float0 = new Float((-1773.22088985));
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(float0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      // Undeclared exception!
      try { 
        rDFDataset0.addQuad((String) null, "", "", "http://www.w3.org/2001/XMLSchema#decimal", "com.github.jsonldjava.core.Context", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      // Undeclared exception!
      try { 
        rDFDataset0.parseContext("5\"VPZ'+GtXf||");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 1: 5\"VPZ'+GtXf||
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.parseContext((Object) null);
      assertFalse(rDFDataset0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      Map<String, Object> map0 = rDFDataset0.getContext();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("8#", "!Q&#fK_*|<8K-", "!Q&#fK_*|<8K-");
      RDFDataset.Literal rDFDataset_Literal1 = new RDFDataset.Literal("8#", (String) null, (String) null);
      int int0 = rDFDataset_Literal0.compareTo((RDFDataset.Node) rDFDataset_Literal1);
      assertEquals((-1), int0);
      assertFalse(rDFDataset_Literal1.isIRI());
      assertTrue(rDFDataset_Literal1.isLiteral());
      assertEquals(3, rDFDataset_Literal1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("", "json-ld-1.1", (String) null);
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("51o,](wN(759-", "json-ld-1.1", "", "", "json-ld-1.0", "json-ld-1.1");
      RDFDataset.Node rDFDataset_Node0 = rDFDataset_Quad0.getObject();
      int int0 = rDFDataset_Literal0.compareTo(rDFDataset_Node0);
      assertEquals(3, rDFDataset_Literal0.size());
      assertFalse(rDFDataset_Node0.isBlankNode());
      assertFalse(rDFDataset_Node0.isIRI());
      assertEquals(1, int0);
      assertTrue(rDFDataset_Node0.isLiteral());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("RKsIu.6+|.E", "js", (String) null);
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("%&frl@Z");
      Map<String, Object> map0 = rDFDataset_Literal0.toObject(jsonLdOptions0.useNamespaces);
      assertEquals(3, rDFDataset_Literal0.size());
      assertEquals(2, map0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("Dn", "Dn", "Dn");
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      Map<String, Object> map0 = rDFDataset_Literal0.toObject(jsonLdOptions0.useNamespaces);
      assertEquals(4, rDFDataset_Literal0.size());
      assertEquals(2, map0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("@vocab", "@vocab", "2lpVW]I", "G|\"Y jTALYp<#6$s");
      RDFDataset.IRI rDFDataset_IRI0 = (RDFDataset.IRI)rDFDataset_Quad0.getSubject();
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("qiVU:I,K,");
      Map<String, Object> map0 = rDFDataset_IRI0.toObject((Boolean) jsonLdOptions0.DEFAULT_COMPACT_ARRAYS);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("'UHX2ole+Xx'U!Y)$");
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("name", "com.fasterxml.jackson.databind.node.IntNode", "com.google.common.base.FunctionalEquivalence");
      int int0 = rDFDataset_Literal0.compareTo((RDFDataset.Node) rDFDataset_BlankNode0);
      assertEquals(4, rDFDataset_Literal0.size());
      assertFalse(rDFDataset_BlankNode0.isIRI());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("WF`}4$cU", "WF`}4$cU", "WF`}4$cU");
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI("WF`}4$cU");
      int int0 = rDFDataset_Literal0.compareTo((RDFDataset.Node) rDFDataset_IRI0);
      assertTrue(rDFDataset_Literal0.isLiteral());
      assertEquals(4, rDFDataset_Literal0.size());
      assertEquals((-1), int0);
      assertTrue(rDFDataset_IRI0.isIRI());
      assertFalse(rDFDataset_Literal0.isIRI());
      assertFalse(rDFDataset_Literal0.isBlankNode());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("5");
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("R$", "5", "<DmM30&$");
      int int0 = rDFDataset_BlankNode0.compareTo((RDFDataset.Node) rDFDataset_Literal0);
      assertEquals(4, rDFDataset_Literal0.size());
      assertFalse(rDFDataset_BlankNode0.isIRI());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("http://www.w3.org/2001/XMLSchema#string");
      int int0 = rDFDataset_BlankNode0.compareTo((RDFDataset.Node) rDFDataset_BlankNode0);
      assertFalse(rDFDataset_BlankNode0.isIRI());
      assertTrue(rDFDataset_BlankNode0.isBlankNode());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("http://www.w3.org/1999/02/22-rdf-syntax-ns#langString");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("e53\"lDM", "", "", "e53\"lDM");
      RDFDataset.Node rDFDataset_Node0 = rDFDataset_Quad0.getPredicate();
      int int0 = rDFDataset_Node0.compareTo((RDFDataset.Node) rDFDataset_BlankNode0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("@default", "wFk>K[c~k55UD?", "wFk>K[c~k55UD?");
      int int0 = rDFDataset_Literal0.compareTo((RDFDataset.Node) null);
      assertEquals(1, int0);
      assertEquals(4, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI("`R");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_IRI0, rDFDataset_IRI0, rDFDataset_IRI0, "com.google.common.hash.Funnels$SequentialFunnel");
      RDFDataset.Quad rDFDataset_Quad1 = new RDFDataset.Quad("`R", "", "`R", "com.google.common.hash.Funnels$SequentialFunnel");
      int int0 = rDFDataset_Quad0.compareTo(rDFDataset_Quad1);
      assertEquals(2, int0);
      assertTrue(rDFDataset_IRI0.isIRI());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI(")xUstZQ1FBYw!");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("_:http://www.w3.org/2001/XMLSchema#string", ")xUstZQ1FBYw!", "3fz:h:", "json-ld-1.0");
      RDFDataset.Quad rDFDataset_Quad1 = new RDFDataset.Quad(rDFDataset_IRI0, rDFDataset_IRI0, rDFDataset_IRI0, "json-ld-1.0");
      int int0 = rDFDataset_Quad0.compareTo(rDFDataset_Quad1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("com.fasterxml.jackson.databind.node.IntNode", "com.fasterxml.jackson.databind.node.IntNode", "com.fasterxml.jackson.databind.node.IntNode", "5\"");
      RDFDataset.Quad rDFDataset_Quad1 = new RDFDataset.Quad("name", "Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", "Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", "7", "7", ")@n%F bq[");
      int int0 = rDFDataset_Quad0.compareTo(rDFDataset_Quad1);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.addQuad("qiVU:I,K,", "qiVU:I,K,", "", (String) null);
      assertEquals(1, rDFDataset0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("", "2FTMdJAFOc|HT^#Yoz", "~hd");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_Literal0, rDFDataset_Literal0, rDFDataset_Literal0, (String) null);
      assertEquals(4, rDFDataset_Literal0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("^[-+]?[0-9]+$", "json-ld-1.1", "_:4?*{9Xxg/^U", "json-ld-1.1");
      assertFalse(rDFDataset_Quad0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("e53\"lDM", "", "", "e53\"lDM");
      RDFDataset.Node rDFDataset_Node0 = rDFDataset_Quad0.getPredicate();
      boolean boolean0 = rDFDataset_Node0.isIRI();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("");
      boolean boolean0 = rDFDataset_BlankNode0.isBlankNode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("");
      boolean boolean0 = rDFDataset_BlankNode0.isLiteral();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("http://www.w3.org/1999/02/22-rdf-syntax-ns#langString");
      boolean boolean0 = rDFDataset_BlankNode0.isIRI();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Byte byte0 = new Byte((byte)114);
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("");
      JsonLdApi jsonLdApi0 = new JsonLdApi(byte0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      Map<String, String> map0 = rDFDataset0.getNamespaces();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0, false);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      String string0 = rDFDataset0.getNamespace(";7}8}IE%iyVtGl~r^9");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.clearNamespaces();
      assertFalse(rDFDataset0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      // Undeclared exception!
      try { 
        rDFDataset0.addTriple((String) null, "lists of lists are not permitted.", "\\L[;I*T?", "!Q&#fK_*|<8K-", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.setNamespace(";/^kLS,JTG9=", "");
      Map<String, Object> map0 = rDFDataset0.getContext();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Byte byte0 = new Byte((byte)114);
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("");
      JsonLdApi jsonLdApi0 = new JsonLdApi(byte0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      Set<String> set0 = rDFDataset0.graphNames();
      assertFalse(set0.contains(""));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI(")xUstZQ1FBYw!");
      boolean boolean0 = rDFDataset_IRI0.isLiteral();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("5\"VPZ'+GtXf||", "5\"VPZ'+GtXf||", "", "^}OqJI54!\")+Qcqx7*", "^}OqJI54!\")+Qcqx7*", "");
      assertEquals(4, rDFDataset_Quad0.size());
      
      int int0 = rDFDataset_Quad0.compareTo(rDFDataset_Quad0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("", "json-ld-1.1", (String) null);
      Map<String, Object> map0 = rDFDataset_Literal0.toObject((Boolean) true);
      assertEquals(2, map0.size());
      assertEquals(3, rDFDataset_Literal0.size());
  }
}
