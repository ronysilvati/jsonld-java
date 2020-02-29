/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 13:49:12 GMT 2020
 */

package com.github.jsonldjava.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.jsonldjava.utils.JsonLdUrl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonLdUrl_ESTest extends JsonLdUrl_ESTest_scaffolding {

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeBase realmente 
   * retorna uma string nula, ao receber parâmetros nulos
   * ----------------------------------------------------------
  */	
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = JsonLdUrl.removeBase((Object) null, (String) null);
      assertNull(string0);
  }

  /**
   * COMPREENSÍVEL: Em partes
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Não consegui compreender corretamente o funciona
   * mento do método removeBase nesse caso.
   * ----------------------------------------------------------
  */	
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonLdUrl jsonLdUrl0 = new JsonLdUrl();
      String string0 = JsonLdUrl.removeBase(jsonLdUrl0, ".");
      assertEquals(".", string0);
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método resolve, gera uma exceção
   * ao receber uma Url não muito bem formada.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        JsonLdUrl.resolve("", "Ij:SPr+T~B+]l}H-T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in opaque part at index 13: Ij:SPr+T~B+]l}H-T
         //
         verifyException("java.net.URI", e);
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeDotSegments, gera uma exceção
   * ao receber uma url nula.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        JsonLdUrl.removeDotSegments((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.utils.JsonLdUrl", e);
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeBase, gera uma exceção
   * ao receber uma url nula.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonLdUrl jsonLdUrl0 = new JsonLdUrl();
      // Undeclared exception!
      try { 
        JsonLdUrl.removeBase(jsonLdUrl0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.jsonldjava.utils.JsonLdUrl", e);
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeBase, gera uma exceção
   * ao receber um objeto que não é instancia de JsonLdUrl
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        JsonLdUrl.removeBase(object0, (String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.github.jsonldjava.utils.JsonLdUrl
         //
         verifyException("com.github.jsonldjava.utils.JsonLdUrl", e);
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método parse, gera uma exceção
   * ao tentar fazer parse em uma string nula
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        JsonLdUrl.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeDotSegments realmente
   * remove todos os pontos de uma string
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = JsonLdUrl.removeDotSegments("..", true);
      assertEquals("", string0);
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO:Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeDotSegments realmente
   * inaltera uma string quando essa não contém pontos.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = JsonLdUrl.removeDotSegments("a]/", false);
      assertEquals("a]/", string0);
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO: Não, o teste anterior já resolve.
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método removeDotSegments realmente
   * inaltera uma string quando essa não contém pontos.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = JsonLdUrl.removeDotSegments("/^c", true);
      assertEquals("/^c", string0);
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: Verifica se o método parse realmente
   * gera uma exceção ao receber uma string vazia.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        JsonLdUrl.parse("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  // Evosuite gerou um total de 23 testes. Alguns testes foram omitidos.
}