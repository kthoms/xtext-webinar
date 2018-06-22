package org.eclipse.xtext.example.domainmodel.tests;

import org.eclipse.xtext.example.domainmodel.tests.DomainmodelInjectorProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;

/* @RunWith(/* name is null */)
@InjectWith(DomainmodelInjectorProvider.class) */@SuppressWarnings("all")
public class CompilerTest {
  /* @Rule
  @Inject
   */public /* TemporaryFolder */Object temporaryFolder;
  
  /* @Inject */@Extension
  private /* CompilationTestHelper */Object _compilationTestHelper;
  
  /* @Inject */@Extension
  private ReflectExtensions _reflectExtensions;
  
  /* @Test
   */public void testGeneratedJava() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compile((Object)=>Object) is undefined for the type CharSequence"
      + "\nThe method or field compiledClass is undefined for the type Object"
      + "\nThe method assertEquals(String, Object) is undefined"
      + "\nnewInstance cannot be resolved"
      + "\ninvoke cannot be resolved"
      + "\ninvoke cannot be resolved");
  }
  
  /* @Test
   */public void testGeneratedJavaFromSeveralInputs() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compile((Object)=>Object) is undefined for the type List<String>"
      + "\nThe method getCompiledClass(String) is undefined for the type Object"
      + "\nThe method getCompiledClass(String) is undefined for the type Object"
      + "\nThe method assertEquals(String, Object) is undefined"
      + "\nnewInstance cannot be resolved"
      + "\ninvoke cannot be resolved"
      + "\nnewInstance cannot be resolved"
      + "\ninvoke cannot be resolved"
      + "\ninvoke cannot be resolved");
  }
  
  /* @Test
   */public void compareGeneratedJava() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compile((Object)=>Object) is undefined for the type CharSequence"
      + "\nThe method assertEquals(String, Object) is undefined"
      + "\nThe method or field getSingleGeneratedCode is undefined");
  }
}
