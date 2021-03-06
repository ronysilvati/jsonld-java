/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 13:51:02 GMT 2020
 */

package com.github.jsonldjava.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.jsonldjava.core.Context;
import com.github.jsonldjava.core.JsonLdApi;
import com.github.jsonldjava.core.JsonLdConsts;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.RDFDataset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonLdApi_ESTest extends JsonLdApi_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("invalid vocab mapping", "invalid vocab mapping", "The list of suffixes must not be null", "The list of suffixes must not be null");
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(rDFDataset_Quad0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset();
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0, (boolean) jsonLdOptions0.useNamespaces);
      // Undeclared exception!
      try { 
        jsonLdApi0.frame(list0, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      ArrayList<JsonLdConsts.Embed> arrayList0 = new ArrayList<JsonLdConsts.Embed>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(1536);
      jsonLdApi0.generateNodeMap(arrayList0, hashMap0, "", jsonLdOptions0, "", hashMap0);
      assertNull(jsonLdOptions0.getExplicit());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Context context0 = new Context();
      jsonLdApi0.generateNodeMap(arrayList0, context0);
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<RDFDataset.Quad> arrayList0 = new ArrayList<RDFDataset.Quad>();
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(arrayList0, jsonLdOptions0);
      String string0 = jsonLdApi0.generateBlankNodeIdentifier("json-ld-1.0");
      assertEquals("_:b0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, jsonLdOptions0);
      Object object0 = jsonLdApi0.compact((Context) null, "", (Object) null, (boolean) jsonLdOptions0.useNamespaces);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, jsonLdOptions0);
      Object object0 = jsonLdApi0.compact((Context) null, "a}o$M$f] mhg|GM+W:", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi((JsonLdOptions) null);
      // Undeclared exception!
      try { 
        jsonLdApi0.toRDF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("G:80:d{a_pz2}z");
      JsonLdApi jsonLdApi0 = new JsonLdApi("com.github.jsonldjava.core.JsonLdApi$EmbedNode", jsonLdOptions0);
      jsonLdApi0.value = (Object) "G:80:d{a_pz2}z";
      // Undeclared exception!
      try { 
        jsonLdApi0.toRDF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonLdConsts.Embed jsonLdConsts_Embed0 = JsonLdConsts.Embed.LINK;
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("value");
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdConsts_Embed0, jsonLdOptions0);
      Context context0 = jsonLdApi0.context;
      // Undeclared exception!
      try { 
        jsonLdApi0.normalize(context0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.List
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("]}:o~!(7sg6");
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, jsonLdOptions0);
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap((Object) null, (Map<String, Object>) null, "]}:o~!(7sg6", jsonLdOptions0.useNamespaces, (String) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("");
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap((Object) null, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, jsonLdOptions0);
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap("&A", (Map<String, Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      // Undeclared exception!
      try { 
        jsonLdApi0.fromRDF((RDFDataset) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.put("_:b0", "_:b0");
      // Undeclared exception!
      try { 
        jsonLdApi0.fromRDF(rDFDataset0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.List
         //
         verifyException("com.github.jsonldjava.core.RDFDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(object0, object0, jsonLdOptions0);
      // Undeclared exception!
      try { 
        jsonLdApi0.fromRDF((RDFDataset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.put("&BdL3zbZj'.]1Yx#lHA", "&BdL3zbZj'.]1Yx#lHA");
      // Undeclared exception!
      try { 
        jsonLdApi0.fromRDF(rDFDataset0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.List
         //
         verifyException("com.github.jsonldjava.core.RDFDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      Context context0 = new Context();
      LinkedHashMap<JsonLdConsts.Embed, Object> linkedHashMap0 = new LinkedHashMap<JsonLdConsts.Embed, Object>();
      JsonLdConsts.Embed jsonLdConsts_Embed0 = JsonLdConsts.Embed.LAST;
      linkedHashMap0.put(jsonLdConsts_Embed0, jsonLdApi0);
      // Undeclared exception!
      try { 
        jsonLdApi0.expand(context0, "loh/4P1v eM#e3WVR", (Object) linkedHashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.github.jsonldjava.core.JsonLdConsts$Embed cannot be cast to java.lang.String
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("H N2&(s^\"kE'4");
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("A =sr,y`,[7F+_}m&&;");
      Context context0 = new Context(rDFDataset_BlankNode0);
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("_:b", "H N2&(s^\"kE'4", "rh>ZS#OyNgvSA]|/", "H N2&(s^\"kE'4");
      rDFDataset_Quad0.put("Invalid HTTP host: ", (Object) null);
      // Undeclared exception!
      try { 
        jsonLdApi0.compact(context0, "q_{dbb", (Object) rDFDataset_Quad0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("Z}^o0-*z");
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      Context context0 = new Context(jsonLdOptions0);
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("value of ", "", "json-ld-1.1", "a\"sMJJ4>+CXGhpdt");
      // Undeclared exception!
      try { 
        jsonLdApi0.compact(context0, "", (Object) rDFDataset_Quad0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.github.jsonldjava.core.RDFDataset$IRI cannot be cast to java.util.List
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashMap<Integer, String> linkedHashMap0 = new LinkedHashMap<Integer, String>();
      JsonLdApi jsonLdApi0 = null;
      try {
        jsonLdApi0 = new JsonLdApi(linkedHashMap0, linkedHashMap0, (JsonLdOptions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RDFDataset rDFDataset0 = new RDFDataset();
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal((String) null, (String) null, (String) null);
      rDFDataset0.graphToRDF((String) null, rDFDataset_Literal0);
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions(";a^s8J>O0y7S:h:}");
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, jsonLdOptions0);
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0, true);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, (Object) null, jsonLdOptions0);
      Context context0 = jsonLdApi0.context;
      Object object0 = jsonLdApi0.expand(context0, (String) null, (Object) jsonLdOptions0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions((String) null);
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      Context context0 = new Context();
      Object object0 = jsonLdApi0.expand(context0, (String) null, (Object) context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      Context context0 = new Context();
      LinkedHashMap linkedHashMap0 = (LinkedHashMap)jsonLdApi0.expand(context0, "]5n+u", (Object) context0);
      assertEquals(0, linkedHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(303);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(integer0, arrayList0, jsonLdOptions0);
      // Undeclared exception!
      try { 
        jsonLdApi0.expand((Context) null, "C=B(0~G{RaLap", (Object) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("sO^-RZ-a@k7ct");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_BlankNode0, rDFDataset_BlankNode0, rDFDataset_BlankNode0, "sO^-RZ-a@k7ct");
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(rDFDataset_Quad0, "sO^-RZ-a@k7ct", jsonLdOptions0);
      Context context0 = new Context(jsonLdOptions0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ArrayList arrayList1 = (ArrayList)jsonLdApi0.expand(context0, "http://www.w3.org/1999/02/22-rdf-syntax-ns#rest", (Object) arrayList0);
      assertEquals(0, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonLdConsts.Embed jsonLdConsts_Embed0 = JsonLdConsts.Embed.LINK;
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdConsts_Embed0, jsonLdConsts_Embed0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      Context context0 = new Context((Map<String, Object>) rDFDataset0, jsonLdOptions0);
      Object object0 = jsonLdApi0.compact(context0, "e3`ud&5RDI@jD", (Object) rDFDataset0, false);
      jsonLdApi0.generateNodeMap(object0, context0, (String) null);
      assertEquals(3, context0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      Context context0 = new Context();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ArrayList arrayList1 = (ArrayList)jsonLdApi0.compact(context0, "", (Object) arrayList0, true);
      assertTrue(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi((JsonLdOptions) null);
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      // Undeclared exception!
      try { 
        jsonLdApi0.normalize(linkedHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.NormalizeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      rDFDataset0.put("+M80@$boa", arrayList0);
      RDFDataset rDFDataset1 = (RDFDataset)jsonLdApi0.normalize(rDFDataset0);
      assertEquals(1, rDFDataset1.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      ArrayList<JsonLdConsts.Embed> arrayList0 = new ArrayList<JsonLdConsts.Embed>();
      Object object0 = jsonLdApi0.compact((Context) null, "_:b1", (Object) arrayList0, false);
      Boolean boolean0 = new Boolean("*0Y|ozoVcnq]Q8a");
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("wB%");
      JsonLdApi jsonLdApi1 = new JsonLdApi(object0, boolean0, jsonLdOptions0);
      RDFDataset rDFDataset0 = jsonLdApi1.toRDF();
      rDFDataset0.addQuad("_:b1", "predicate", "frame @type must be an array", "-Y6It", "value", "wB%");
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0);
      List<Object> list1 = jsonLdApi0.frame(rDFDataset0, list0);
      LinkedHashMap<Integer, Object> linkedHashMap0 = new LinkedHashMap<Integer, Object>();
      List<Object> list2 = jsonLdApi0.frame(linkedHashMap0, list1);
      assertEquals(0, list2.size());
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      rDFDataset0.put("+M80@$boa", arrayList0);
      List<Object> list1 = jsonLdApi0.frame(rDFDataset0, list0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      Context context0 = new Context();
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal((String) null, "json-ld-1.0", "_:_:b2");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_Literal0, rDFDataset_Literal0, rDFDataset_Literal0, (String) null);
      Object object0 = jsonLdApi0.expand(context0, (Object) rDFDataset_Quad0);
      LinkedHashMap<Object, Object> linkedHashMap0 = new LinkedHashMap<Object, Object>();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add(object0);
      // Undeclared exception!
      try { 
        jsonLdApi0.frame(linkedHashMap0, arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      LinkedHashMap<Object, JsonLdConsts.Embed> linkedHashMap0 = new LinkedHashMap<Object, JsonLdConsts.Embed>();
      List<Object> list0 = jsonLdApi0.frame(linkedHashMap0, (List<Object>) null);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("Z}^o0-*z");
      jsonLdOptions0.setOmitDefault((Boolean) jsonLdOptions0.DEFAULT_COMPACT_ARRAYS);
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset();
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0, true);
      // Undeclared exception!
      try { 
        jsonLdApi0.frame("Z}^o0-*z", list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      jsonLdOptions0.setExplicit((Boolean) jsonLdOptions0.DEFAULT_COMPACT_ARRAYS);
      JsonLdConsts.Embed jsonLdConsts_Embed0 = jsonLdOptions0.getEmbedVal();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdConsts_Embed0, jsonLdOptions0, jsonLdOptions0);
      Vector<Object> vector0 = new Vector<Object>();
      // Undeclared exception!
      try { 
        jsonLdApi0.frame(jsonLdConsts_Embed0, vector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.github.jsonldjava.core.JsonLdConsts$Embed cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("@id");
      JsonLdApi jsonLdApi0 = new JsonLdApi("Oc*%L/", jsonLdOptions0);
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("json-ld-1.1", "Oc*%L/", "Oc*%L/", (String) null);
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap(rDFDataset_Quad0, rDFDataset_Quad0, "@index");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset.BlankNode rDFDataset_BlankNode0 = new RDFDataset.BlankNode("json-ld-1.0");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_BlankNode0, rDFDataset_BlankNode0, rDFDataset_BlankNode0, "json-ld-1.1");
      LinkedHashMap<String, Integer> linkedHashMap0 = new LinkedHashMap<String, Integer>();
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap(rDFDataset_Quad0, rDFDataset_BlankNode0, "@explicit", linkedHashMap0, (String) null, rDFDataset_BlankNode0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("?cK-t=");
      JsonLdApi jsonLdApi0 = new JsonLdApi((Object) null, jsonLdOptions0);
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal("name", "Expected ", "Expected ");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_Literal0, rDFDataset_Literal0, rDFDataset_Literal0, "g27n");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap(rDFDataset_Quad0, rDFDataset_Quad0, "json-ld-1.0", object0, "json-ld-1.0", rDFDataset_Quad0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("@id");
      JsonLdApi jsonLdApi0 = new JsonLdApi("Oc*%L/", jsonLdOptions0);
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad("json-ld-1.1", "Oc*%L/", "Oc*%L/", (String) null);
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap(rDFDataset_Quad0, rDFDataset_Quad0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      Context context0 = new Context();
      RDFDataset.Literal rDFDataset_Literal0 = new RDFDataset.Literal((String) null, "json-ld-1.0", "_:_:b2");
      RDFDataset.Quad rDFDataset_Quad0 = new RDFDataset.Quad(rDFDataset_Literal0, rDFDataset_Literal0, rDFDataset_Literal0, (String) null);
      rDFDataset_Quad0.put("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", "_:_:b2");
      LinkedHashMap linkedHashMap0 = (LinkedHashMap)jsonLdApi0.expand(context0, (Object) rDFDataset_Quad0);
      assertFalse(linkedHashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Object object0 = new Object();
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("");
      JsonLdApi jsonLdApi0 = new JsonLdApi(boolean0, object0, jsonLdOptions0);
      Context context0 = new Context();
      RDFDataset.IRI rDFDataset_IRI0 = new RDFDataset.IRI(">(j1%T<0XKYQ|");
      rDFDataset_IRI0.put("_:_:b3", boolean0);
      LinkedHashMap linkedHashMap0 = (LinkedHashMap)jsonLdApi0.expand(context0, "", (Object) rDFDataset_IRI0);
      assertEquals(1, linkedHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add((String) null);
      // Undeclared exception!
      try { 
        jsonLdApi0.expand((Context) null, (String) null, (Object) arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      Object object0 = jsonLdApi0.expand((Context) null, "\"^r?R<&b}Bb)", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("@id");
      JsonLdApi jsonLdApi0 = new JsonLdApi("Oc*%L/", jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.addTriple("Oc*%L/", "tsT!w]", "@id", "json-ld-1.1", "S");
      Context context0 = new Context((Map<String, Object>) rDFDataset0, jsonLdOptions0);
      // Undeclared exception!
      try { 
        jsonLdApi0.compact(context0, "xp", (Object) rDFDataset0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.github.jsonldjava.core.RDFDataset$Literal cannot be cast to java.util.List
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("@id");
      JsonLdApi jsonLdApi0 = new JsonLdApi("Oc*%L/", jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset();
      Context context0 = new Context((Map<String, Object>) rDFDataset0, jsonLdOptions0);
      rDFDataset0.put("@id", "@id");
      LinkedHashMap linkedHashMap0 = (LinkedHashMap)jsonLdApi0.compact(context0, "xp", (Object) rDFDataset0);
      assertEquals(2, linkedHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      JsonLdConsts.Embed jsonLdConsts_Embed0 = JsonLdConsts.Embed.LINK;
      arrayList0.add((Object) jsonLdConsts_Embed0);
      // Undeclared exception!
      try { 
        jsonLdApi0.compact((Context) null, "", (Object) arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions("The filters must not be null");
      JsonLdApi jsonLdApi0 = new JsonLdApi("The filters must not be null", "The filters must not be null", jsonLdOptions0);
      Context context0 = new Context();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("json-ld-1.0");
      ArrayList arrayList1 = (ArrayList)jsonLdApi0.compact(context0, "json-ld-1.0", (Object) arrayList0, (boolean) jsonLdOptions0.useNamespaces);
      assertFalse(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      JsonLdApi jsonLdApi0 = null;
      try {
        jsonLdApi0 = new JsonLdApi(arrayList0, (JsonLdOptions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions(" (one known property: \"");
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0.useNamespaces, jsonLdOptions0, jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset();
      rDFDataset0.addTriple("ty", "value of @id must be a string, an array of strings or an empty dictionary", "@link");
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      RDFDataset rDFDataset0 = new RDFDataset();
      // Undeclared exception!
      try { 
        jsonLdApi0.expand((Context) null, (Object) rDFDataset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonLdApi jsonLdApi0 = new JsonLdApi();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Context context0 = new Context(linkedHashMap0);
      // Undeclared exception!
      try { 
        jsonLdApi0.generateNodeMap((Object) null, context0, "@graph");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      String string0 = jsonLdApi0.generateBlankNodeIdentifier();
      assertEquals("_:b0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonLdOptions jsonLdOptions0 = new JsonLdOptions();
      JsonLdApi jsonLdApi0 = new JsonLdApi(jsonLdOptions0);
      RDFDataset rDFDataset0 = new RDFDataset(jsonLdApi0);
      List<Object> list0 = jsonLdApi0.fromRDF(rDFDataset0);
      List<Object> list1 = jsonLdApi0.frame(rDFDataset0, list0);
      // Undeclared exception!
      try { 
        jsonLdApi0.expand((Context) null, (String) null, (Object) list1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.core.JsonLdApi", e);
      }
  }
}
