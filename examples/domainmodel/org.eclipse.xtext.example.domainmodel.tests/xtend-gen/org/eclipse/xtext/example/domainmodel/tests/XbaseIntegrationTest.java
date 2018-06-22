package org.eclipse.xtext.example.domainmodel.tests;

import org.eclipse.xtext.example.domainmodel.domainmodel.DomainModel;
import org.eclipse.xtext.example.domainmodel.tests.DomainmodelInjectorProvider;

/**
 * Xbase integration test.
 * 
 * runs all Xbase tests from {@link AbstractXbaseEvaluationTest} in the context of an
 * entity operation.
 * 
 * Unsupported features can be disabled by overriding the respective test method.
 * 
 * @author Sven Efftinge
 */
/* @RunWith(/* name is null */)
@InjectWith(DomainmodelInjectorProvider.class) */@SuppressWarnings("all")
public class XbaseIntegrationTest /* implements AbstractXbaseEvaluationTest  */{
  /* @Inject
   */private /* OnTheFlyJavaCompiler2 */Object javaCompiler;
  
  /* @Inject
   */private /* ParseHelper<DomainModel> */Object parseHelper;
  
  /* @Inject
   */private /* ValidationTestHelper */Object validationHelper;
  
  /* @Inject
   */private /* JvmModelGenerator */Object generator;
  
  @Override
  protected Object invokeXbaseExpression(final String expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nInMemoryFileSystemAccess cannot be resolved."
      + "\nThe field XbaseIntegrationTest.parseHelper refers to the missing type ParseHelper"
      + "\nThe field XbaseIntegrationTest.validationHelper refers to the missing type ValidationTestHelper"
      + "\nThe field XbaseIntegrationTest.generator refers to the missing type JvmModelGenerator"
      + "\nThe field XbaseIntegrationTest.javaCompiler refers to the missing type OnTheFlyJavaCompiler2"
      + "\nparse cannot be resolved"
      + "\nassertNoErrors cannot be resolved"
      + "\ndoGenerate cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ngetTextFiles cannot be resolved"
      + "\nvalues cannot be resolved"
      + "\niterator cannot be resolved"
      + "\nnext cannot be resolved"
      + "\ncompileToClass cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nnewInstance cannot be resolved"
      + "\ngetDeclaredMethod cannot be resolved"
      + "\ninvoke cannot be resolved");
  }
}
